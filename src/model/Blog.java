package model;

import java.time.LocalDate;

// Type your code
public class Blog{
	String title;
	String description;
	LocalDate postedOn;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the postedOn
	 */
	public LocalDate getPostedOn() {
		return postedOn;
	}
	/**
	 * @param postedOn the postedOn to set
	 */
	public void setPostedOn(LocalDate postedOn) {
		this.postedOn = postedOn;
	}
	public Blog(String title, String details, LocalDate postedOn) {
		super();
		this.title = title;
		this.description = details;
		this.postedOn = postedOn;
	}
	
}