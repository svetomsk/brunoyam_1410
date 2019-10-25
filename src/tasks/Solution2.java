package tasks;

public class Solution2 {
    public static void main(String[] args) {
        int number = 1245;
        int sumOfDigits = 0;
        int k = 3;

        while(number != 0) {
            int currentDigit = number % 10;
            number = number / 10;
            sumOfDigits += Math.pow(currentDigit, k);
        }
        System.out.println(sumOfDigits);

        number = 1245;
        String strNumber = Integer.toString(number);
        strNumber = "4333333333333333333333333333333333333333333333333333333333333333333333333333333333333";
        sumOfDigits = 0;
        for (int i = 0; i < strNumber.length(); i++) {
            char ch = strNumber.charAt(i);
            sumOfDigits += ch - '0';
        }
        if(sumOfDigits % 3 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println(sumOfDigits);

        String pal = "abcba";
        boolean isPalindrom = true;
        for (int i = 0; i < pal.length(); i++) {
            char left = pal.charAt(i);
            char right = pal.charAt(pal.length() - 1 - i);
            if(left != right) {
                isPalindrom = false;
                break;
            }
        }
        if(isPalindrom) {
            System.out.println("palindrom");
        } else {
            System.out.println("not palidrom");
        }

        int n = 100;
        for (int i = 0; i <= n; i++) {
            if(i % 2 == 1) {
                continue;
            }
            System.out.println(i);

        }

        loop:
        for (int i = 0; i < n; i++) {
//            boolean check = false;
            for (int j = 0; j < n; j++) {
                if(i + j > n) {
//                    check = true;
                    break loop;
                }
            }
//            if(check) {
//                break;
//            }
        }

    }
}
