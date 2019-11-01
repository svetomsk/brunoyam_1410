package inheritance;

public class BWPrinter extends Printer {
    public BWPrinter(String model) {
        super(model);
    }

    public void printInvert() {
        System.out.println("Print write and black");
    }
}
