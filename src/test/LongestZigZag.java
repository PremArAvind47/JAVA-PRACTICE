package test;

public class LongestZigZag {

    public static int sum(int n) {
        if (n == 0) {
            return 0;   // base case
        }

        return sum(n - 1);   // recursive call
    }

    public static void main(String[] args) {

        int result = sum(3);
        System.out.println("Final Result: " + result);

    }
}