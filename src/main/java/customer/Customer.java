package customer;

import cars.Car;
import salespeople.Salespeople;

public class Customer {
    private final String name;
    private String contactInformation;

    public Customer(String name, String contactInformation) {
        this.name = name;
        this.contactInformation = contactInformation;
    }

    public String getName() {
        return name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public void purchase(Salespeople salespeople,Car car) {
        salespeople.sell(this, car);
        System.out.println(car.getMake() + " " + car.getType() + " " + car.getModel() + " is bought");
    }

    public void viewCars(Salespeople salespeople) {
        salespeople.viewCars();
    }
}
