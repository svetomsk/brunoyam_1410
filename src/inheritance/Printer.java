package inheritance;

public class Printer {
    protected int pagesLimit;
    protected int currentUsed;

    public Printer(String model) {
        System.out.println("Printer with model: " + model);
    }

    public void print() {
        System.out.println("Print document");
    }

    public int pagesLeft() {
        return pagesLimit - currentUsed;
    }
}
