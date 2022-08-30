package example;

public class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter and Setter methods
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Instance Methods
    public void start() {
        System.out.println(String.format("%s %s %d Strting", getMake(), getModel(), getYear()));
    }

    public void stop() {
        System.out.println(String.format("%s %s %d Stopping", getMake(), getModel(), getYear()));
    }

}
