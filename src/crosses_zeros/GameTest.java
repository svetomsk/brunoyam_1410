package crosses_zeros;

import org.junit.Before;
import org.junit.BeforeClass;

import java.awt.*;

public class GameTest {
    public static void main(String[] args) {
//        Player first = new Player(Cell.CROSS);
//        Point coords = first.makeTurn(null);
//        System.out.println(coords.x + " " + coords.y);
//
//        Field field = new Field();
////        field.getValue(-1, 0);
        Controller ctrl = new Controller();
        ctrl.startGame();
    }

//    Field f;
//
//    @BeforeClass
//    public void init() {
//
//    }
//
//    @Before
//    public void beforeMethod() {
//        f = new Field();
//    }
}
