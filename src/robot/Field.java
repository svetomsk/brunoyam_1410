package robot;

public class Field {
    public static final int EMPTY = 0;
    public static final int ROBOT = 1;
    public static final int TRACE = 2;

    int [][] data;

    public Field(int size) {
        data = new int[size][size];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = EMPTY;
            }
        }
    }

    public void printField() {
        for(int [] row : data) {
            for(int element : row) {
//                if(element == EMPTY) {
//                    System.out.print("_ ");
//                }
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
