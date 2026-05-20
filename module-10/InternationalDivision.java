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
