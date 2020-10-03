package lab4_SE;

class Hello1 { 
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  

            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
      static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
    public static void main(String args[]) 
    { 
        int arr[] = { 12, 11, 13, 5, 6 }; 
  
        Hello1 ob = new Hello1(); 
        ob.sort(arr); 
  
        printArray(arr); 
    } 
}

//adding traversels using string tokenizer for your lab
package com.jbt;

import java.util.StringTokenizer;

/*
 * Here we will learn to split a string usign string tokenizer.
 */
public class SplitStringUsingStringTokenizer {

	public static void main(String args[]) {
		String strWithSpace = "Java Beginners Tutorial";
		String strWithDelimeter = "Hello |Hi|How";

		/*
		 * Constructs a string tokenizer for the specified string. The
		 * characters in the delim argument are the delimiters for separating
		 * tokens. Delimiter characters themselves will not be treated as
		 * tokens.
		 */
		StringTokenizer strToken = new StringTokenizer(strWithDelimeter, "|");

		/*
		 * Note* Space is the default token for StringTokenizer.
		 */
		// StringTokenizer strTokenSpace = new StringTokenizer(strWithSpace, " "); this code and below code is same.
		StringTokenizer strTokenSpace = new StringTokenizer(strWithSpace);

		System.out.println("Splitting the string on the basis of | tokens");
		while (strToken.hasMoreTokens()) {

			System.out.println(strToken.nextElement());

		}

		System.out.println("Splitting the string on the basis of Spaces");
		while (strTokenSpace.hasMoreTokens()) {

			System.out.println(strTokenSpace.nextElement());

		}

	}

}
