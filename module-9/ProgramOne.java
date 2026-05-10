/*
CSD 402,Module 9.2 Assignment,05/10/2026

*Program 1: Write a program that uses an ArrayList filled with a minimum 
*of 10 Strings. Use a ‘for-each’ loop to print the ArrayList collection. 
*Then ask a user which element they would like to see again. Then, attempt to 
*print the element in a try/catch format, which will result in the element being 
*displayed. If the element value received is invalid, display a message that an 
*Exception has been thrown, displaying “Out of Bounds”. In this program, include 
*the use of Autoboxing/Auto-Unboxing, working with a user String input.
 */
package com.mycompany.programone;
/**
 * Girma Dingeto
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramOne {
    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	// Filling the array with 10 strings
	String[] items = {"Apple","Orange","Banana","Cherry","Grape","Date"
                                ,"Jackfruit","Blueberry","Peach","Kiwi"};
						
	//System.out.println("Current Collection:");
        for(String s:items) {
                list.add(s);
	}
	// Using for-each loop to print collection
	System.out.println("Collection contents:");
	for (String fruit:list) {
		System.out.println("-" + fruit);
	}
	//Asking user for input	
	System.out.print("\nEnter the index(0-9 ) of the element you would like to see again:");
	String userInput = input.nextLine();
                
	try {
		// Autboxing/unboxing occurs when Convertingthe String input to an Integer object
		Integer index = Integer.parseInt(userInput);
		//Auto-unboxing occurs here when accessing the primitive index
		System.out.println("You selected: " + list.get(index));
		} catch (IndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("An Exception has been thrown: Out of Bounds");
		}finally {
			input.close();}
		}
	}
			


   