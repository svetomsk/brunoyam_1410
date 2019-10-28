package robot;

public class Robot {
    private int x;
    private int y;
    private char trace;

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

    public char getTrace() {
        return trace;
    }

    public void setTrace(char trace) {
        this.trace = trace;
    }

    public Robot(char trace) {
        this.trace = trace;
    }


    public Robot(int x, int y, char trace) {
        this.x = x;
        this.y = y;
        this.trace = trace;
    }
}
