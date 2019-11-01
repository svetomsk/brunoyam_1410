package inheritance;

public class Triangle {//} extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

//    @Override
    public int square() {
        // sqrt(p * (p - a) * (p - b) * (p - c))\
        // a * (b + c)
        int p = (a + b + c) / 2; // полупериметр
        return (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
