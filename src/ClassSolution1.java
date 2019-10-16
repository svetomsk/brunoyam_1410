public class ClassSolution1 {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        for (int i = 0; i < n; i++) {
            fact = fact * (i + 1);
        }
        System.out.println(fact);

        int pow = 1;
        int k = 3;
        for (int i = 0; i < k; i++) {
            pow = pow * n;
        }
        System.out.println(pow);
    }
}
