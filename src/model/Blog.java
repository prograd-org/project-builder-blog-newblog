package model;

import java.time.LocalDate;

public class Blog {
	private String blogTitle;
	private String blogDescription;
	private LocalDate postedOn;
	
	public Blog(String blogTitle, String blogDescription, LocalDate postedOn) {
		
		this.blogTitle = blogTitle;
		this.blogDescription = blogDescription;
		this.postedOn = postedOn;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		if(blogTitle==null)
			System.out.println("Enter valid blog title");
		this.blogTitle = blogTitle;
	}
	public String getBlogDescription() {
		return blogDescription;
	}
	public void setBlogDescription(String blogDescription) {
		if(blogDescription==null)
			System.out.println("Enter valid blog description");
		this.blogDescription = blogDescription;
	}
	public LocalDate getDate() {
		return postedOn;
	}
	public void setDate(LocalDate postedOn) {
		if(postedOn==null)
			System.out.println("Enter valid postedOn");
		this.postedOn = postedOn;
	}
	
	
}
