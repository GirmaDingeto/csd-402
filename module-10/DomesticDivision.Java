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
