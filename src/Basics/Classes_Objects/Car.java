//Problem 3: Car Showroom

package Basics.Classes_Objects;

public class Car {
    //instance variables
    String brand;
    String model;
    double price;

    //display method
    void display() {
        System.out.println(brand + " " + model + " - Rs." + price);
    }

    //Method to display cars below a given limit
    static void printCarsBelowPrice(Car[] cars, double limit) {
        for (Car c : cars) {
            if (c.price < limit) {
                c.display();
            }
        }
    }

    public static void main(String[] args) {
        //object creation and initialization
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.model = "Corolla";
        c1.price = 4500000;

        Car c2 = new Car();
        c2.brand = "Honda";
        c2.model = "Civic";
        c2.price = 5200000;

        Car c3 = new Car();
        c3.brand = "Suzuki";
        c3.model = "Alto";
        c3.price = 2500000;

        Car[] cars = {c1, c2, c3};

        double priceLimit = 4000000;

        System.out.println("Cars below Rs. " + priceLimit + ":");
        printCarsBelowPrice(cars, priceLimit);
    }
}