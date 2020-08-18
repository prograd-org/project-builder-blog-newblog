package model;

import java.time.LocalDate;

// Type your code

//blog class
public class Blog
{
	
	//arguments
	String title;
	String description;
	LocalDate postedOn;
	
	
	//getter and setter
	public String getBlogTitle() {
		return title;
	}
	public void setBlogTitle(String title) {
		this.title = title;
	}
	public String getBlogDescription() {
		return description;
	}
	public void setBlogDescription(String description) {
		this.description = description;
	}
	public LocalDate getDate() {
		return postedOn;
	}
	public void setDate(LocalDate postedOn) {
		this.postedOn = postedOn;
	}
	
	//constructor
	public Blog(String title, String description, LocalDate date)
	{
		
		this.title = title;
		this.description = description;
		this.postedOn = date;
	}
	
}
