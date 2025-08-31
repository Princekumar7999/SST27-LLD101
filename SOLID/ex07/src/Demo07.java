public class Demo07 {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.print("Hello");
        
        // BasicPrinter only supports printing, not scanning
        // This prevents runtime errors by design
    }
}