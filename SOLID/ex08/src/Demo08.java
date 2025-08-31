public class Demo08 {
    public static void main(String[] args) {
        PedalVehicle bicycle = new Bicycle();
        bicycle.pedal(10);
        
        // Bicycle only supports pedaling, not starting engine
        // This prevents runtime errors by design
    }
}