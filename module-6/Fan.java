
/* CSD402 Module 6.2 Assignment
 *Write a program with a class titled Fan. This class is to contain:

*Four constants named STOPPED, SLOW, MEDIUM, and FAST. 
*The constants are to hold the values of 0, 1, 2, and 3, respectively.
*A private field named speed that holds one of the constant values,
*with the default being STOPPED.
*A private Boolean field titled on that specifies whether the fan is on or off.
*A private field named radius that holds the radius of the fan with 
*a default value of 6.
*A String field that holds the color, with the default being white.
*Setter and getter methods for all mutable fields.
*A no-argument constructor that sets all fields to a default value.
*A constructor takes arguments and sets values.
*Write a toString() method that returns a description of the Fans' state.
*Write test code that creates two instances of the 
*Fan class, one using the default constructor and the other using the 
*argument constructor. Write code that displays the 
*functionality of the Fan class methods.
 */

package com.mycompany.fan;

/**
 *
 * Girma Dingeto
 */
public class Fan {

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
		this.radius=6;
		this.color= "white";
	}
		
	// Argument constructor
	public Fan(int speed, boolean on, double radius,String color){
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	//Accessor and Mutator Methods
	public int getSpeed() { return speed;}
	public void setSpeed(int speed){this.speed = speed; }
	
	public boolean isOn() { return on;}
	public void setOn(boolean on){this.on = on; }
	
	public double getRadius() { return radius;}
	public void setRadius(double radius){this.radius = radius; }
	
	public String getColor() { return color;}
	public void setColor(String color){this.color = color; }
	// toString method to describe fan state
	@Override
	public String toString() {
		if (on){
			return "Fan is ON: speed=" + speed +", color=" + color +", radius=" + radius;
		} else {
			return "Fan is OFF:color=" + color +", radius=" + radius;
		}
	}
	// Main method for testing functionality
	public static void main(String[] args){
		//Instance 1: Default constructor
		Fan fan1= new Fan();
                
		// Instance2: Argument Constructor (Fast, on, Radius 10, Yellow)
		Fan fan2 = new Fan(FAST, true, 10.0,"yellow");
		
		// Display initial states
		System.out.println("Fan 1:" + fan1.toString());
		System.out.println("Fan 2:" + fan2.toString());
		
		// Demonstrate setter on Fan 1
		fan1.setSpeed(MEDIUM);
		fan1.setOn(true);
		fan1.setColor("blue");
		fan1.setRadius(8.5);
		
		System.out.println("\nUpdated Fan 1 properties:");
		
		System.out.println("New Speed: "+ fan1.getSpeed());
		System.out.println("New Color:"+ fan1.getColor());
		System.out.println("Final State: "+ fan1.toString());
                
                // Demonstrate getters
                System.out.println("Checking Fan 2 speed directly:" + fan2.getSpeed());
	}
}
		





	




