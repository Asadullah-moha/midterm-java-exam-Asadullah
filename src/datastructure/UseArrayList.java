package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Integer> arrayList = new ArrayList<>();

		// Add elements to the ArrayList
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);

		// Demonstrate retrieving elements using a For Each loop
		System.out.println("Elements using For Each loop:");
		for (int element : arrayList) {
			System.out.println(element);
		}

		System.out.println("\nElements using while loop and Iterator:");
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			int element = iterator.next();
			System.out.println(element);
		}

		int index = 2;
		if (index >= 0 && index < arrayList.size()) {
			int peekedElement = arrayList.get(index);
			System.out.println("\nPeeked element at index " + index + ": " + peekedElement);
		} else {
			System.out.println("\nIndex is out of bounds.");
		}

		int valueToRemove = 20;
		if (arrayList.contains(valueToRemove)) {
			arrayList.remove(Integer.valueOf(valueToRemove));
			System.out.println("\nRemoved element with value " + valueToRemove);
		} else {
			System.out.println("\nElement not found in the ArrayList.");
		}
	}
}
