
public class Demo05 {
    static int areaAfterResize(Rectangle r) {
        r.setWidth(5);
        r.setHeight(4);
        return r.getArea();
    }
    
    public static void main(String[] args) {
        System.out.println(areaAfterResize(new Rectangle(1, 1))); // 20
        System.out.println(areaAfterResize(new Square(1)));        // 16 (!) violates expectation
    }
}