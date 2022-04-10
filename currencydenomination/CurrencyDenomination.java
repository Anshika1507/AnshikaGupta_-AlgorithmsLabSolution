package com.greatlearning.currencydenomination;

import com.greatlearning.sort.QuickSort;

public class CurrencyDenomination {
	public void calculate(int[] arr, int amount) {
		
		QuickSort qs =  new QuickSort();
		qs.Sort(arr, 0, arr.length-1);
		
		int[] curr_notes = new int[arr.length];
		boolean flag = true;
		for(int i=0; i<arr.length;i++) {
			curr_notes[i] = amount/arr[i];
			amount = amount % arr[i];
		}
		
		if(flag == true) {
			System.out.println("Your payment approach in order to give min no of notes will be: ");
			for(int i=0; i<arr.length;i++) {
				if(curr_notes[i] != 0)
					System.out.println(arr[i] + ":" + curr_notes[i]);
			}
		}
	}

}
