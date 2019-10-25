package tasks;

import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {
        String name = "abcde";
        char symbol = name.charAt(0);
        System.out.println(symbol);
        System.out.println(name.charAt(4));
        System.out.println(name.length());


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String operation = sc.next();
        int b = sc.nextInt();

        if(operation.equals("+") || operation.equals("plus")) {
            System.out.println(a + b);
        } else if(operation.equals("-")) {
            System.out.println(a - b);
        } else if(operation.equals("*")){
            System.out.println(a * b);
        } else if(operation.equals("/")) {
            System.out.println(a / b);
        }

        /*
        if(operation.equals("plus")) {
            operation = "+";
        }
        */
        switch (operation) {
            case "plus":
            case "+": {
                System.out.println(a + b);
                break;
            }
            case "-": {
                System.out.println(a - b);
                break;
            }
            case "*": {
                System.out.println(a * b);
                break;
            }
            case "/": {
                System.out.println(a / b);
            }
        }
    }
}
