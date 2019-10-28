package crosses_zeros;

import java.awt.*;

public class Player {
    private Cell symbol;

    public Player(Cell symbol) {
        this.symbol = symbol;
    }

    //  TODO поменять возвращаемый тип
//    public int[] makeTurn(Field field) {
    public Point makeTurn(Field field) {
        int x = 0;
        int y = 0;

//        return new int[]{x, y};
        return new Point(x, y);
    }
}
