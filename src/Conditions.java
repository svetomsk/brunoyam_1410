public class Conditions {
    public static void main(String[] args) {
        int k = -15;
        if (k < -10) {
            System.out.println("Left");
        } else if (k > 10) {
            System.out.println("Right");
        } else {
            System.out.println("Center");
        }

        if (k < -10) {
            System.out.println("Left");
        }
        if (k > 10) {
            System.out.println("Right");
        }
        if (k > -10 && k < 10) { // && - и
            System.out.println("Center");
        }
        if (k < -10 || k > 10) {
            System.out.println("Not center");
        }
    }
}
