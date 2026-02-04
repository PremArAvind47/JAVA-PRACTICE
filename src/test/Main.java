package test;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    Address(Address a) {
        this.city = a.city;
    }
}

class Student {
    int id;
    Address addr;

    Student(int id, Address addr) {
        this.id = id;
        this.addr = addr;
    }

    // shallow copy constructor
    Student(Student s) {
        this.id = s.id;
        this.addr = new Address(s.addr);  // 🔥 same Address object
    }
}

public class Main {
    public static void main(String[] args) {

    	int g = (int)(Math.random()*100);
    	
    	System.out.println(g);
    }
}
