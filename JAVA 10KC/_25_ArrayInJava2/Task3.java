package com.arrays.tasks2;
import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = sc.nextInt();
		int [] a = new int[size];
		for(int i = 0;i < a.length;i++) {
			System.out.print("Enter "+i+" position elemet : ");
			a[i] = sc.nextInt();
		}
		sc.close();
		//reverse of an array logic
		System.out.print("Array in reverse order : ");
		for(int i = size-1;i >= 0;i--) {
			System.out.print(a[i]+" ");
		}
	}


}
