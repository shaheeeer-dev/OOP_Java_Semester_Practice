//Problem 4: Company & Employee

package Object_Relationships.Aggregation;

import java.util.ArrayList;

class Doctor {
    private String name, specialization;

    Doctor(String n, String s) {
        name = n;
        specialization = s;
    }
}

class Hospital {
    private String name;
    ArrayList<Doctor> doctors;

    Hospital(String name, ArrayList<Doctor> doctors) {
        this.name = name;
        this.doctors = doctors;
    }
}

public class HospitalTest {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Ali", "Cardiology");
        Doctor d2 = new Doctor("Ahmed", "Dentist");

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(d1);
        doctors.add(d2);

        Hospital h = new Hospital("City Hospital", doctors);
        System.out.println("Hospital created with doctors.");
    }
}