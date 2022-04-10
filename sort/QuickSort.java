package com.greatlearning.sort;

public class QuickSort {
	public void Sort(int[] arr, int low, int high) {
		if(low<high) {
			int pi = partition(arr,low,high);
			Sort(arr,low,pi-1);
			Sort(arr,pi+1,high);
		}
	}

	int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int p_index = low;
		for(int i= low; i<=high-1; i++) {
			if(arr[i] >= pivot) {
				int temp = arr[p_index];
				arr[p_index] = arr[i];
				arr[i] = temp;
				p_index++;
			}
		}
		int temp = arr[p_index];
		arr[p_index] = arr[high];
		arr[high] = temp;
		return p_index;
	}

}
