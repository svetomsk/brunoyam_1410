package inheritance;

public class Rectangle {//} extends Shape {
    private int a;

    public Rectangle(int a) {
        this.a = a;
    }

//    @Override
    public int square() {
        return a * a;
    }
}
