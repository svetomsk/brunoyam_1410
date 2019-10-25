package tasks;

public class Point3D {
    double x;
    double y;
    double z;

    public static void printPoint(Point3D p) {
        System.out.println(p.x + " " + p.y + " " + p.z);
    }

    public double distance() {
        double dist = Math.sqrt(x*x + y*y + z*z);
        return dist;
    }
}

class PointCalculator {
    public static void main(String[] args) {
        Point3D.printPoint(new Point3D());

        Point3D[] points = new Point3D[1];
        points[0] = new Point3D();
        System.out.println(points[0]);
        // init, fill array
        double totalDistance = 0;
        for(Point3D p : points) {
            totalDistance += p.distance();
//            p.printPoint(p);
            Point3D.printPoint(p);
        }
        System.out.println(totalDistance);
    }
}

class BadPointCalculator {
    static double distance(double x, double y, double z) {
        return Math.sqrt(x*x + y*y + z*z);
    }
    public static void main(String[] args) {
        double [] x = new double[1000];
        double [] y = new double[1000];
        double [] z = new double[1000];
        // init, fill arrays
        double totalDistance = 0;
        for (int i = 0; i < x.length; i++) {
            double dist = distance(x[i], y[i], z[i]);
            totalDistance += dist;
        }
        System.out.println(totalDistance);
    }
}
