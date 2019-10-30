package crosses_zeros;

import java.awt.*;

public class Controller {
    public void startGame() {
        Field field = new Field();
        Player first = new Player(Cell.CROSS);
        Player second = new Player(Cell.ZERO);
        Player current = first;

        while (true) {
            field.showField();
            Point coord = current.makeTurn(field);
            boolean result = field.setValue(coord.x, coord.y, current.getSymbol());
            if (result) {
                boolean winner = checkWinner(field);
                if (winner) {
                    System.out.println(current.getSymbol() + " wins");
                    break;
                } else {
                    if (current.getSymbol() == Cell.CROSS) {
                        current = second;
                    } else { // == Cell.ZERO
                        current = first;
                    }
                }
            } else {
                System.out.println("Repeat your turn");
            }
        }
    }

    // TODO что возвращает метод?
    public boolean checkWinner(Field field) {
        for (int i = 0; i < field.getSize(); i++) {
            if (field.getValue(i, 0) == field.getValue(i, 1) &&
                    field.getValue(i, 1) == field.getValue(i, 2) &&
                    field.getValue(i, 2) != Cell.EMPTY) {
                return true;
            }
        }
        return false;
    }
}
