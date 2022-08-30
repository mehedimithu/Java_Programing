package example;

public class Tesla extends Vehicle {

    public Tesla(String make, String model, int year) {
        super(make, model, year);
    }

    // Start methods
    public void start() {
        System.out.println(String.format("%s %s %d staring", getMake(), getModel(), getYear()));
    }

    // Stopped methods
    public void stop() {
        System.out.println(String.format("%s %s %d stopping", getMake(), getModel(), getYear()));
    }

}
