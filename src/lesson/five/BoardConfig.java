package lesson.five;

public class BoardConfig extends Game {

    final private static String[][] board = new String[3][3];

    public void seeBoard() {
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setChoose() {
        if ((!board[getLine()][getColumn()].equals("0")) || (!board[getLine()][getColumn()].equals("X"))) {
            board[getLine()][getColumn()] = getChoice();
        } else System.out.println("This place is already occupied!");
    }

    public void setNoNulls(){
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                board[i][j] = "-";
            }
        }
    }

    private boolean stopPoint = false;

    public void winCheck() {
        if (board[0][0].equals("0") && board[0][1].equals("0") && board[0][2].equals("0")) { // 0 0 0 - win
            stopPoint = true;
            System.out.println("0 player won");
        } else if (board[0][0].equals("0") && board[1][0].equals("0") && board[2][0].equals("0")) { // первый столбик o - win
            stopPoint = true;
            System.out.println("0 player won");
        } else if (board[0][0].equals("0") && board[1][1].equals("0") && board[2][2].equals("0")) { // \ диагональ o - win
            stopPoint = true;
            System.out.println("0 player won");
        } else if (board[0][1].equals("0") && board[1][1].equals("0") && board[2][1].equals("0")) { // второй столбик o - win
            stopPoint = true;
            System.out.println("0 player won");
        } else if (board[0][2].equals("0") && board[1][2].equals("0") && board[2][2].equals("0")) { // третий столбик o - win
            stopPoint = true;
            System.out.println("0 player won");
        } else if (board[0][2].equals("0") && board[1][1].equals("0") && board[2][0].equals("0")) { // / диагональ 0 - win
            System.out.println("0 player won");
            stopPoint = true;
        } else if (board[1][0].equals("0") && board[1][1].equals("0") && board[1][2].equals("0")) {
            stopPoint = true;
            System.out.println("0 player won"); // 0 0 0 - вторая линия
        } else if (board[2][0].equals("0") && board[2][1].equals("0") && board[2][2].equals("0")) {
            stopPoint = true;
            System.out.println("0 player won"); // 0 0 0 - третья линия
        } else if (board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("X")) { // x x x - win
            stopPoint = true;
            System.out.println("X player won");
        } else if (board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X")) { // первый столбик x - win
            stopPoint = true;
            System.out.println("X player won");
        } else if (board[0][0].equals("X") && board[1][1].equals("O") && board[2][2].equals("X")) { // \ диагональ x - win
            stopPoint = true;
            System.out.println("X player won");
        } else if (board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("X")) { // второй столбик x - win
            stopPoint = true;
            System.out.println("X player won");
        } else if (board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X")) { // третий столбик x - win
            stopPoint = true;
            System.out.println("X player won");
        } else if (board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")) { // / диагональ x - win
            stopPoint = true;
            System.out.println("X player won");
        } else if (board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X")) {
            stopPoint = true;
            System.out.println("X player won"); // X X X - вторая линия
        } else if (board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X")) {
            stopPoint = true;
            System.out.println("X player won"); // X X X - третья линия
        } else System.out.println("Noone won (yet)");
    }

//    public void checkIsBoardFull(){
//        for(int i = 1; i < board.length; i++){
//            for (int j = 1; j < board.length; j++) {
//                if (board[i][j].equals("0")  board[i][j].equals("X")){
//                    stopPoint = true;
//                    System.out.println("The board is full!");
//                }
//            }
//        }
//    }

    public boolean getStopPoint(){
        return stopPoint;
    }
}
