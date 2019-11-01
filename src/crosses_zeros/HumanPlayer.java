package crosses_zeros;

import crosses_zeros.Cell;
import crosses_zeros.Field;
import crosses_zeros.Player;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(Cell symbol) {
        super(symbol);
    }

    @Override
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
}
