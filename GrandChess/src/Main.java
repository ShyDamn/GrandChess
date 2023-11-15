import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Добро пожаловать в Великие Шахматы. Введите \"GUI\", чтобы играть в графическом интерфейсе пользователя.");

        Pieces pieces = new Pieces();

        boolean correctType = false;

        while (!correctType) {

            String gameType = sc.next();

            if (gameType.equals("GUI")) {
                pieces.setGUIGame(true);
                new GUIBoard(pieces);
                correctType = true;
            }
            else
                System.out.println("Неправильный формат игры. Пробуйте снова.");
        }




    }

}
