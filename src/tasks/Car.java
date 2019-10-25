package tasks;

public class Car {
    int velocity;
    int maxVelocity;
    int yearOfCreation;
    String model;
    int [] arr;

    public Car(int maxVelocity, int yearOfCreation, String model) {
        this.maxVelocity = maxVelocity;
        this.yearOfCreation = yearOfCreation;
        this.model = model;
        arr = new int[10];
    }

    public Car() {
        arr = new int[10];
        System.out.println("tasks.Car constructor");
    }
//
//    public tasks.Car(int maxVelocity, int yearOfCreation, String model) {
//        velocity = 0;
//        this.maxVelocity = 100;
//        this.yearOfCreation = yearOfCreation;
//        this.model = model;
////        bmw.maxVelocity = 100;
////        bmw.yearOfCreation = 1990;
////        bmw.model = "BMW";
//    }

    public void drive() {
        System.out.println("Driving with speed " + velocity);
    }

    public void speedUp(int diff) {
        velocity += diff;
    }
}


class Test {
    public static void main(String[] args) {
        String name = "Ivan";
        Car bmw = new Car(100, 1990, "BMW");
//        bmw.maxVelocity = 100;
//        bmw.yearOfCreation = 1990;
//        bmw.model = "BMW";
        System.out.println(bmw.maxVelocity * 85 / 100);
        System.out.println(bmw.maxVelocity);
        bmw.drive();
        bmw.speedUp(30);
        bmw.drive();
        Car audi = new Car();
        audi.model = "Audi";
        audi.maxVelocity = 120;
        audi.drive();

        Car [] garage = new Car[2];
        garage[0] = bmw;
        garage[1] = new Car();
    }
}
