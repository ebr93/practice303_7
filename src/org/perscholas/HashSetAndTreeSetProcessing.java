package org.perscholas;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetAndTreeSetProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EXAMPLE 1 INSERT ELMENT TO HASHSET USING addAll()
		System.out.println("EXAMPLE 1 INSERT ELMENT TO HASHSET USING addAll()");

		HashSet<Integer> evenNumber = new HashSet<>();

		// Using add() method
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		System.out.println("HashSet: " + evenNumber);

		HashSet<Integer> numbersList = new HashSet<>();

		// Using addAll() method
		numbersList.addAll(evenNumber);
		numbersList.add(5);
		System.out.println("New HashSet: " + numbersList);

		// EXAMPLE 2 UNION OF SETS
		System.out.println("EXAMPLE 2 UNION OF SETS");

		HashSet<Integer> evenNumbers = new HashSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		System.out.println("HashSet1: " + evenNumbers);

		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(3);
		System.out.println("HashSet2: " + numbers);

		// Union of two set
		numbers.addAll(evenNumbers);
		System.out.println("Union is: " + numbers);

		// EXAMPLE 3 DIFFERENCE OF SETS
		System.out.println("EXAMPLE 3 DIFFERENCE OF SETS");
		HashSet<Integer> primeNumbers = new HashSet<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
		System.out.println("HashSet1: " + primeNumbers);

		HashSet<Integer> oddNumbers = new HashSet<>();
		oddNumbers.add(1);
		oddNumbers.add(3);
		oddNumbers.add(5);
		System.out.println("HashSet2: " + oddNumbers);

		// Difference between HashSet1 and HashSet2
		primeNumbers.removeAll(oddNumbers);
		System.out.println("Difference : " + primeNumbers);

		// EXAMPLE 4 ENHANCED for() Loop
		System.out.println("EXAMPLE 4 ENHANCED for() Loop");

		// HashSet declaration
		HashSet<String> hset = new HashSet<String>();

		// Adding elements to the HashSet
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		// Addition of duplicate elements
		hset.add("Apple");
		hset.add("Mango");
		// Addition of null values
		hset.add(null);
		hset.add(null);

		// Using advanced for loop
		for (String str : hset) {
			System.out.println(" ---> " + str);
		}

		// EXAMPLE 1 ITERATE THROUGH TreeSet
		System.out.println("EXAMPLE 1 ITERATE THROUGH TreeSet");

		TreeSet<Integer> num_Treeset = new TreeSet<>();
		num_Treeset.add(20);
		num_Treeset.add(5);
		num_Treeset.add(15);
		num_Treeset.add(25);
		num_Treeset.add(10);

		// Call iterator() method to define Iterator for TreeSet
		Iterator<Integer> iter_set = num_Treeset.iterator();
		System.out.print("TreeSet using Iterator: ");
		// Access TreeSet elements using Iterator
		while (iter_set.hasNext()) {
			System.out.print(iter_set.next());
			System.out.print(", ");
		}

		// EXAMPLE 2 Remove Elements
		System.out.println("\nEXAMPLE 2 Remove Elements");

		TreeSet<Integer> numbersTree = new TreeSet<>();
		numbersTree.add(2);
		numbersTree.add(5);
		numbersTree.add(6);
		System.out.println("TreeSet: " + numbersTree);

		// Using the remove() method
		boolean value1 = numbersTree.remove(5);
		System.out.println("Is 5 removed? " + value1);

		// Using the removeAll() method
		boolean value2 = numbersTree.removeAll(numbersTree);
		System.out.println("Are all elements removed? " + value2);

		// EXAMPLE 3 METHODS FOR NAVIGATION
		System.out.println("EXAMPLE 3 METHODS FOR NAVIGATION");

		TreeSet<Integer> nmbrs = new TreeSet<>();
		nmbrs.add(2);
		nmbrs.add(5);
		nmbrs.add(6);
		System.out.println("TreeSet: " + nmbrs);

		// Using the first() method
		int first = nmbrs.first();
		System.out.println("First Number: " + first);

		// Using the last() method
		int last = nmbrs.last();
		System.out.println("Last Number: " + last);

		// EXAMPLE 4 SORT THE GIVEN TREESET ALPHABETICALLY IN REVERSE ORDER
		// Create a TreeSet with user-defined comparator
		TreeSet<String> cities = new TreeSet<>(new cities_Comparator());
		// add elements to the comparator
		cities.add("UAE");
		cities.add("Mumbai");
		cities.add("NewYork");
		cities.add("Hyderabad");
		cities.add("Karachi");
		cities.add("Xanadu");
		cities.add("Lahore");
		cities.add("Zagazig");
		cities.add("Yingkou");

		// print the contents of TreeSet
		System.out.println("TreeSet: " + cities);

	}

}

class cities_Comparator implements Comparator<String> {
	// override compare method to compare two elements of the TreeSet
	@Override
	public int compare(String cities_one, String cities_two) {
		int value = cities_one.compareTo(cities_two);
		// sort elements in reverse order
		if (value > 0) {
			return -1;
		} else if (value < 0) {
			return 1;
		} else {
			return 0;
		}
	}
}
