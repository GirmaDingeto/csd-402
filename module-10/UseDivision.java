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

