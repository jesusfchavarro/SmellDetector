package Detectors;

import org.antlr.v4.runtime.Token;

@SuppressWarnings({"unused", "unchecked", "WeakerAccess"})
public class Smell {
    int row;
    int col;
    String description;
    public String url = "https://refactoring.guru/refactoring/smells";

    public Smell(Token to, String description, String url) {
        this.row = to.getLine();
        this.col = to.getCharPositionInLine();
        this.description = description;
        this.url = url;
    }

    public Smell(Token to, String description) {
        this.row = to.getLine();
        this.col = to.getCharPositionInLine();
        this.description = description;
    }

    @Override
    public String toString() {
        return "Bad smell found in Line: " + row + ", Column: " + col
                + "\nDescription: " + description;
    }
}
