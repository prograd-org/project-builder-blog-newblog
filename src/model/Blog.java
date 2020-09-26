package model;

import java.time.LocalDate;

// Type your code
public class Blog
{
	String BlogTitle;
	String BlogDescription;
	LocalDate Date;
	public Blog(String blogTitle, String blogDescription, LocalDate date) {
		//super();
		BlogTitle = blogTitle;
		BlogDescription = blogDescription;
		Date = date;
	}
	public Blog() {
		// TODO Auto-generated constructor stub
	}
	public String getBlogTitle() {
		return BlogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		BlogTitle = blogTitle;
	}
	public String getBlogDescription() {
		return BlogDescription;
	}
	public void setBlogDescription(String blogDescription) {
		BlogDescription = blogDescription;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	
	
	
}