package multithreading;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getId());

        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("Hello from task 1 " + i);
                }
            }
        };
        task1.run();
        Thread first = new Thread(task1);
        System.out.println(first.getState());

        Thread second = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("Hello from task 2 " + i);
                }
            }
        });
        first.start(); // запускаем поток
        second.start();
        System.out.println(first.getState());

        first.join();
        second.join();

        System.out.println(first.getState());

    }
}
