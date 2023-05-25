package classWork;

public class Admin extends User {
	protected String role;
	
	Admin(String name, String pass, String role) {
		super(name, pass);
		this.role = role;
	}

	@Override
	void displayProfile() {
		// TODO Auto-generated method stub
		System.out.println("User: " + username + "\nPassword: " + password);
	}

}
