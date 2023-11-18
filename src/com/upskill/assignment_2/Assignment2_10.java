package com.upskill.assignment_2;
import java.util.Scanner;
public class Assignment2_10 {
	
	//Write a java program to convert temperature from Fahrenheit to Celsius degree


	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter temperature in Fahrenheit: ");
	        double fahrenheit = scanner.nextDouble();

	        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

	        System.out.println("Temperature in Celsius: " + celsius + "°C");

	        scanner.close();
	    }
	}



