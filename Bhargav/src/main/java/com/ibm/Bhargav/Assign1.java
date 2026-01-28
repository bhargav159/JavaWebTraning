//package com.ibm.Bhargav;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.ListIterator;
//
//public class Assign1 {
//	public static void main(String args[]) { 
//		
//	    // Create an array list. 
//	    ArrayList<String> al = new ArrayList<String>(); 
//	     
//	    // Add elements to the array list. 
//	    al.add("C"); 
//	    al.add("A"); 
//	    al.add("E"); 
//	    al.add("B"); 
//	    al.add("D"); 
//	    al.add("F"); 
//	 
//	    // iterate through the list
//	    System.out.print("Original contents of al: "); 
//
//	    Iterator<String> itr = al.iterator(); 
//	    while(itr.hasNext()) { 
//	      String element = itr.next(); 
//	      System.out.print(element + " "); 
//	    } 
//	    System.out.println(); 
//	 
//	    // Modify objects being iterated. 
//	    ListIterator<String> litr = al.listIterator();  
//	    while(litr.hasNext()) { 
//	      String element = litr.next(); 
//	      litr.add(element + "+"); 
//	    } 
//	 
//	    System.out.print("Modified contents of al: "); 
//	    itr = al.listIterator();  
//	    while(itr.hasNext()) { 
//	      String element = itr.next(); 
//	      System.out.print(element + " "); 
//	    } 
//	    System.out.println(); 
//	 
//	    // Now, display the list backwards. 
//	    System.out.print("Modified list backwards: "); 
//	    while(litr.hasPrevious()) { 
//	      String element = litr.previous(); 
//	      System.out.print(element + " "); 
//	    } 
//	    System.out.println(); 
//	  }
//}
//
//package com.ibm.Bhargav;
//
//import java.util.ArrayList;
//
//public class Assign1 {
//	public static void main(String args[]) {
//
//		ArrayList<String> result = new ArrayList<String>();
//
//		// Add elements to the collection.
//		result.add("B");
//		result.add("C");
//		result.add("D");
//		result.add("X");
//		result.add("Y");
//		result.add("Z");
//		result.add("A");
//		result.add(1, "A2");
//
//		System.out.println("Original contents of result: " + result);
//
//		// Remove elements from the collection.
//		result.remove("F");
//		result.remove(2);
//
//		System.out.println("Contents of result after deletion: " + result);
//
//		// Remove first and last elements.
//		result.remove(0);
//		result.remove(result.size() - 1 );
//
//		System.out.println("result after deleting first and last: " + result);
//
//		// Get and set a value.
//		String val = result.get(2);
//		result.set(2, val + " Changed");
//
//		System.out.println("result after change: " + result);
//	}
//
//}

//package com.ibm.Bhargav;
//
//import java.util.LinkedList;
//
//class Address {
//	private String name;
//	private String street;
//	private String city;
//	private String state;
//	private String code;
//
//	Address(String n, String s, String c, String st, String cd) {
//		name = n;
//		street = s;
//		city = c;
//		state = st;
//		code = cd;
//	}
//
//	public String toString() {
//		return name + "\n" + street + "\n" + city + " " + state + " " + code;
//	}
//}
//
//public class Assign1 {
//	public static void main(String args[]) {
//			
//	    LinkedList<Address> ml = new LinkedList<Address>();  
//	      
//	    // Add elements to the linked list. 
//	    ml.add(new Address("J.W. West", "11 Oak Ave","Urbana", "IL", "61801"));  
//	    ml.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahome", "IL", "61853"));  
//	    ml.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));  
//	 
//	    // Display the mailing list. 
//	    for(Address element : ml) 
//	      System.out.println(element + "\n");  
//	 
//	    System.out.println();  
//	  }  
//}

