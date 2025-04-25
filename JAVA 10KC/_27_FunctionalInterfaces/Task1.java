package com.anonymous.tasks;

interface NumberChecker{
	boolean checkNumber(int num);
}

interface CharChecker{
	void checkChar(char ch);
}

public class Task1 {
	public static boolean isPrime(int num) {
		boolean isPrime = true;
		for(int i = 2;i < Math.sqrt(num);i++) {
			if(num % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
	public static void main(String[] args) {
		
		NumberChecker numCheck = new NumberChecker() {
			
			@Override
			public boolean checkNumber(int num) {
				return isPrime(num);
			}
		};
		
		System.out.println(numCheck.checkNumber(7)?"Number is Prime":"Number is Not Prime");
		
		CharChecker charCheck = new CharChecker() {
			
			@Override
			public void checkChar(char ch) {
				System.out.println(isPrime(ch)?"ASCII value is Prime":"ASCII value is Not Prime");
			}
		};
		
		charCheck.checkChar('B');
	}
	
}
