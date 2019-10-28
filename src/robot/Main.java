package robot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Field field = new Field(5);
        Scanner sc = new Scanner(System.in);
        // создаем робота
        Robot r = new Robot(2, 2, '*');

        field.setValue(r.getX(), r.getY(), CellValue.ROBOT);
        field.printField();
        while(true) {
            String command = sc.next();
            if(command.equalsIgnoreCase("exit")) {
                break;
            }

            switch (command) { //String, int, Enum
                case Field.LEFT:
                case Field.RIGHT:
                case Field.UP:
                case Field.DOWN: {
                    move(r, field, command);
                    break;
                }
            }
            field.printField();
        }
    }

    private static void move(Robot r, Field f, String direction) {
        f.setValue(r.getX(), r.getY(), CellValue.EMPTY);
        if(direction.equalsIgnoreCase(Field.LEFT)) {
            if(r.getY() - 1 >=  0) {
                r.setY(r.getY() - 1);
            }
        } else if(direction.equalsIgnoreCase(Field.RIGHT)) {
            if(r.getY() + 1 < f.getSize()) {
                r.setY(r.getY() + 1);
            }
        } else if(direction.equalsIgnoreCase(Field.UP)) {
            if(r.getX() - 1 >= 0) {
                r.setX(r.getX() - 1);
            }
        } else if(direction.equalsIgnoreCase(Field.DOWN)) {
            if(r.getX() + 1< f.getSize()) {
                r.setX(r.getX() + 1);
            }
        }
        f.setValue(r.getX(), r.getY(), CellValue.ROBOT);
    }
}
