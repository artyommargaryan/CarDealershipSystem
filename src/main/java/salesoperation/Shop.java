package salesoperation;

import cars.Car;
import cars.HybridCar;
import customer.Customer;
import salespeople.Salespeople;

public class Shop extends SaleOperation{
    @Override
    public void showCars(Customer customer, Salespeople salespeople) {
        if(!getCustomers().contains(customer)){
            throw new RuntimeException();
        }
        if(!getSalespeople().contains(salespeople)){
            throw new RuntimeException();
        }

        customer.viewCars(salespeople);
    }

    @Override
    public void buyCar(Customer customer, Salespeople salespeople, Car car) {
        if(!getCustomers().contains(customer)){
            throw new RuntimeException();
        }
        if(!getSalespeople().contains(salespeople)){
            throw new RuntimeException();
        }

        customer.purchase(salespeople, car);
    }

    public static void main(String[] args) {
        Customer customer = new Customer("", "");
        Salespeople salespeople = new Salespeople("", 12);
        Car car = new HybridCar("", "", 1000);
        salespeople.addCar(car);
        SaleOperation shop = new Shop();
        shop.addCustomer(customer);
        shop.addSalespeople(salespeople);
        shop.showCars(customer, salespeople);
        shop.buyCar(customer, salespeople, car);
    }
}
