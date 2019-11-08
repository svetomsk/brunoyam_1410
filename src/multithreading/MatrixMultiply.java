package multithreading;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MatrixMultiply {
    public static void main(String[] args) throws InterruptedException {
        int n = 2000;
        int[][] A = generateMatrix(n);
        int[][] B = generateMatrix(n);

        long start = System.currentTimeMillis();
        multiplyConsec(A, B, n);
        System.out.println("Cons time = " + (System.currentTimeMillis() - start));


        start = System.currentTimeMillis();
        multiplyParallel(A, B, n);
        System.out.println("Parallel time = " + (System.currentTimeMillis() - start));
    }

    private static class Task implements Runnable {
        int [][] A;
        int [][] B;
        int row;
        int column;
        int [][] result;

        public Task(int[][] a, int[][] b, int row, int column, int[][] result) {
            A = a;
            B = b;
            this.row = row;
            this.column = column;
            this.result = result;
        }

        @Override
        public void run() {
            for (int k = 0; k < A.length; k++) {
                result[row][column] += A[row][k] * B[k][column];
            }
        }
    }

    public static int [][] multiplyParallel(int [][] A, int [][] B, int n) throws InterruptedException {
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(8, 8, 1, TimeUnit.DAYS,
                new LinkedBlockingQueue<>());
        int [][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                threadPool.execute(new Task(A, B, i, j, result));
            }
        }

        threadPool.shutdown();
        threadPool.awaitTermination(1, TimeUnit.DAYS);
        return result;
    }

    public static int[][] multiplyConsec(int[][] A, int[][] B, int n) {
        int [][] result = new int[n][n];
        for (int i = 0; i < n; i++) { // все строки из A
            for (int j = 0; j < n; j++) { // все столбцы из B
                for (int k = 0; k < n; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = r.nextInt();
            }
        }
        return result;
    }
}
