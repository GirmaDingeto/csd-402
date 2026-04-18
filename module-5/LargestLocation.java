/*
 *CSD402 Module 5.2 Assigment,writting methods using 
 *public static int [ ] locateLargest (double [ ][ ] arrayParam)
 *public static int [ ] locateLargest (int [ ][ ] arrayParam) 
 *headers that return the location of the smallest element 
 *in the array passed to the method, returning a one-dimensional array 
 *that contains two location elements by promoting array input from user.
 */

package com.mycompany.largestlocation;

/**
 *
 * Girma Dingeto
 */
import java.util.Scanner;
public class LargestLocation {
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
        int[] location = locateLargest(arrayParam);
        System.out.printf("The location of the largest element is (%d, %d)%n",location[0],location[1]);
    }
/*
*Returns the row and column index of the largest element in int array.
*/
    public static int[] LocateLargest(int[][] arrayParam){
	int[] location={0,0};
	int max = arrayParam[0][0];
	for (int i = 0; i < arrayParam.length; i++) {
		for (int j = 0; j < arrayParam[i].length; j++) {
			if (arrayParam[i][j]> max){
				max = arrayParam[i][j];
				location[0]=i;
				location[1]=j;
			}
		}
	}
	return location;
}
/*
*Returns the row and column index of the largest element in double array.
*/
    public static int[] locateLargest(double[][] arrayParam){
	int[] location=new int[]{0,0};
	double max = arrayParam[0][0];
	for (int i = 0; i < arrayParam.length; i++) {
		for (int j =0; j < arrayParam[i].length; j++) {
			if (arrayParam[i][j] > max){
				max = arrayParam[i][j];
				location[0]=i;
				location[1]=j;
			}
		}
	}
	return location;
}
}
