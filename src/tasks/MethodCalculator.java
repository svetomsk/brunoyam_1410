package tasks;

import java.util.Scanner;

public class MethodCalculator {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            String op = sc.next();
            if (op.equalsIgnoreCase("exit")) {
                break;
            }
            int number = sc.nextInt();
            // + - * /
            switch (op) {
                case "+": {
                    result += number;
                    break;
                }
                case "-": {
                    result -= number;
                    break;
                }
                case "divisors": {
                    divisors(number);
                    break;
                }
                case "digits": {
                    System.out.println(digits(number));
                    break;
                }
            }

            System.out.println("result = " + result);
        }
    }

    static int digits(int number) {
        int sumOfDigits = 0;
        while(number != 0) {
            int currentDigit = number % 10;
            number = number / 10;
            sumOfDigits += currentDigit;
        }
        return sumOfDigits;
    }

    static void divisors(int value) {
        for (int j = 1; j < value; j++) {
            if (value % j == 0) { // делится
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }
}
