package lesson.five;

import java.util.Locale;

public class Game {

    private int line;
    private int column;
    private String choice;

    public void playerChoice (int line, int column, String choice) {
        this.line = line - 1;
        this.column = column - 1;
        this.choice = choice;
        this.choice = this.choice.toUpperCase(Locale.ROOT);
        System.out.println(" chose line " + (this.line + 1)+ " and column " + (this.column + 1));
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public String getChoice() {
        return choice;
    }
}
