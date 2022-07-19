
public class Programmer extends Person {
	
	private String programmingLanguage;

	public Programmer(int id, String firstName, String lastName, String programmingLanguage) {
		
		super(id, firstName, lastName);
		this.programmingLanguage = programmingLanguage;
	}
	
	public void toFormat(String OS) {
		
		System.out.println(getFirstName() + " " + OS + " loading the operating system.");
	}
	
	@Override
	public void information() {
		
		super.information();
		System.out.println("Programming languages: " + programmingLanguage);
	}
}
