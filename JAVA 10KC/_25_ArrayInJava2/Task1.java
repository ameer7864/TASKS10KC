package com.arrays.tasks2;
import java.util.Scanner;
public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		int [] a = new int[size];
		for(int i = 0;i < size;i++ ) {
			System.out.print("Enter "+i+" position element: ");
			a[i] = sc.nextInt();
		}
		
		sc.close();
		
		int s = 0;
		for(int x : a) {
			s += x;
		}
		System.out.println("Sum of the array elements = "+s);
	}

}
