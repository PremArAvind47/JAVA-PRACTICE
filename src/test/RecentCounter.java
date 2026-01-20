package test;

import java.util.ArrayList;
import java.util.List;

public class RecentCounter {

	List<Long> times = new ArrayList<>();

	public int ping(int t) {
		times.add(Long.valueOf(t));
		int num = t-3000;
		while(times.get(0)<num){
			times.remove(0);
		}
		return times.size();

	}

	public static void main(String[] args) {
		RecentCounter rc = new RecentCounter();
		System.out.println(rc.ping(1)); // 1
		System.out.println(rc.ping(100)); // 2
		System.out.println(rc.ping(3001)); // 3
		System.out.println(rc.ping(3002)); // 3

	}

}
