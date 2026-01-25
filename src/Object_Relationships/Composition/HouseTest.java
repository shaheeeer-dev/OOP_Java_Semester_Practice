//Problem 2: House & Room

package Object_Relationships.Composition;

class Room {
    int roomNo;
    String type;

    Room(int no, String type) {
        this.roomNo = no;
        this.type = type;
    }
}

class House {
    Room room1;
    Room room2;

    House() {
        room1 = new Room(1, "Bedroom");
        room2 = new Room(2, "Kitchen");
    }
}

public class HouseTest {
    public static void main(String[] args) {
        House h = new House();
        System.out.println("House created with rooms.");
    }
}