//package com.ibm.Bhargav;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//import java.util.Map.Entry;
//
//class Assign1 {
//	public static void main(String args[]) {
//
//		// Use a data structure.
//		HashMap<String, Double> hm = new HashMap<String, Double>();
//
//		// Place elements to the data structure
//		hm.put("John Doe", new Double(3434.34));
//		hm.put("Tom Smith", new Double(123.22));
//		hm.put("Jane Baker", new Double(1378.00));
//		hm.put("Tod Hall", new Double(99.22));
//		hm.put("Ralph Smith", new Double(-19.08));
//
//		// Get a set of the entries.
//		Set<Entry<String, Double>> set = hm.entrySet();
//		
//		// Display the set.
//		for (Map.Entry<String, Double> me : set) {
//			System.out.print(me.getKey() + ": ");
//			System.out.println(me.getValue());
//		}
//
//		System.out.println();
//
//		// Deposit 1000 into John Doe's account.
//		Double balance = hm.get("John Doe");
//		hm.put("John Doe", balance + 1000);
//
//		System.out.println("John Doe's new balance: " + hm.get("John Doe"));
//	}
//}
//package com.ibm.Bhargav;
//
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.LinkedList;
//
//class Assign1 {
//
//	public static void main(String args[]) {
//
//		// Create and initialize linked list.
//		LinkedList<Integer> ll = new LinkedList<Integer>();
//		ll.add(-8);
//		ll.add(20);
//		ll.add(-20);
//		ll.add(8);
//
//		// Create a reverse order comparator.
//		Comparator<Integer> r = Collections.reverseOrder();
//
//		// Sort list by using the comparator.
//		Collections.sort(ll, r);
//
//		System.out.print("List sorted in reverse: ");
//		for (int i : ll)
//			System.out.print(i + " ");
//
//		System.out.println();
//
//		// Shuffle list.
//		Collections.shuffle(ll);
//
//		// Display randomized list.
//
//		System.out.print("List shuffled: ");
//		for (int i : ll)
//			System.out.print(i + " ");
//
//		System.out.println();
//
//		System.out.println("Minimum: " + Collections.min(ll));
//		System.out.println("Maximum: " + Collections.max(ll));
//	}
//}
//package com.ibm.Bhargav;
//import java.util.Arrays;
//
//class Assign1 {
//	public static void main(String args[]) {
//
//		// Allocate and initialize array.
//		int array[] = new int[10];
//		for (int i = 0; i < 10; i++)
//			array[i] = -3 * i;
//
//		// Display, sort, and display the array.
//		System.out.print("Original contents: ");
//		display(array);
//		Arrays.sort(array);
//		System.out.print("Sorted: ");
//		display(array);
//
//		// Fill and display the array.
//		Arrays.fill(array, 2, 6, -1);
//		System.out.print("After fill(): ");
//		display(array);
//
//		// Sort and display the array.
//		Arrays.sort(array);
//		System.out.print("After sorting again: ");
//		display(array);
//
//		// Binary search for -9.
//		System.out.print("The value -9 is at location ");
//		int index = Arrays.binarySearch(array, -9);
//
//		System.out.println(index);
//	}
//
//	static void display(int[] array) {
//		for (int i : array)
//			System.out.print(i + " ");
//
//		System.out.println();
//	}
//}

package com.ibm.Bhargav;

import java.util.Enumeration;
import java.util.Vector;

class Assign1 {
	public static void main(String args[]) {

		// initial size of 3 and increment of 2
		Vector<Integer> v = new Vector<Integer>(3, 2);

		System.out.println("Initial size: " + v.size());
		System.out.println("Initial capacity: " + v.capacity());
		
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);

		System.out.println("Capacity after four additions: " + v.capacity());
		v.addElement(5);
		System.out.println("Current capacity: " + v.capacity());
		v.addElement(6);
		v.addElement(7);

		System.out.println("Current capacity: " + v.capacity());
		v.addElement(9);
		v.addElement(10);

		System.out.println("Current capacity: " + v.capacity());
		v.addElement(11);
		v.addElement(12);

		System.out.println("First element: " + v.firstElement());
		System.out.println("Last element: " + v.lastElement());

		if (v.contains(3))
			System.out.println("Collection contains 3.");

		//traverse through the elements in the collection.
		Enumeration vE = v.elements();

		System.out.println("\nElements in collection:");
		while (vE.hasMoreElements())
			System.out.print(vE.nextElement() + " ");
		System.out.println();
	}
}