package com.anonymous.tasks;

import java.util.function.Function;

class SensorData{
	private double temperature;
	private double humidity;
	
	public SensorData(double temperature , double humidity) {
		this.temperature = temperature;
		this.humidity = humidity;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
}

public class Task2 {
	double threshold = 25.0;
	
	public static void main(String[] args) {
		Task2 obj = new Task2();
		SensorData sd1 = new SensorData(36,5);
		
		Function<SensorData , Double> getTemp = new Function<SensorData, Double>() {
			public Double apply(SensorData sd ) {
				return sd.getTemperature();
			}
		};
		
		double temp = getTemp.apply(sd1);
		System.out.println(temp);
		
		Function<Double , Boolean> isAboveThreshold = new Function<Double ,Boolean>(){
			public Boolean apply(Double temperature) {
				return temperature > obj.threshold;
			}
		};
		
		System.out.println(isAboveThreshold.apply(sd1.getTemperature()));
		
	}
}
