public class Demo06 {
    public static void main(String[] args) {
        Aviary aviary = new Aviary();
        aviary.release(new Bird());
        
        // Penguin can't fly, so it's not released in the aviary
        Penguin penguin = new Penguin();
        penguin.swim();
        penguin.walk();
    }
}