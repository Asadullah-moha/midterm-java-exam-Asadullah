package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * Use API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
			String line;
			LinkedList<String> linkedList = new LinkedList<>();
			Stack<String> stack = new Stack<>();

			while ((line = reader.readLine()) != null) {
				String[] words = line.split(" ");
				for (String word : words) {
					linkedList.add(word);
					stack.push(word);
				}
			}

			System.out.println("Words from LinkedList (FIFO):");
			for (String word : linkedList) {
				System.out.print(word + " ");
			}

			System.out.println("\n\nWords from Stack (FILO):");
			while (!stack.isEmpty()) {
				System.out.print(stack.pop() + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
