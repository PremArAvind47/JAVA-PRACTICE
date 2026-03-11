package test;

public class PermutationEasy {
    public static void main(String[] args) {

        String a = "Hello";
        String b = "World";

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b;                 // HelloWorld
        b = a.substring(0, a.length() - b.length()); // Hello
        a = a.substring(b.length()); // World

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}