package com.upskill.assignment_2;

public class Assignment2_5 {
	
	
	//  Write a program in Java to display the multiplication table of (eight)8.
	public static void main(String[] args){
	
	int row;
	int col;
	
	for(row=1;row<=8; row++){
		
		for (col=1; col<=8; col++){
			int multiplication =row*col;
			System.out.print( multiplication + " ");
			
		}
		
		
		System.out.println("");
		
		
	}

}
}