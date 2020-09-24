package model;

import java.time.LocalDate;

public class Blog{
	
	String blogTitle;
	String blogDescription;
	LocalDate date;
	
	
	
	public String getBlogTitle() {
		return blogTitle;
	}



	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}



	public String getBlogDescription() {
		return blogDescription;
	}



	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate postedOn) {
		this.date = postedOn;
	}



	public Blog(String title, String description, LocalDate postedOn) {
		super();
		this.blogTitle = title;
		this.blogDescription = description;
		this.date = postedOn;
	}
	
	
	
	
}