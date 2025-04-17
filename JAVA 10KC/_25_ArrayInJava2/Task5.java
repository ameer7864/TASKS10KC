package com.arrays.tasks2;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int size = sc.nextInt();
		int [] a1 = new int[size];
		for(int i = 0 ; i < size; i++) {
			System.out.print("Enter "+i+" position element : ");
			a1[i] = sc.nextInt();
		}
		int [] a2 = a1;
		System.out.print("Elements copied to new array: ");
		for(int x : a2) {
			System.out.print(x+" ");
		}
	}
}
