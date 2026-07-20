public class Car {
    private String model;
    private String plate;
    private int year;

    public Car(String model, String plate, int year) {
        this.model = model;
        this.plate = plate;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getPlate() {
        return plate;
    }

    public int getYear() {
        return year;
    }
}
