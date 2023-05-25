package classWork;

public abstract class User {
	protected String username;
	protected String password;
	
	User(String name, String password) {
		this.username = name;
		this.password = password;
	}

	public String toString() 
    {
        return ("Username: \n"+username);
    }
	
	abstract void displayProfile();
}
