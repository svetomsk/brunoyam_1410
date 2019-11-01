package crosses_zeros;

import java.awt.*;

public class ComputerPlayer extends Player {
    public ComputerPlayer(Cell symbol) {
        super(symbol);
    }

    @Override
    public Point makeTurn(Field field) {
        for (int i = 0; i < field.getSize(); i++) {
            for(int j = 0; j < field.getSize(); j++) {
                if(field.getValue(i, j) == Cell.EMPTY) {
                    return new Point(i, j);
                }
            }
        }
        return new Point(0, 0);
    }
}
