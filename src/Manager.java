
public class Manager extends Person {
	
	private int numberOfResponsiblePerson;

	public Manager(int id, String firstName, String lastName, int numberOfResponsiblePerson) {
		
		super(id, firstName, lastName);
		this.numberOfResponsiblePerson = numberOfResponsiblePerson;
	}
	
	@Override
	public void information() {
		
		super.information();
		System.out.println("Number of responsible person: " + numberOfResponsiblePerson);
	}
	
	public void makeARaise(int raiseAmount) {
		
		System.out.println("A raise is being made: " + raiseAmount);
		
	}
}
