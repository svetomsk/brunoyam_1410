package tasks;

public class TwoDimArray {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int [][] array = new int[2][2];
        array[0][0] = 2;
        array[0][1] = 3;
        array[1][0] = 4;
        array[1][1] = 5;

        for (int i = 0; i < array.length; i++) { // перебираем индексы строк
            for (int j = 0; j < array[i].length; j++) { // перебираем индексы столбцов
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for(int [] row : array) {
            for(int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // 1) сложить в двумерный массив таблицу умножения от 1 до 10
        int n = 5;
        int [][] multTable = new int[n][n];
        for (int i = 0; i < multTable.length; i++) {
            for (int j = 0; j < multTable[i].length; j++) {
                multTable[i][j] = (i + 1) * (j + 1);
                System.out.print(multTable[i][j] + " ");
            }
            System.out.println();
        }
        // 2) напечатать сумму столбцов двумерный массива
        int [] sums = new int[multTable[0].length];
        for(int [] row : multTable) {
            for (int i = 0; i < row.length; i++) {
                sums[i] += row[i];
            }
        }
        for(int i : sums) {
            System.out.print(i + " ");
        }
        System.out.println();
        // 3) заполнить двумерный массив "змейкой"
        /*
          1 2 3
          6 5 4
          7 8 9
         */
    }
}
