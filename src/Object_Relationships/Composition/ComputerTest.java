//Problem 3: Computer & CPU

package Object_Relationships.Composition;

class CPU {
    String brand;
    int cores;

    CPU(String brand, int cores) {
        this.brand = brand;
        this.cores = cores;
    }
}

class Computer {
    CPU cpu;

    Computer() {
        cpu = new CPU("Intel", 8);
    }
}

public class ComputerTest {
    public static void main(String[] args) {
        Computer c = new Computer();
        System.out.println("Computer with CPU created.");
    }
}