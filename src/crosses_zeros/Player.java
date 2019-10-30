package crosses_zeros;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    private Cell symbol;

    public Player(Cell symbol) {
        this.symbol = symbol;
    }

    public Point makeTurn(Field field) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            return new Point(x, y);
        } catch (InputMismatchException exc) {
            return new Point(-1, -1);
        }
    }

    public Cell getSymbol() {
        return symbol;
    }
}
