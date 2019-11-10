package com.train07alllongeststrings.app;
import java.util.ArrayList;
/*
 * Given an array of strings, return another 
 * array containing all of its longest strings.
 * [execution time limit] 3 seconds (java)
 * [input] array.string inputArray
 * [output] array.string
 * 
 * Guaranteed constraints:
 * 		1 <= inputArray.length <= 10,
 * 		1 <= inputArray[i].length <= 10.
 */
public class allLongestStrings {
	public static void main(String[] args) {
		String[] myArray = {"young", 
							"yooooooung", 
							"hot", 
							"or", 
							"not", 
							"come", 
							"on", 
							"fire", 
							"water", 
							"watermelon"};
		String[] arrayLongestStrings;
		
		arrayLongestStrings = allLongestStrings(myArray);
		
		for(String index : arrayLongestStrings) {
			System.out.println(index);
		}
	}
	
	public static String[] allLongestStrings(String[] inputArray) {
	    int longString = 0;
	    ArrayList<String> bigStrings = new ArrayList<String>();

	    for(int i=0; i<inputArray.length; i++){
	        if(inputArray[i].length() > longString){
	        	longString = inputArray[i].length();
	            bigStrings.clear();
	            bigStrings.add(inputArray[i]);
	        }
	        else if(inputArray[i].length() == longString){
	            bigStrings.add(inputArray[i]);
	        }
	    }
	    String[] array = new String[bigStrings.size()];
	    System.arraycopy(bigStrings.toArray(),0,array,0,bigStrings.size());
	    return array;
	}

}
