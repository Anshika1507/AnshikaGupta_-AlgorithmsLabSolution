package com.greatlearning.denominationmain;

import java.util.Scanner;

import com.greatlearning.currencydenomination.CurrencyDenomination;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations array ");
		int size = sc.nextInt();
		
		int[] denoms =  new int[size];
		System.out.println("Enter the currency denominations ");
		for(int i=0;i<size;i++) {
			denoms[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay: ");
		int amount = sc.nextInt();
		
		CurrencyDenomination cd = new CurrencyDenomination();
		cd.calculate(denoms, amount);
		sc.close();

	}

}
