package inheritance;

public class LazerPrinter extends Printer {

    public LazerPrinter(String model) {
        super(model);
        pagesLimit = 200;
        currentUsed = 19;
//        super.print();
//        this.print();
    }

    public void printColored() {
        System.out.println("Printing colored");
    }
}
