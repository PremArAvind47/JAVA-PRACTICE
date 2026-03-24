import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
	public static void main(String[] args) {

		 List<String> words = Arrays.asList("java","sql","api","spring");

	        Collection<List<String>> result =
	                words.stream()
	                     .collect(Collectors.groupingBy(String::length)).values();

	      System.out.println(result);
	    }
	}
