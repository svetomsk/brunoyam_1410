package robot;

public class Robot {
    int x;
    int y;
    char trace;

    public Robot(char trace) {
        this.trace = trace;
    }


    public Robot(int x, int y, char trace) {
        this.x = x;
        this.y = y;
        this.trace = trace;
    }
}
