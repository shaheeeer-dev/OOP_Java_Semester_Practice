//Problem 6: Transport Fare Calculation

package Core_OOP.Polymorphism;

class Transport {
    public double calculateFare(int distance) {
        return 0;
    }
}

class Bus extends Transport {
    @Override
    public double calculateFare(int distance) {
        return distance * 10;
    }
}

class Train extends Transport {
    @Override
    public double calculateFare(int distance) {
        return distance * 5;
    }
}

class Taxi extends Transport {
    @Override
    public double calculateFare(int distance) {
        return distance * 20;
    }
}

public class TransportProblem {
    public static void main(String[] args) {
        Transport[] transports = {
                new Bus(),
                new Train(),
                new Taxi()
        };

        for (Transport t : transports) {
            System.out.println(t.calculateFare(10));
        }
    }
}
