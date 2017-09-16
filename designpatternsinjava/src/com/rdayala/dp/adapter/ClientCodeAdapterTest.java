package com.rdayala.dp.adapter;

public class ClientCodeAdapterTest {

	public static void main(String[] args) {

		// Our Client deals with primitive arrays rather than Lists.
		// For the sake of this example, lets say we can't change the client to use Lists. 
		int[] numbers = new int[] { 34, 2, 4, 3, 12, 1 };
		
		// Client is only dealing with Target interface type
		Sorter sorter = new SortListAdapter();
		
		int[] sortedNumbers = sorter.sort(numbers);					
		for (int i : sortedNumbers) {
			System.out.println(i);
		}
	}

}
