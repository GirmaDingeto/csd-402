/*
*CSD 402,Module 8.2 Assignment,05/03/2026 
*ArrayList java programming with:
*A method that receives an ArrayList populated with an 
*Integer data type holding the integers received from user input.
*The user input is to accept Integers that are then assigned to the ArrayList
*until a value of 0 is entered, which is also assigned to the ArrayList.
*The ArrayList is then to be sent to the method.
*he method is then to return the largest value in the ArrayList.
*If the ArrayList is sent in empty, the method will then return 0.
*The method signature is to be public static Integer max (ArrayList list).
*Write additional code for testing your method.
*The method will return the largest value that is displayed to the user.
 */

package com.mycompany.girmaarraylisttest;

/**
 * Girma Dingeto
 */

import java.util.ArrayList;
import java.util.Scanner;

public class GirmaArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> userList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter integers (enter 0 to stop):");
		
		while (true) {
			if (input.hasNextInt()) {
				int value = input.nextInt();
				userList.add(value);
				if (value == 0) {
					break;
				}
			} else {
				System.out.println("Please enter a valid integer.");
				input.next(); // clear invalid input
			}
		}
		
		//Testing the method with user input
		Integer maxValue = max(userList);
		System.out.println("The largest value in the list is:" + maxValue);
		
		// Additional testing for the empty list scenario
		ArrayList<Integer> emptyList = new ArrayList<>();
		System.out.println("Testing empty list (should return 0):" + max(emptyList));
	}
        
/**
 * Returns the largest value in an ArrayList of Integers.
 * Returns 0 if the list is empty
 */
	public static Integer max(ArrayList<Integer>userList) {
            if (userList == null || userList.isEmpty()) {
                return 0;
            }
            
            Integer maximum = userList.get(0);
            for(Integer num : userList){
                if(num > maximum) {
                    maximum = num;
                }
            }
            return maximum;
       }
}	



    