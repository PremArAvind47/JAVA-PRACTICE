package test;

import java.util.ArrayList;
import java.util.List;

public class NonRepeatedCharacter {
    static List<Character> method(String s) {
    	 List<Character> cc = new ArrayList<>();
    	 
        for (char c : s.toCharArray()) {
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                cc.add(c); // add all unique characters
            }
        }

        return cc;
    }

    public static void main(String[] args) {
        String s = "swiss";
        List<Character> result = method(s);

        if (result.isEmpty()) {
            System.out.println("No unique characters found");
        } else {
            System.out.println("Non-repeated characters: " + result);
        }
    }
}
