package robot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Field field = new Field(5);
        Scanner sc = new Scanner(System.in);
        // создаем робота
        Robot r = new Robot(2, 2, '*');
        field.data[r.x][r.y] = Field.ROBOT;
        field.printField();
        while(true) {
            String command = sc.next();
            if(command.equalsIgnoreCase("exit")) {
                break;
            }
            switch (command) { //String, int, Enum
                case "left": {
                    System.out.println("Move left");
                    moveLeft(r, field);
                    break;
                }
                case "right": {
                    System.out.println("Move right");
                    moveRight(r, field);
                    break;
                }
                case "down": {
                    moveDown(r, field);
                    break;
                }
            }
            field.printField();
        }
//        Field.EMPTY
    }

    private static void moveLeft(Robot r, Field f) {
        // затираем старое положение робота
        f.data[r.x][r.y] = Field.EMPTY;
        // проверяем, что мы в границах
        if(r.y - 1 >=  0) {
            r.y--;
        }
        // устанавливаем значение в новую ячейку
        f.data[r.x][r.y] = Field.ROBOT;
    }

    private static void moveRight(Robot r, Field f) {
        f.data[r.x][r.y] = Field.EMPTY;
        if(r.y + 1 < f.data.length) {
            r.y++;
        }
        f.data[r.x][r.y] = Field.ROBOT;
    }

    private static void moveDown(Robot r, Field f) {
        f.data[r.x][r.y] = Field.EMPTY;
        if(r.x + 1 < f.data.length) {
            r.x++;
        }
        f.data[r.x][r.y] = Field.ROBOT;
    }
}
