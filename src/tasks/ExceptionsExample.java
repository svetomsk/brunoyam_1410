package tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsExample {
    public static void main(String[] args) {
        try {
            foo();
        } catch (NullPointerException e) {
            System.out.println("Error occured");
        }

        try {
            readFromFile();
        } catch (FileNotFoundException e) {
            System.out.println("To do smth with file");
        }
    }

    static void foo() {
        int [] a = null;
        System.out.println(a.length);
    }

    static void readFromFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input1.txt"));
    }
}
