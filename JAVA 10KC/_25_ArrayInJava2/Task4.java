package com.arrays.tasks2;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int size = sc.nextInt();
		int [] a = new int[size];
		for(int i = 0; i < size ; i++) {
			System.out.print("Enter "+i+" position element : ");
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the element to search = ");
		int element = sc.nextInt();
		sc.close();
		
		//searching in an array
		boolean status = true;
		for(int i = 0 ; i < size ; i++) {
			if(element == a[i]) {
				System.out.println("Element found at position : "+i);
				status = false;
				break;
			}
		}
		if(status) {
			System.out.println("Element not found");
		}
	}
}
