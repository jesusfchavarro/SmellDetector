package Detectors;

@SuppressWarnings({"unused", "unchecked", "WeakerAccess"})
public class Smell {
    int row;
    int col;
    String description;
    String url = "https://refactoring.guru/refactoring/smells";

    public Smell(int row, int col, String description, String url) {
        this.row = row;
        this.col = col;
        this.description = description;
        this.url = url;
    }

    public Smell(int row, int col, String description) {
        this.row = row;
        this.col = col;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Bad smell found in Line: " + row + ", Column: " + col
                + "\nDescription: " + description
                + "\nFor more information: " + url;
    }
}
