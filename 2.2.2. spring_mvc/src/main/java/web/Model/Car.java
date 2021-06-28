package web.Model;

public class Car {
    private String Brand;
    private int MaxSpeed;
    private int NumberOfSeats;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + Brand + '\'' +
                ", MaxSpeed=" + MaxSpeed +
                ", NumberOfSeats=" + NumberOfSeats +
                '}';
    }
}
