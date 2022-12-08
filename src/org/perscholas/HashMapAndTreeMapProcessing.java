package org.perscholas;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMapAndTreeMapProcessing {

	public static void main(String[] args) {
		// EXAMPLE 1 REMOVE HASHMAP ELEMENTS
		System.out.println("EXAMPLE 1 REMOVE HASHMAP ELEMENTS");

		HashMap<Integer, String> languages = new HashMap<>();
		languages.put(1, "Java");
		languages.put(2, "Python");
		languages.put(3, "JavaScript");
		languages.put(4, "C Sharp");

		System.out.println("HashMap: " + languages);

		// remove element associated with key 2
		String value = languages.remove(2);
		System.out.println("Removed value: " + value);
		System.out.println("Updated HashMap: " + languages);

		// EXAMPLE 2 HASHMAP
		System.out.println("EXAMPLE 2 HASHMAP");

		HashMap<String, String> newHashMap = new HashMap<>();
		// Addition of key and value
		newHashMap.put("Key1", "Lenovo");
		newHashMap.put("Key2", "Motorola");
		newHashMap.put("Key3", "Nokia");
		newHashMap.put("Key4", null);
		newHashMap.put(null, "Sony");
		System.out.println("Original map contains:" + newHashMap);
		// getting size of Hashmap
		System.out.println("Size of original Map is:" + newHashMap.size());
		// copy contains of one Hashmap to another
		HashMap<String, String> copyHashMap = new HashMap<>();
		copyHashMap.putAll(newHashMap);
		System.out.println("copyHashMap mappings= " + copyHashMap);
		// Removal of null key
		String nullKeyValue = copyHashMap.remove(null);
		System.out.println("copyHashMap null key value = " + nullKeyValue);
		System.out.println("copyHashMap after removing null key = " + copyHashMap);
		System.out.println("Size of copyHashMap is:" + copyHashMap.size());

		// EXAMPLE 1 REMOVE TREEMAP ELEMENTS
		System.out.println("EXAMPLE 1 REMOVE TREEMAP ELEMENTS");

		TreeMap<String, Integer> numbers = new TreeMap<>();
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		System.out.println("TreeMap: " + numbers);

		// remove method with single parameter
		int val = numbers.remove("Two");
		System.out.println("Removed value: " + val);

		// remove method with two parameters
		boolean result = numbers.remove("Three", 3);
		System.out.println("Is the entry {Three=3} removed? " + result);
		System.out.println("Updated TreeMap: " + numbers);

		// EXAMPLE 2 METHODS FOR NAVIGATION
		System.out.println("EXAMPLE 2 METHODS FOR NAVIGATION");
		
        TreeMap<String, Integer> numbersTree = new TreeMap<>();
        numbersTree.put("First", 1);
        numbersTree.put("Second", 2);
        numbersTree.put("Third", 3);
        System.out.println("TreeMap: " + numbersTree);

        // Using the firstKey() method
        String firstKey = numbersTree.firstKey();
        System.out.println("First Key: " + firstKey);

        // Using the lastKey() method
        String lastKey = numbersTree.lastKey();
        System.out.println("Last Key: " + lastKey);

        // Using firstEntry() method
        System.out.println("First Entry: " + numbersTree.firstEntry());

        // Using the lastEntry() method
        System.out.println("Last Entry: " + numbersTree.lastEntry());

        // EXAMPLE 2 TREEMAP COMPARATOR
        System.out.println("EXAMPLE 2 TREEMAP COMPARATOR");

        // Creating a treemap with a customized comparator
        TreeMap<String, Integer> numbersTreeMap = new TreeMap<>(new CustomComparator());

        numbersTreeMap.put("First", 1);
        numbersTreeMap.put("Second", 2);
        numbersTreeMap.put("Third", 3);
        numbersTreeMap.put("Fourth", 4);
        System.out.println("TreeMap: " + numbersTreeMap);

	}

}

class CustomComparator implements Comparator<String> {

	   @Override
	   public int compare(String number1, String number2) {
	       int value =  number1.compareTo(number2);

	       // elements are sorted in reverse order
	       if (value > 0) {
	           return -1;
	       }
	       else if (value < 0) {
	           return 1;
	       }
	       else {
	           return 0;
	       }
	   }
	}

