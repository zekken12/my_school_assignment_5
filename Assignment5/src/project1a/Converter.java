package project1a;

import java.util.*;

import java.util.*;

public class Converter{
	final static double value1 = 9.0;
	final static double value2 = 5.0;
	final static int point = 32;
	final static double distance = 1.609;
	
	public static double CelsiustoFahrenheit(double c){
		return (c * value1/value2) + point;
		}
	public static double FahrenheittoCelsius(double f){
		return (f - point)*value2/value1;
		}
	public static double MetertoKilometer(double m){
		return distance*m;
		}
	public static double KilometertoMeter(double k){
		return k/distance;
		}
	public static void main(String[] args){
		System.out.println(CelsiustoFahrenheit(20));
		System.out.println(FahrenheittoCelsius(15.5));
		System.out.println(MetertoKilometer(25));
		System.out.println(KilometertoMeter(25));
	}

}