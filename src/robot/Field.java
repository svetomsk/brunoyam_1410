package robot;

public class Field {
//    public static final int EMPTY = 0;
//    public static final int ROBOT = 1;
//    public static final int TRACE = 2;

    public static final String LEFT = "left";
    public static final String RIGHT = "right";
    public static final String UP = "up";
    public static final String DOWN = "down";

    private CellValue [][] data;

    public void setValue( int x, int y, CellValue value) {
        data[x][y] = value;
    }

    public int getSize() {
        return data.length;
    }

    public Field(int size) {
        data = new CellValue[size][size];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = CellValue.EMPTY;
            }
        }
    }

    public void printField() {
        for(CellValue [] row : data) {
            for(CellValue element : row) {
                if(element == CellValue.EMPTY) {
                    System.out.print("_ ");
                }
                if(element == CellValue.ROBOT) {
                    System.out.print("# ");
                }
                if(element == CellValue.TRACE) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
