package classWork;

public class Main {
	public static void main(String args[]) {
		RegularUser raian = new RegularUser("Raian Hossain", "12345678");
		RegularUser robin = new RegularUser("Parvej Robin", "12345678");
		User admin = new Admin("Shazzad Hossain", "12345678", "admin");
		Post raianPost = new Post("Hello this is my first post");
		// raianPost.setPost("Hello World");
		SocialMediaApp app = new SocialMediaApp();
		
		try {
			app.addUser(raian);
			app.addUser(robin);
			app.addUser(admin);	
			app.removeUser(robin);		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("All the users:");
		app.displayAllUsers();
		System.out.println("\n");
		
		raian.addPost(raianPost);
		raianPost.like();
		raianPost.like();
		raianPost.unlike();
		System.out.println("All the posts: ");
		try {
			app.displayUserPosts("Raian Hossain");			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
