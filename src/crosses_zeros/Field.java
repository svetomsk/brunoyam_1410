package crosses_zeros;

public class Field {
    private Cell [][] data;

    public Field() {

    }

    // TODO возвращает ли что-нибудь метод?
    public boolean setValue(int x, int y, Cell value) {
        if(data[x][y] == Cell.EMPTY) {
            data[x][y] = value;
            return true;
        }
        return false;
    }

    public void clearField() {

    }

    public void showField() {

    }
}
