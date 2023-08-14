package interface1;

import java.util.ArrayList;
import java .util.List;

public class Main {
	static public void main(String[] args) {
		//System.out.println("A");
		List <String> subList = new ArrayList<String>();
		subList.add("Carrot");
		subList.add("Tomato");
		subList.add("Potato");
		subList.add("Cauliflower");
		subList.add("Potato");
		subList.add("Potato");

		System.out.println("--------------------Vegetable  List-----------------------");
		subList.forEach(sub -> System.out.println(sub));
	}

}
