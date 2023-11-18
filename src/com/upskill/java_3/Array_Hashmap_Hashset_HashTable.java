package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple data index
		int age =30;                                       //Variable
		int [] ageIronMan = new int[]{25, 32, 37, 21, 27}; //Array
		
		                                                
		
		//Array index  [0] [1] [2] [3] [4]
		
		
		
		
		System.out.println(" Student Age : " + ageIronMan[2]);
		System.out.println(" Total Student : " + ageIronMan.length);
		
		String [] nameIronMan = new String[]{"Swapon", "Ripon", "Laki", "Moni", "kamal","Jamal"}; 
		
		System.out.println(" Student Name : " + nameIronMan[2]);
		
		System.out.println(" Total Student : " + nameIronMan.length);
		
		
		//Multi- Dimentional Array
		
		int [][] ageIronMan2D = {{ 25, 32, 37, 21, 27}, //[0][0] [0][1] [0][2] [0][3] [0][4]
				            {26, 30, 33, 28}};          //[1][0] [1][1] [1][2] [1][3]
          
		
		System.out.println(" Student Age  2D: " + ageIronMan2D[0][2]);
		
		//Hashmap store multipul data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Swapon", 30);
		Student.put("Ripon", 23);
		Student.put("Kamal", 31);
		Student.put("Moni", 25);
		
		
		
		
		System.out.println("HashMap student Age:" + Student.get("Swapon"));
		System.out.println("HashMap student Age:" + Student.get("Ripon"));
		System.out.println("HashMap student Age:" + Student.get("Moni"));
		System.out.println("HashMap student Name:" + Student.get(31));
		
		HashMap<String, String>Capital = new HashMap<String, String>();
		
		Capital.put("USA", "Washington");
		Capital.put("Bangladesh", "Dhaka");
		Capital.put("Italy", "Romo");
		
		System.out.println(" Capital City:" + Capital.get("Bangladesh"));
		
		
		//Hashset store unordered collection containing unique value, Implementation of set interface

		HashSet<String> car = new HashSet<String>();
		
		car.add("BMW");
		car.add("Toyota");
		car.add("Tesla");
		car.add("Audi");
		
		System.out.println("Car :" +car);
		
		// Hashtable store multiple data using key-value pair, No duplicate, also is synchronized 
		//(only  one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "North America");
		
		System.out.println("Region :" + Region.get("BD"));
		
	}

}
