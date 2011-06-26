/**
 * 
 */
package com.osgiliath.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * @author Charlie Mordant
 * 
 */
@Entity
public class Book extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4858058473265909009L;
	
	private String title;
	private Author author;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	@ManyToOne()
	public Author getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}

}
