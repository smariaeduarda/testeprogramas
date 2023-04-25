package co.mariaeduarda.app;

public class User {
	
	// propriedades campo (objeto)
	private String firstName;
	private String lastName;
	
	// construtor
	public User() {
	}
	
	
	public User(String firstName, String lastName) {
		this.firstName = firstName.toUpperCase();
		this.lastName = lastName.toUpperCase();
	}
	
	//setters
	public void setFirstName(String firstName ) {
		this.firstName = firstName.toUpperCase();
	}
	
	public void setLastName(String lastName) {
		
	}
	
	// getters
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	
		
}
