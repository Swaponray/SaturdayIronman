package com.upskill.java_2;

public class IFElseStatement {

	public static void main(String[] args) {
		int age = 105;
		if (age<=13){
			
			System.out.println("You are children");
		}
		
		else if( age>13 && age<18){
			
			if (age <=0){
				
				
				System.out.println("invalid Age");
			} else
				
				
      	  
        	System.out.println("You are teenger") ; 
          }
		
		else if(  age>60){
			
			
			if(age>=100){
				  
	        	System.out.println("You are champion") ; 
				
			} else{
				  
	        	System.out.println("You are senior") ; 
			}
	      
		}
              else {
            	  
            	System.out.println("You are adults") ; 
              }
	
		}
}
