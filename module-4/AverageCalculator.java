/*
 * CSD402-300O, Module 4.2 Assignment, 04/12/2026
 */

package com.mycompany.averagecalculator;

/**
 *
 * Girma Dingeto
 */

import java.util.Arrays;

public class AverageCalculator {
    

	//1. Overloaded methods for short arrays
	public static short average(short[] array){
		int sum=0;
		for (short num:array){
			sum +=num;
			}
			return(short)(sum/array.length);
		}
        //2. Overloaded methods for short arrays
	public static int average(int[] array){
		long sum=0;
		for (int num: array) {
			sum += num;
			}
			return(int)(sum/array.length);
	}
        
       //3. Overloaded methods for long arrays
        
	public static long average(long[] array){
		long sum=0;
		for(long num: array){
                    sum +=num;
			}
		return(long) (sum/array.length);
	}
	
	//4. Overloaded methods for double arrays
		
	public static double average(double[] array){
			
		double sum = 0;
		for (double num:array){
			sum +=num;
		}
		return (double) (sum/array.length);
	}
		
	/* Test Program to invoke each method
	* This test program initializes four arrays of different sizes and types,then display the original
	* elements and their calculated averages */
        
	public static void main(String[] args){
		
            // Test  Arrays of different sizes:3,5,4,and 6 to verify code accuracy
		short[] shortArray={10, 20, 30};
                
		int[] intArray={100, 200, 300, 400,500};
                
		long[] longArray = {1000L, 2000L, 3000L, 4000L};
                
		double[] doubleArray = {10.5, 20.5, 30.5, 40.5, 50.5, 60.5};
			
			
		// Display results
			
		displayResult("Short", shortArray, average(shortArray));
                
		displayResult("Integer", intArray, average(intArray));
                
		displayResult("Long", longArray, average(longArray));
                
		displayResult("Double", doubleArray, average(doubleArray));
		}
		
		
	// Helper method for clean output
	private static void displayResult(String type, Object array, Object avg){
			System.out.println("Array Type: "+ type);
			if (array instanceof short[]) System.out.println("Elements: "+ Arrays.toString((short[]) array));
			else if (array instanceof int[]) System.out.println("Elements: "+ Arrays.toString((int[]) array));
			else if (array instanceof long[]) System.out.println("Elements: "+ Arrays.toString((long[]) array));
			else if (array instanceof double[]) System.out.println("Elements: "+ Arrays.toString((double[]) array));
			System.out.println("Average: " +avg);
		}




    
    }

