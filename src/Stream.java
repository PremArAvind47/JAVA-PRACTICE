import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
	public static void main(String[] args) {
		List<Integer> num =
				 Arrays.asList(11,51,20,81,31);
		
		boolean  numm =  num.stream()
                .anyMatch(s -> s % 2 == 0);
		
	}
}
