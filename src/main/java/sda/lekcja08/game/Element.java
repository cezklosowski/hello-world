package sda.lekcja08.game;

public class Element {
    private char value; // values: x - cursor, F - finish, * - wall, _ - free area
    private boolean status; // values: false - unmovable (wall), true - movable;
    private int x;
    private int y;
    private boolean win;

    public Element() {
    }

    public Element(char value, boolean status) {
        this.value = value;
        this.status = status;
    }

    public Element(char value, boolean status, int y, int x, boolean win) {
        this.value = value;
        this.status = status;
        this.y = y;
        this.x = x;
        this.win = win;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
