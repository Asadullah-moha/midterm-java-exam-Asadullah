package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	@SuppressWarnings("DataFlowIssue")
	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<Integer> queue = new LinkedList<>();

		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.offer(40);

		System.out.println("Elements using For Each loop:");
		for (int element : queue) {
			System.out.println(element);
		}

		System.out.println("\nElements using while loop and Iterator:");
        queue.forEach(System.out::println);

		int frontElement;
		frontElement = queue.peek();
		System.out.println("\nFront element (peeked): " + frontElement);

		int removedElement = queue.remove();
		System.out.println("\nRemoved element (dequeued): " + removedElement);

		System.out.println("\nUpdated Queue:");
		for (int element : queue) {
            System.out.println(element);
        }
	}

}
