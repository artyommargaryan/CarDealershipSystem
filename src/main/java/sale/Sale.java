package sale;

import cars.Car;
import customer.Customer;

public record Sale(Customer customer, Car car, double price) {
}
