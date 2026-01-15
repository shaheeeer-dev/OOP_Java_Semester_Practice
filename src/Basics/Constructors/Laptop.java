//Problem 3: Laptop Inventory

package Basics.Constructors;

public class Laptop {
    String brand;
	String model;
	double price;

    //Partial initialization using constructor
    public Laptop(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display(){
        System.out.println("Brand: "+ brand+ " model: "+model+ " price: "+price);
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("Lenovo", "X1");
        Laptop l2 = new Laptop("Dell","Latitude7470");

        l2.setPrice(50000);

        l1.display();
        l2.display();
    }
}
