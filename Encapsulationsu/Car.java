package Encapsulationsu;

public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        // before setter
        // this.make = make;
        // this.model = model;
        // this.year = year;
        // after setter
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    // copy constructor
    Car(Car x) {
        this.copy(x);
    }

    // getter method
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // setter
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // copy method
    public void copy(Car x) {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
