package inheritance;

public class ShapesExample {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(2);
        Triangle triangle = new Triangle(4, 5, 3);
        Object [] figures = {circle, rectangle, triangle};
//        Shape [] figures = {circle, rectangle, triangle};
//        System.out.println(sumOfSquares(figures));
    }

    public static int sumOfSquares(Object [] figures) {
        int sum = 0;
        for(Object obj : figures) {
            if(obj instanceof Triangle) {
                Triangle tr = (Triangle) obj;
                sum += tr.square();
            }
            if(obj instanceof Rectangle) {
                Rectangle rect = (Rectangle) obj;
                sum += rect.square();
            }
            if(obj instanceof Circle) {
                Circle circle = (Circle) obj;
                sum += circle.square();
            }
        }
        return sum;
    }

    public static int sumOfSquares(Circle [] circles, Rectangle [] rect, Triangle [] triangles) {
        int sum = 0;
        for(Circle c : circles) {
            sum += c.square();
        }
        for(Rectangle r : rect) {
            sum += r.square();
        }
        for(Triangle t : triangles) {
            sum += t.square();
        }
        return sum;
    }

    public static int sumOfSquares(Shape [] figures) {
        int result = 0;
        for(Shape shape : figures) {
            result += shape.square();
        }
        return result;
    }
}
