package com.cg.dayone.identifiers;

public class typecasting {
	public static void main(String[] args) {
		//widening casting
	    int myInt = 9;
	    double myDouble = myInt; 
	    long myLong = 9L;
	    float myFloat=9f;
	    System.out.println(myInt);      
	    System.out.println(myDouble); 
	    System.out.println(myLong); 
	    System.out.println(myFloat); 
	    //narrowing casting
	    double myDouble1 = 9.75d;
	    int myInt1 = (int) myDouble1; 
        System.out.println(myDouble1);  
	    System.out.println(myInt1); 
	    
	  }

}
