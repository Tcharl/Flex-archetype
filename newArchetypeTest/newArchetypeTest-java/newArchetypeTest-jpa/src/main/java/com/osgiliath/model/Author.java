package com.osgiliath.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;


@Entity
public class Author extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Collection<Book> books;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the books
	 */
	@OneToMany(mappedBy = "author", fetch = FetchType.EAGER)
	public Collection<Book> getBooks() {
		return books;
	}

	/**
	 * @param books
	 *            the books to set
	 */
	public void setBooks(Collection<Book> books) {
		this.books = books;
	}

}
