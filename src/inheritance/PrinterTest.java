package inheritance;

public class PrinterTest {
    public static void main(String[] args) {
        BWPrinter bw = new BWPrinter("");
        bw.print();

        LazerPrinter lz = new LazerPrinter("1");
        lz.print();
        Printer p = new LazerPrinter("");
        // LazerPrinter p = new Printer();
        p.print();

        Printer [] printers = new Printer[2];
        printers[0] = new BWPrinter("");
        printers[1] = new LazerPrinter("");

        for(Printer prnt : printers) {
            prnt.print();
        }

        System.out.println(lz.pagesLeft());


    }
}
