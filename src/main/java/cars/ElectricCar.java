package cars;

public class ElectricCar extends Car{
    public ElectricCar(String make, String model, double price) {
        super(make, model, price);
    }

    @Override
    public String getType() {
        return "Electric";
    }
}
