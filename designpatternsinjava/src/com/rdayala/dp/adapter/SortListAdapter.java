package com.rdayala.dp.adapter;

import java.util.ArrayList;
import java.util.List;

// Adapter implements our Target interface and deals with our Adaptee
// Target interface : Sorter
// Adaptee : NumberSorter (third party implementation)

// Adapter translates the request from the Client to the Adaptee

public class SortListAdapter implements Sorter {
	
	@Override
	public int[] sort(int[] numbers) {
		
		// convert the int[] array to a List
		List<Integer> numberList = new ArrayList<Integer>();		
		for (int index = 0; index < numbers.length; index++)
		{
			numberList.add(numbers[index]);
		}
		
		// Using Adaptee for our work
		NumberSorter numberSorter = new NumberSorter();
		numberList = numberSorter.sort(numberList);
		
		// convert the list back to an int[] array and return
		return toIntArray(numberList);
	}
	
	private int[] toIntArray(List<Integer> list)  {
	    int[] ret = new int[list.size()];
	    int i = 0;
	    for (Integer e : list)  
	        ret[i++] = e.intValue();
	    return ret;
	}
}
