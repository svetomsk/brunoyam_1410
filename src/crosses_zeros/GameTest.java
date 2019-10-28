package crosses_zeros;

import java.awt.*;

public class GameTest {
    public static void main(String[] args) {
        Player first = new Player(Cell.CROSS);
        Point coords = first.makeTurn(null);
        System.out.println(coords.x + " " + coords.y);
    }
}
