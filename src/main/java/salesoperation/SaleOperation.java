package salesoperation;

import cars.Car;
import customer.Customer;
import salespeople.Salespeople;

import java.util.ArrayList;
import java.util.List;

public abstract class SaleOperation {
    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Salespeople> getSalespeople() {
        return salespeople;
    }

    private final List<Customer> customers = new ArrayList<>();
    private final List<Salespeople> salespeople = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addSalespeople(Salespeople salespeople) {
        this.salespeople.add(salespeople);
    }

    public abstract void showCars(Customer customer, Salespeople salespeople);
    public abstract void buyCar(Customer customer, Salespeople salespeople, Car car);
}
