package classWork;

import java.util.ArrayList;

public class SocialMediaApp {
	
	public ArrayList<User> users = new ArrayList<User>();
	
	public void addUser(User user) {
		if(user.username == null) {
			throw new IllegalArgumentException("User must not be null");
		}
		users.add(user);
	}
	public void removeUser(User user) {
		if(user.username == null) {
			throw new IllegalArgumentException("User must not be null");
		}
		int index = -1;
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).username.equals(user.username)) {
				index = i;
				break;
			}
		}
		users.remove(index);
	}
	
	public void displayAllUsers() {
		for(int i = 0; i < users.size(); i++) {
			System.out.println(i+1 + ". " + users.get(i).username);
		}
	}
	
	public void displayUserPosts(String username) {
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).username.equals(username)) {
				System.out.println(users.get(i));
				break;
			}
		}
	}
}
