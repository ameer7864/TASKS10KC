package com.arrays.tasks2;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int size = sc.nextInt();
		int [] a = new int[size];
		for(int i = 0;i < size;i++) {
			System.out.print("Enter "+i+" position element: ");
			a[i] = sc.nextInt();
		}
		sc.close();
		
		int even_count = 0, odd_count = 0;
		for(int x : a) {
			if(x % 2 == 0) {
				even_count++;
			}
			else {
				odd_count++;
			}
		}
		
		System.out.println("Even count = "+even_count);
		System.out.println("Odd count = "+odd_count);
	}
}
