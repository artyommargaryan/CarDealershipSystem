package salespeople;

import cars.Car;
import customer.Customer;
import sale.Sale;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Salespeople {
    private final String name;
    private int rate;
    private final Map<String, Car> carMap = new HashMap<>();
    private final List<Sale> sales = new LinkedList<>();

    public Salespeople(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public List<Sale> getSales() {
        return sales;
    }

    private void addSale(Customer customer, Car car) {
        sales.add(new Sale(customer, car, calculatePrice(car)));
    }

    private double calculatePrice(Car car) {
        return car.getPrice() + car.getPrice() * rate / 100;
    }

    public void addCar(Car car) {
        carMap.put(car.getModel(), car);
    }

    public Map<String, Car> viewCars() {
        return carMap;
    }

    public void sell(Customer customer, Car car) {
        validateCar(car);
        addSale(customer, car);
        carMap.remove(car.getModel(), car);
    }

    private boolean isValidCar(Car car) {
        return carMap.containsValue(car);
    }

    private void validateCar(Car car) {
        if (!isValidCar(car)) {
            throw new IllegalArgumentException("Invalid car for this salespeople");
        }
    }
}
