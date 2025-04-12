package _21_hierarichalinheritance.task1;

public class Vehicle {
		String make;
		String model;
		int year;
		Vehicle(String make,String model,int year){
			this.make=make;
			this.model=model;
			this.year=year;
			
		}
		void displayInfo() {
			System.out.println("Vehicle It Is Used To Travel Or Carry Luggages");
		}
}
