package model;

import java.time.LocalDate;

// Type your code
/*
Progression - 1
Create a class called Blog inside the model package with the following arguments
String title
int description
LocalDate postedOn
Generate appropriate getters and setters.
Generate a 3 argument constructor in the Blog class.
*/
public class Blog{
	String title;
	String description;
	LocalDate postedOn;
	public Blog(String title, String blogDescription, LocalDate postedOn) {
		super();
		this.title = title;
		this.description = blogDescription;
		this.postedOn = postedOn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(LocalDate postedOn) {
		this.postedOn = postedOn;
	}
	
	
}