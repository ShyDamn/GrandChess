import javax.swing.*;
import java.util.*;

/*
1) Class Constructors
2) Getters & Setters
3) Piece Movement Methods
4) toString() Methods
5) Overridden Methods
6) Abstract Methods
*/

public abstract class Piece{
    private final ID name;
    private final COLOUR colour;
    private Coordinate coords;
    private final Coordinate OGcoord;
    private final String pieceID;
    private HashSet<Coordinate> potentialMoves = new HashSet<>();
    public int dimension = BOARD.LAST_RANK.getRankVal();
    public int single = BOARD.FIRST_RANK.getRankVal();
    private boolean hasMoved = false;
    public static Piece emptyPiece = new Rook(COLOUR.W,Coordinate.emptyCoordinate);

    //________________________________________________Class Constructors________________________________________________

    public Piece (ID name, COLOUR colour, Coordinate OGcoord) {

        Objects.requireNonNull(name, "������ ������ ���� ��������� ���������������� � ������� ID");
        Objects.requireNonNull(colour, "������ ������ ���� ���� �����, ���� ������.");
        Objects.requireNonNull(OGcoord, "��� ���������� ������������� ������ ������ ����� �������� ����������.");

        this.name = name;
        this.colour = colour;
        this.OGcoord = OGcoord;
        coords = OGcoord;
        pieceID = "*"+name.toString()+"*"+colour.toString()+"*"+OGcoord.getFile()+"*";
    }

    public Piece (Piece original) {
        Objects.requireNonNull(original,"�� �� ������ ������ � ������� ������");
        this.name = original.name;
        this.colour = original.colour;
        this.OGcoord = new Coordinate(original.OGcoord);
        this.coords = new Coordinate(original.coords);
        this.pieceID = original.pieceID;
        this.potentialMoves = new HashSet<>();

        for (Coordinate coord : original.getPotentialMoves()) {
            this.potentialMoves.add(new Coordinate(coord));
        }

        this.dimension = original.dimension;
        this.single = original.single;
        this.hasMoved = original.hasMoved;
    }

    //________________________________________________Getters & Setters________________________________________________

    public Coordinate getCoords() {
        return coords;
    }

    public char getFile() {
        return getCoords().getFile();
    }

    public int getRank() {
        return getCoords().getRank();
    }

    public COLOUR getColour() {
        return colour;
    }

    public ID getName() {
        return name;
    }

    public Coordinate getOGcoord() {
        return OGcoord;
    }

    public String getPieceID() {
        return pieceID;
    }

    public void setCoords(Coordinate coords) {
        this.coords = coords;
    }

    public boolean getHasMoved() {return hasMoved;}

    public void setHasMoved() {hasMoved = true;}

    public void addMoves(ArrayList<Coordinate> someMoves) {
        potentialMoves.addAll(someMoves);
    }

    public void clearMoves() {
        potentialMoves.clear();
    }

    public HashSet<Coordinate> getPotentialMoves() {
        return potentialMoves;
    }

    //________________________________________________Piece Movement Methods________________________________________________

    public ArrayList<Coordinate> removeOwnCheck(Pieces pieces) {

        King potentialKing = null;
        boolean removeKingCastle = false;
        boolean removeQueenCastle = false;

        ArrayList<Coordinate> potentials = getRawMoves(pieces);

        if (potentials.size() == 0)
            return potentials;

        Iterator<Coordinate> it = potentials.iterator();

        while (it.hasNext()) {
            Coordinate nextMove = it.next();
            Pieces p = new Pieces(pieces);
            p.pieceMove(nextMove, this.makeCopy());
            Coordinate kingPosition = p.findKing(getColour());
            HashSet<Coordinate> dangerMoves = p.allColouredRaws(COLOUR.not(getColour()));
            if (dangerMoves.contains(kingPosition))
                if (this.getName() == ID.KING) {
                    potentialKing = (King) this;
                    if (nextMove.equals(potentialKing.getTransitionCoordKingK())) {
                        it.remove();
                        removeKingCastle = true;
                    }
                    else if (nextMove.equals(potentialKing.getTransitionCoordKingQ())) {
                        it.remove();
                        removeQueenCastle = true;
                    }
                    else
                        it.remove();
                }
                else
                    it.remove();
        }
        if (potentialKing != null) {
            if (removeKingCastle)
                potentials.remove(potentialKing.getCastleCoordKingK());
            if (removeQueenCastle)
                potentials.remove(potentialKing.getCastleCoordKingQ());
        }

        return potentials;
    }
    public void updatePotentialMoves(Pieces pieces) {addMoves(removeOwnCheck(pieces));
    }
    public boolean isValidMove(Coordinate destination, COLOUR colour) {
        return getPotentialMoves().contains(destination) && getColour() == colour;
    }

    //________________________________________________toString() Methods________________________________________________

    @Override
    public String toString() { //standard PNG String
        return name.toString() + coords.toString();
    }

    /* public String toBoardString() {
        if (name == ID.PAWN)
            return "p" + colour.toSmallString();
        else
            return name.toString() + colour.toSmallString();
    }

    public String toFancyString() {
        return name.toFullString() + " �� " + coords.toString();
    } */

    //________________________________________________Overridden Methods________________________________________________

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piece piece = (Piece) o;
        return name == piece.name &&
                colour == piece.colour &&
                OGcoord.equals(piece.OGcoord) &&
                pieceID.equals(piece.pieceID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, colour, OGcoord, pieceID);
    }


    //________________________________________________Abstract Methods________________________________________________

    public abstract ArrayList<Coordinate> getRawMoves(Pieces pieces);

    public abstract ImageIcon getImageIcon();

    public abstract Piece makeCopy();
}
