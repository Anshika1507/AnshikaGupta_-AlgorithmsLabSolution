package com.greatlearning.paymoneymain;

import java.util.Scanner;

import com.greatlearning.paymoney.PayMoney;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array : ");
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the values of array : ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total number of targets to be achieved : ");
		int num = sc.nextInt();
		PayMoney pm = new PayMoney();
		for(int i=0; i< num; i++) {
			System.out.println("Enter the value of target: ");
			int target = sc.nextInt();
			pm.checkTarget(arr,target);
		}
		sc.close();
		
	}

}
