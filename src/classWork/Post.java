package classWork;

public class Post implements Likeable {
	public String content;
	public int likes;
	
	Post(String content) {
		this.content = content;
		likes = 0;
	}
	public void like() {
		likes += 1;
	}
	
	public void unlike() {
		likes -= 1;
	}
	public void setPost(String cont) {
		this.content = cont;
	}

}
