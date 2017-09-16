package com.rdayala.dp.adapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*  
 * This is our Adaptee, a third party implementation of a  
 * number sorter that deals with Lists, not arrays.
 *  
 */
public class NumberSorter {
	
	public List<Integer> sort(List<Integer> numbers) {
		// sort and return
		Collections.sort(numbers);
		return numbers;
	}
}
