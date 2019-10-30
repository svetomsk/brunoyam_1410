package crosses_zeros;

import java.util.Arrays;

public class Field {
    private Cell [][] data;
    public static final int DEFAULT_SIZE = 3;

    public Field() {
        data = new Cell[DEFAULT_SIZE][DEFAULT_SIZE];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                data[i][j] = Cell.EMPTY;
            }
        }
    }

    // TODO возвращает ли что-нибудь метод?
    public boolean setValue(int x, int y, Cell value) {
        if(!(x >= 0 && x < data.length && y >= 0 && y < data.length)) {
            return false;
        }
        if(data[x][y] == Cell.EMPTY) {
            data[x][y] = value;
            return true;
        }
        return false;
    }

    public Cell getValue(int x, int y) {
        if(x < 0 || y < 0 || x >= data.length || y >= data.length) {
            throw new IllegalArgumentException("Index out of field");
        }
        return data[x][y];
    }

    public int getSize() {
        return data.length;
    }

    public void clearField() {
        for (int i = 0; i < data.length; i++) {
            Arrays.fill(data[i], Cell.EMPTY);
        }
    }

    public void showField() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                switch(data[i][j]) {
                    case EMPTY: {
                        System.out.print("_ ");
                        break;
                    }
                    case CROSS: {
                        System.out.print("X ");
                        break;
                    }
                    case ZERO: {
                        System.out.print("0 ");
                        break;
                    }
                }
            }

            System.out.println();
        }
    }
}
