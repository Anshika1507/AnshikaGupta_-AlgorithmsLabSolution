package com.greatlearning.paymoney;

public class PayMoney {
	
	public void checkTarget(int[] arr, int target) {
		long sum =0;
		for(int i=0; i<arr.length;i++) {
			sum = sum + arr[i];
			if(sum >= target) {
				System.out.println("Target achieved after "+(i+1)+" transactions.");
				break;
			}
			if(i == arr.length && target > sum)
				System.out.println("Given target is not achieved.");
		}
	}

}
