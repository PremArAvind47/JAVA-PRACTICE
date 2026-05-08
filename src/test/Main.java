package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {

		Deque<Integer> q = new ArrayDeque<>();

		q.offer(10);
		q.offer(20);
		q.offer(30);

		   System.out.println(q.poll()); // 30
	        System.out.println(q.poll()); // 20
	}
}