package classWork;

import java.util.ArrayList;

public class RegularUser extends User {
	
	public ArrayList<Post> posts = new ArrayList<Post>();
	
	RegularUser(String name, String pass) {
		super(name, pass);
	}
	
	public void displayProfile() {
		System.out.println("name " + username + "\npassword " + password);
	}
	
	public void addPost(Post post) {
		posts.add(post);
	}

	public String toString() 
    {
		String postss = super.toString() + " \nPosts: \n";
		if(posts.size() == 0) {
			throw new IllegalStateException("No posts found");
		}
		for(int i = 0; i < posts.size(); i++) {
			postss = postss + (i+1) + ". " + posts.get(i).content + " - " + posts.get(i).likes + "\n";
		}
        return(postss);
    }
}
