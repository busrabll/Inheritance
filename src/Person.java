
public class Person {
	
	int id;
	private String firstName;
	private String lastName;
	
	public Person(int id, String firstName, String lastName) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void information() {
		
		System.out.println("Person information: ");
		System.out.println("Id: " + id);
		System.out.println("Name: " + firstName);
		System.out.println("Last Name: " + lastName);
	}
}
