/*
*CSD402, Module 9.2 Assignment, Program2: File I/O and Random Numbers , 05/10/2026

 *Program 2: Write a program to create a new file titled data.file, 
*if the file does not exist. Then write to the new file, adding 10 randomly 
*generated numbers, or append 10 randomly generated numbers to a previous file. 
*Each integer is to be separated by a space. Close the file, then reopen the
*file, read the data from the file, and display it.
 */
package com.mycompany.filehandler;
/**
 * Girma Dingeto
 */

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileHandler {
    public static void main(String[] args) {
	File dataFile = new File("data.file");
	Random rand = new Random();
		
	// 1. Create/Write/Append to 10 random numbers to the file
	try (FileWriter fw =new FileWriter(dataFile, true);
		PrintWriter pw = new PrintWriter(fw)) {
			
		for (int i =0; i < 10; i++) {
		//Generating random numbers and writting with space
			pw.print(rand.nextInt(100) + " ");
		}
		System.out.println("Data successfully written to data.file.");
			
	} catch (IOException e) {
		System.out.println("An error occured during writting to file: " +e.getMessage());
	}
		
	// 2. Reopen and read and display the data
	System.out.print("Reading data from file : ");
	try (Scanner fileReader = new Scanner(dataFile)) {
		while (fileReader.hasNext()) {
			System.out.print(fileReader.next() + " ");
		}
		System.out.println(); // New line after reading
	} catch (FileNotFoundException e) {
		System.out.println("File not found.");
	} 
                   
    }
}
	
