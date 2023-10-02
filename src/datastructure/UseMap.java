package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MySql] to store data and retrieve data.
		 */
		Map<String, List<String>> map = new HashMap<>();
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");

		List<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Purple");

		// Store the lists in the map
		map.put("Fruits", fruits);
		map.put("Colors", colors);

		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			String key = entry.getKey();
			List<String> values = entry.getValue();
			System.out.println("Key: " + key);
			System.out.println("Values: " + values);
		}

		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			String key = entry.getKey();
			List<String> values = entry.getValue();
			System.out.println("Key: " + key);
			System.out.println("Values: " + values);
		}
	}
}