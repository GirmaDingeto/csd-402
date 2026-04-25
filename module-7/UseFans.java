/*
 *CSD402, Module 7.2 Assignment
 *Starting with your code from the Module 6 Programming Assignment,
 *create the following new class titled UseFans:
 *Create a collection of Fan instances.
 *Create a method taking a collection of Fan instances for 
 *displaying without using the toString() method.
 *Create a method that takes a single instance of a Fan for displaying
 *without using the toString() method.
 *Use the ‘this’ reference throughout the Fan class where allowed.
 *Write test code that creates a collection of Fans and 
 *displays the functionality of all the Fan instances in the collection.
 */

package com.mycompany.usefans;

/**
 *
 * Girma Dingeto
 */

import java.util.ArrayList;
import java.util.Collection;
class Fan{

  // Constants for fan speed
	public static final int STOPPED = 0;
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	// Private fields with default values
	private int speed = STOPPED;
	private boolean on =false;
	private double radius = 6.0;
	private String color = "white";
	
	// No-argument constructor
	public Fan(){
		this.speed=STOPPED;
		this.on=false;
		this.radius=6.0;
		this.color= "white";
	}
		
	// Argument constructor
	public Fan(int speed, boolean on, double radius,String color){
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	//Getters and Setters using 'this'
	public int getSpeed() { return this.speed;}
	public void setSpeed(int speed){this.speed = speed; }
	
	public boolean isOn() { return this.on;}
	public void setOn(boolean on){this.on = on; }
	
	public double getRadius() { return this.radius;}
	public void setRadius(double radius){this.radius = radius; }
	
	public String getColor() { return this.color;}
	public void setColor(String color){this.color = color; }
	// toString method to describe fan state
	@Override
	public String toString() {
		if (this.on){
			return "Fan is on: speed=" + this.speed +", color=" + this.color +", radius=" + this.radius;
		} else {
			return "Fan is off:color=" + this.color +", radius=" + this.radius;
		}
	}
 }
	
public class UseFans {
    public static void main(String[] args) { 
	// Create a collection of Fan instances
       
	Collection<Fan> fanList=new ArrayList<>();
        
        // Add various fan instances
	fanList.add(new Fan()); // Default fan
        fanList.add(new Fan(Fan.FAST, true, 10, "yellow"));
	fanList.add(new Fan(Fan.MEDIUM, true, 8, "blue"));
	fanList.add(new Fan(Fan.STOPPED, false ,5, "red"));
        // Display the Collection
	System.out.println("--- UseFans: Displaying Collection---\n");
	displayFans(fanList);
}
// Method taking a collection of Fan instances
public static void displayFans(Collection<Fan> fans) {
	for (Fan fan : fans ){
            displayFan(fan);
        
            System.out.print("\n");
		
	}
}


// Method taking a single instance of Fan Without Using toString()
public static void displayFan(Fan fan){
	System.out.println("Fan Status:" +( fan.isOn()? "ON": "OFF"));
	System.out.println("Speed: " + fan.getSpeed());
        System.out.println("Radius: " + fan.getRadius());
	System.out.println("Color: " + fan.getColor());	
         
    }
 }
