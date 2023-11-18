package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
    
	private String name = "Upskill";
	private int ssn = 495758;
	private String username = "Swapon";
	
	
	//Setter Method -name                       //set the data,write
	public void setName(String value){
		
		name=value;
	}
	
	//Getter Method -name                       //get the data,Read
	
	public String getName(){
		
		return name;
	}
	
	//ssn- Setter Method
	
	public void setSSN(int value){
		
		ssn=value;
	}
	
	//username-Getter Method
	
        public String getUserName(){
		
		return username;
	}
	
	public static void main(String[] args) {
		

		Encapsulation obj = new Encapsulation();
		obj.setName("Swapon");
		
		System.out.println(obj.getName());
		
		obj.setSSN(495758);
		System.out.println(obj.getUserName());
	}

}
