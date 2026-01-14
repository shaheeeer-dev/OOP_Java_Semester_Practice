//Problem 5: Mobile Phone Store

package Basics.Classes_Objects;

public class MobilePhone {
    String brand;
    String model;
    double price;

    void display() {
        System.out.println(brand + " " + model + " - $" + price);
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();
        m1.brand = "Apple";
        m1.model = "X";
        m1.price = 210.66;

        MobilePhone m2 = new MobilePhone();
        m2.brand = "Samsung";
        m2.model = "A32";
        m2.price = 110.95;

        MobilePhone m3 = new MobilePhone();
        m3.brand = "OPPO";
        m3.model = "Reno 9";
        m3.price = 140;

        MobilePhone m4 = new MobilePhone();
        m4.brand = "Google";
        m4.model = "Pixel 9";
        m4.price = 199.99;

        MobilePhone m5 = new MobilePhone();
        m5.brand = "Vivo";
        m5.model = "Y21";
        m5.price = 95.87;

        MobilePhone [] phones = {m1, m2, m3, m4, m5};

        MobilePhone mostExpensive = phones[0];
        MobilePhone cheapest = phones[0];

        for (int i = 1; i < phones.length; i++) {
            if (phones[i].price > mostExpensive.price) {
                mostExpensive = phones[i];
            }
            if (phones[i].price < cheapest.price) {
                cheapest = phones[i];
            }
        }

        System.out.println("Most Expensive Phone:");
        mostExpensive.display();

        System.out.println("\nCheapest Phone:");
        cheapest.display();
    }
}
