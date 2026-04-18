/*
 * CSD402 Module 5.2 Assigment,writting methods using 
 *public static int [ ] locateSmallest (double [ ][ ] arrayParam)
 *public static int [ ] locateSmallest (int [ ][ ] arrayParam) 
 *headers that return the location of the smallest element 
 *in the array passed to the method, returning a one-dimensional array 
 *that contains two location elements by promoting array input from user.

*/

package com.mycompany.smallestlocation;

/**
 *
 * Girma Dingeto
 */
import java.util.Scanner;
public class SmallestLocation{
    public static void main(String[] args){
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array:");
        int rows=input.nextInt();
        int columns=input.nextInt();
        double[][]arrayParam=new double[rows][columns];
        System.out.println("Enter the array:");
        for (int i = 0; i < arrayParam.length; i++) {
		for (int j =0; j < arrayParam[i].length; j++) {
                    arrayParam[i][j]=input.nextDouble();
                }
        
        
        }
        int[] location = locateSmallest(arrayParam);
        System.out.printf("The location of the smallest element is (%d, %d)%n",location[0],location[1]);
    }
/**
* Returns the row and column index of the smallest element in double array.
*/

    public static int[] locateSmallest(double[][] arrayParam){
	int[] location = {0,0};
	double min = arrayParam[0][0];
	for (int i=0; i < arrayParam.length; i++) {
		for (int j = 0; j < arrayParam[i].length; j++) {
			if (arrayParam[i][j] < min) {
				min = arrayParam[i][j];
				location[0]=i;
				location[1]=j;
			}
		}
	}
	return location;
}

/**
* Returns the row and column index of the smallest element in a 20 int array.
*/
    public static int[] locateSmallest(int[][] arrayParam){
	int[] location = {0,0};
	int min = arrayParam[0][0];
	for (int i=0; i < arrayParam.length; i++) {
		for (int j = 0; j < arrayParam[i].length; j++) {
			if (arrayParam[i][j] < min) {
				min = arrayParam[i][j];
				location[0]=i;
				location[1]=j;
			}
		}
	}
	return location;
}
}





   