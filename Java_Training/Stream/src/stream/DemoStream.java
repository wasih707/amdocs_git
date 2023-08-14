package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoStream {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2,7,4,9,3,1);
		nums.forEach((n -> System.out.println(n)));
		System.out.println("________________________________________________________");
		nums.stream().sorted().map(n->n*2).filter(n->n%2 == 0).forEach(n->System.out.println(n));
	}

}
