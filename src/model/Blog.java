package model;

import java.time.LocalDate;

// Type your code

public class Blog{
	String title;
	String description;
	LocalDate postedOn;
	
	//appropriate getters and setters
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
	//3 argument constructor 
	public Blog(String title, String description, LocalDate postedOn) {
		super();
		this.title = title;
		this.description = description;
		this.postedOn = postedOn;
	}
	

}