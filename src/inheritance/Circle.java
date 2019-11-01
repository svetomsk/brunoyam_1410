package inheritance;

public class Circle { //} extends Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

//    @Override
    public int square() {
        return (int) Math.PI * r * r;
    }
}
