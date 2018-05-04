package bean;

public class Comment {
	String name;
	String email;
	String website;
	String feedback;
	
	public Comment(String name, String email, String website, String feedback) {
		super();
		this.name = name;
		this.email = email;
		this.website = website;
		this.feedback = feedback;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}


}
