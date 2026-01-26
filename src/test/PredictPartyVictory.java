package test;

import java.util.ListIterator;
import java.util.Stack;

public class PredictPartyVictory {

	    static String predictPartyVictory(String senate) {

	        Stack<Character> sss = new Stack<>();

	        for (char c : senate.toCharArray()) {
	            sss.push(c);
	        }

	        int banR = 0, banD = 0;

	        while (true) {

	            Stack<Character> next = new Stack<>();

	            // simulate one round using stack (your style)
	            while (!sss.isEmpty()) {
	                char c = sss.remove(0); // take from front (like your iterator idea)

	                if (c == 'R') {
	                    if (banR > 0) {
	                        banR--; // R is banned → removed
	                    } else {
	                        banD++; // R bans a D
	                        next.push('R'); // R survives → pushed to end
	                    }
	                } else { // D
	                    if (banD > 0) {
	                        banD--; // D is banned → removed
	                    } else {
	                        banR++; // D bans an R
	                        next.push('D'); // D survives → pushed to end
	                    }
	                }
	            }

	            // check winner (your stream logic replaced safely)
	            boolean allR = true;
	            boolean allD = true;

	            for (char c : next) {
	                if (c != 'R') allR = false;
	                if (c != 'D') allD = false;
	            }

	            if (allR) return "Radiant";
	            if (allD) return "Dire";

	            sss = next; // next round (like your it = listIterator())
	        }
	    }

	public static void main(String[] args) {
		String senate = "DRRDD";
		System.out.println(predictPartyVictory(senate));
	}
}
