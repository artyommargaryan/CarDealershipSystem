package cars;

public class HybridCar extends Car{

    public HybridCar(String make, String model, double price) {
        super(make, model, price);
    }

    @Override
    public String getType() {
        return HybridCar.class.toString();
    }
}
