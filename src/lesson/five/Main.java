package lesson.five;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square square = new Square(8);
        square.square(); // добавить Sys.o.p
        square.perimeter(); // добавить Sys.o.p
        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.square(); // добавить Sys.o.p
        rectangle.perimeter(); // добавить Sys.o.p
        StrCleaner strCleaner = new StrCleaner("Navalny is a good politician Navalny navalny");
        strCleaner.strCleaner();
        int line;
        int column;
        String choice;
        BoardConfig board = new BoardConfig();
        board.setNoNulls();
        board.seeBoard();
        try {
            while (!board.getStopPoint()) {
                System.out.println("Enter line and column number with X or 0");
                line = sc.nextInt();
                column = sc.nextInt();
                sc.nextLine();
                choice = sc.nextLine();
                if (!choice.equals("0") || !choice.equals("X") || !choice.equals("x")) {
                    System.out.println("You can use only x,X,0");
                    break;
                }
                board.playerChoice(line, column, choice);
                board.setChoose();
                board.seeBoard();
                board.winCheck();
//                board.checkIsBoardFull(); не придумал как проверить...
            }
        } catch (InputMismatchException e) {
            System.out.println("column and line shoud be Integer type and table size 3x3!");
        }
    }
}
