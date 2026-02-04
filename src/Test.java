import java.util.Arrays;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 3, 0, 4 };

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.toString(arr));
	}
}
