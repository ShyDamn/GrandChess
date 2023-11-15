import java.util.HashMap;

public class Boards {

    public static HashMap<Coordinate, Piece> getChessBoard() {

        HashMap <Coordinate, Piece> pieces = new HashMap<>();

        int pawnBRank = 9;
        int bRank = 10;
        int pawnBRankTwo = 8;
        int pawnWRank = 2;
        int pawnWRankTwo = 3;
        int wRank = 1;

        //________________________________________________Black Pawns________________________________________________

        Pawn pawnBa = new Pawn(COLOUR.B, new Coordinate('a', pawnBRank));
        Pawn pawnBb = new Pawn(COLOUR.B, new Coordinate('b', pawnBRank));
        Pawn pawnBc = new Pawn(COLOUR.B, new Coordinate('c', pawnBRank));
        Pawn pawnBd = new Pawn(COLOUR.B, new Coordinate('d', pawnBRank));
        Pawn pawnBe = new Pawn(COLOUR.B, new Coordinate('e', pawnBRankTwo));
        Pawn pawnBf = new Pawn(COLOUR.B, new Coordinate('f', pawnBRankTwo));
        Pawn pawnBg = new Pawn(COLOUR.B, new Coordinate('g', pawnBRank));
        Pawn pawnBh = new Pawn(COLOUR.B, new Coordinate('h', pawnBRank));
        Pawn pawnBi = new Pawn(COLOUR.B, new Coordinate('i', pawnBRank));
        Pawn pawnBj = new Pawn(COLOUR.B, new Coordinate('j', pawnBRank));

        //________________________________________________Black Rooks________________________________________________

        Rook rookBa = new Rook(COLOUR.B, new Coordinate('a', bRank));
        Rook rookBj = new Rook(COLOUR.B, new Coordinate('j', bRank));

        //________________________________________________Black Knights________________________________________________

        Knight knightBb = new Knight(COLOUR.B, new Coordinate('b', bRank));
        Knight knightBi = new Knight(COLOUR.B, new Coordinate('i', bRank));

        //________________________________________________Black Bishops________________________________________________

        Bishop bishopBc = new Bishop(COLOUR.B, new Coordinate('c', bRank));
        Bishop bishopBh = new Bishop(COLOUR.B, new Coordinate('h', bRank));

        //________________________________________________Black Giraffe________________________________________________

        Giraffe GiraffeB = new Giraffe(COLOUR.B, new Coordinate('e', bRank));

        //________________________________________________White Vizar________________________________________________

        Vizar VizarB = new Vizar(COLOUR.B, new Coordinate('d', bRank));

        //________________________________________________White WarCar________________________________________________

        WarCar WarCarBe = new WarCar(COLOUR.B, new Coordinate('e', pawnBRank));
        WarCar WarCarBf = new WarCar(COLOUR.B, new Coordinate('f', pawnBRank));

        //________________________________________________Black Queen________________________________________________

        Queen queenB = new Queen(COLOUR.B, new Coordinate('g', bRank));

        //________________________________________________Black King________________________________________________

        King kingB = new King(COLOUR.B, new Coordinate('f', bRank));

        //________________________________________________White Pawns________________________________________________

        Pawn pawnWa = new Pawn(COLOUR.W, new Coordinate('a', pawnWRank));
        Pawn pawnWb = new Pawn(COLOUR.W, new Coordinate('b', pawnWRank));
        Pawn pawnWc = new Pawn(COLOUR.W, new Coordinate('c', pawnWRank));
        Pawn pawnWd = new Pawn(COLOUR.W, new Coordinate('d', pawnWRank));
        Pawn pawnWe = new Pawn(COLOUR.W, new Coordinate('e', pawnWRankTwo));
        Pawn pawnWf = new Pawn(COLOUR.W, new Coordinate('f', pawnWRankTwo));
        Pawn pawnWg = new Pawn(COLOUR.W, new Coordinate('g', pawnWRank));
        Pawn pawnWh = new Pawn(COLOUR.W, new Coordinate('h', pawnWRank));
        Pawn pawnWi = new Pawn(COLOUR.W, new Coordinate('i', pawnWRank));
        Pawn pawnWj = new Pawn(COLOUR.W, new Coordinate('j', pawnWRank));

        //________________________________________________White Rooks________________________________________________

        Rook rookWa = new Rook(COLOUR.W, new Coordinate('a', wRank));
        Rook rookWj = new Rook(COLOUR.W, new Coordinate('j', wRank));

        //________________________________________________White Knights________________________________________________

        Knight knightWb = new Knight(COLOUR.W, new Coordinate('b', wRank));
        Knight knightWi = new Knight(COLOUR.W, new Coordinate('i', wRank));

        //________________________________________________White Bishops________________________________________________

        Bishop bishopWc = new Bishop(COLOUR.W, new Coordinate('c', wRank));
        Bishop bishopWh = new Bishop(COLOUR.W, new Coordinate('h', wRank));

        //________________________________________________White Giraffe________________________________________________

        Giraffe GiraffeW = new Giraffe(COLOUR.W, new Coordinate('e', wRank));

        //________________________________________________White Vizar________________________________________________

        Vizar VizarW = new Vizar(COLOUR.W, new Coordinate('d', wRank));

        //________________________________________________White WarCar________________________________________________

        WarCar WarCarWe = new WarCar(COLOUR.W, new Coordinate('e', pawnWRank));
        WarCar WarCarWf = new WarCar(COLOUR.W, new Coordinate('f', pawnWRank));

        //________________________________________________White Queen________________________________________________

        Queen queenW = new Queen(COLOUR.W, new Coordinate('g', wRank));

        //________________________________________________White King________________________________________________

        King kingW = new King(COLOUR.W, new Coordinate('f', wRank));

        //________________________________________________Place Black in HashMap________________________________________________

        pieces.put(pawnBa.getCoords(), pawnBa);
        pieces.put(pawnBb.getCoords(), pawnBb);
        pieces.put(pawnBc.getCoords(), pawnBc);
        pieces.put(pawnBd.getCoords(), pawnBd);
        pieces.put(pawnBe.getCoords(), pawnBe);
        pieces.put(pawnBf.getCoords(), pawnBf);
        pieces.put(pawnBg.getCoords(), pawnBg);
        pieces.put(pawnBh.getCoords(), pawnBh);
        pieces.put(pawnBi.getCoords(), pawnBi);
        pieces.put(pawnBj.getCoords(), pawnBj);

        pieces.put(rookBa.getCoords(), rookBa);
        pieces.put(rookBj.getCoords(), rookBj);

        pieces.put(knightBb.getCoords(), knightBb);
        pieces.put(knightBi.getCoords(), knightBi);

        pieces.put(bishopBc.getCoords(), bishopBc);
        pieces.put(bishopBh.getCoords(), bishopBh);

        pieces.put(GiraffeB.getCoords(), GiraffeB);
        pieces.put(VizarB.getCoords(), VizarB);
        pieces.put(WarCarBe.getCoords(), WarCarBe);
        pieces.put(WarCarBf.getCoords(), WarCarBf);

        pieces.put(queenB.getCoords(), queenB);

        pieces.put(kingB.getCoords(), kingB);

        //________________________________________________Place White in HashMap________________________________________________

        pieces.put(pawnWa.getCoords(), pawnWa);
        pieces.put(pawnWb.getCoords(), pawnWb);
        pieces.put(pawnWc.getCoords(), pawnWc);
        pieces.put(pawnWd.getCoords(), pawnWd);
        pieces.put(pawnWe.getCoords(), pawnWe);
        pieces.put(pawnWf.getCoords(), pawnWf);
        pieces.put(pawnWg.getCoords(), pawnWg);
        pieces.put(pawnWh.getCoords(), pawnWh);
        pieces.put(pawnWi.getCoords(), pawnWi);
        pieces.put(pawnWj.getCoords(), pawnWj);

        pieces.put(rookWa.getCoords(), rookWa);
        pieces.put(rookWj.getCoords(), rookWj);

        pieces.put(knightWb.getCoords(), knightWb);
        pieces.put(knightWi.getCoords(), knightWi);

        pieces.put(bishopWc.getCoords(), bishopWc);
        pieces.put(bishopWh.getCoords(), bishopWh);

        pieces.put(GiraffeW.getCoords(), GiraffeW);
        pieces.put(VizarW.getCoords(), VizarW);
        pieces.put(WarCarWe.getCoords(), WarCarWe);
        pieces.put(WarCarWf.getCoords(), WarCarWf);

        pieces.put(queenW.getCoords(), queenW);

        pieces.put(kingW.getCoords(), kingW);

        return pieces;
    }
}
