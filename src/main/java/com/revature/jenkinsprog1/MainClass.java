package com.revature.jenkinsprog1;

public class MainClass {
	 public static void main(String[] args) {
	        System.out.println(checkIfInputIsAnEvenNumber(122)); // Testing in the main method
	    }
	    public static boolean checkIfInputIsAnEvenNumber(int number){
	        return number % 2 == 0;
	    }

}
