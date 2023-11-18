package com.upskill.java_1;

public class Variables {
	
	
	//Variables in Java
	// Instance Or global variable -Variable declared in class level,outside method
	//Local variable -variables declared in methods
	//Static variables- variables belong to class and don't required creating object
	//Method parameter- variables used as method parameter
	
	public String country = "USA";     // Instance Or global variable -Variable declared in class level,outside method
	
	public static String region = "North America";  //Static variables- variables belong to class and don't required creating object

	public static void main(String[] args) {
		
		
		
		String city = "New York";
		String police ="NYPD";
		System.out.println(city);
		System.out.println(region);
		nj("Esses");
		pa("Bensalem");
        Variables obj = new Variables();
       
		System.out.println(obj.country);
        

	}

	public static void nj(String county){                        //Local variable -variables declared in methods
		String city = "Bloomfeld";
		String police = "BPD";
		
		System.out.println(city);
		System.out.println(police);
		System.out.println(city);
		System.out.println(region);
		System.out.println(county);
		
	}
	
	public static void pa(String county){                     //Method parameter- variables used as method parameter
		String city = "Phili";
		String police = "PPD";
		
		System.out.println(city);
		System.out.println(police);
		System.out.println(city);
		System.out.println(region);
		System.out.println(county);
		
		
	}
	
	
	
	
	}

