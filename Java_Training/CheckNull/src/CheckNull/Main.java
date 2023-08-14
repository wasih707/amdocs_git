package CheckNull;

import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		String[] str = new String [10];
		str[5] ="K";
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if (checkNull.isPresent()) {
			String word = str[5].toLowerCase();
			System.out.print(word);
		}
		else {
			System.out.println("String is Null");
		}
	}

}
