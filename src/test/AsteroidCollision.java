package test;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
	private static int[] asteroidCollision(int[] asteroids) {
		Stack<Integer> stack = new Stack<>();
		
		for (int a : asteroids) {
			if (stack.isEmpty()) {
				stack.add(a);
				continue;
			}
			boolean b = true;
			while (!stack.isEmpty() && b) {
				if (stack.peek() > 0 && a < 0) {
					int previous = Math.abs(stack.pop());
					int current = Math.abs(a);
					if (previous == current) {
						break;
					}
					if (previous > current) {
						stack.add(previous);
						break;
					} else {
						if (stack.empty()) {
							stack.add(a);
							break;
						}

					}
				} else {
					b = false;
					stack.add(a);
				}
			}

		}
		int[] g = new int[stack.size()];
		for (int i = 0; i < stack.size(); i++) {
			g[i] = stack.get(i);
		}
		return g;
	}

	public static void main(String[] args) {
		int[] s = {3,5,-6,2,-1,4};
		System.out.println(Arrays.toString(asteroidCollision(s)));

	}

}
