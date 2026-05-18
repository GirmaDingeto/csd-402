/*
*Create an abstract Division class with fields for a company's division name and
* account number, and an abstract display () method that will be defined in the subclasses.
*Use a constructor in the superclass that requires values for both fields.
*Create two subclasses named InternationalDivision and DomesticDivision.
*The InternationalDivision class includes a field for the country in which the division is located, 
*a field for the language spoken, and a constructor that requires all fields when created.
*The DomesticDivision class includes a field for the state in which the division is located and a 
*constructor that requires all fields when created.
*Write an application named UseDivision that creates two instances of each of these concrete classes (4 total instances).
*Save the files as: Division, InternationalDivision, DomesticDivision, and UseDivision.
 
 */
package com.mycompany.division;

/**
 *CSD402, Module10.2 Assignment
 * Girma Dingeto
 */
//File: Division.java
public abstract class Division {
	protected String divisionName;
	protected int accountNumber;
	
	public Division(String divisionName, int accountNumber) {
		this.divisionName = divisionName;
		this.accountNumber = accountNumber;
	}
	
	public abstract void display();
}


//Save file as: InternationalDivision.java
public class InternationalDivision extends Division {
	private String country;
	private String language;
	
	public InternationalDivision(String name, String account, String Country, String language){
		super(name, account);
		this.country = country;
		this.language = language;
	}
	@Override
	public void display() {
		System.out.println("International Division: " + divisionName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Country: " + country);
		System.out.println("Language: " + language);
		System.out.println("---------------------------------------");
        }
}	
// Save file as DomesticDivision.java
public class DomesticDivision extends Division {
	private String state;
	
	public DomesticDivision(String name,String account, String state) {
	super(name, account);
	this.state = state;
	}
}
	
	@Override
	public void display() {
		System.out.println("Domestic Division: " + divisionName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("State: " + state);
		System.out.println("---------------------------------------");
	}

// Save file as: UseDivision.java
public class UseDivision {
	public static void main(String[] args) {
		InternationalDivision intDiv1 = new InternationalDivision("European Sales","INT-9901","Germany","German");
		InternationalDivision intDiv2 = new InternationalDivision("Asian Operations","INT-4422","Japan","Japanese");
		
		DomesticDivision domDiv1 = newDomesticDivision("Western Region","DOM-1102","California");
		DomesticDivision domDiv2 = newDomesticDivision("East Coast Logistics","DOM-5588","New York");	
		
		intDiv1.display();
		intDiv2.display();
		domDiv1.display();
		domDiv2.display();
        }
    }

	//Save file as: InternationalDivision.java
public class InternationalDivision extends Division {
	private String country;
	private String language;
	
	public InternationalDivision(String name, String account, String Country, String language){
		super(name, account);
		this.country = country;
		this.language = language;
	}
	@Override
	public void display() {
		System.out.println("International Division: " + divisionName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Country: " + country);
		System.out.println("Language: " + language);
		System.out.println("---------------------------------------");
        }
}	
// Save file as DomesticDivision.java
public class DomesticDivision extends Division {
	private String state;
	
	public DomesticDivision(String name,String account, String state) {
	super(name, account);
	this.state = state;
	}
}
	
	@Override
	public void display() {
		System.out.println("Domestic Division: " + divisionName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("State: " + state);
		System.out.println("---------------------------------------");
	}

// Save file as: UseDivision.java
public class UseDivision {
	public static void main(String[] args) {
		InternationalDivision intDiv1 = new InternationalDivision("European Sales","INT-9901","Germany","German");
		InternationalDivision intDiv2 = new InternationalDivision("Asian Operations","INT-4422","Japan","Japanese");
		
		DomesticDivision domDiv1 = new DomesticDivision("Western Region","DOM-1102","California");
		DomesticDivision domDiv2 = new DomesticDivision("East Coast Logistics","DOM-5588","New York");	
		
		intDiv1.display();
		intDiv2.display();
		domDiv1.display();
		domDiv2.display();
        }
    }

	


	

