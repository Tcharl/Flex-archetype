/**
 * 
 */
package com.osgiliath.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.osgiliath.model.Author;
import com.osgiliath.model.Book;

/**
 * @author Charlie
 * 
 */
@Service
public class AuthorFlexServiceImpl implements AuthorFlexService {

	@Resource
	AuthorService authorService;
	@Resource
	BookService bookService;

	@Override
	public Author createNew() {
		return new Author();
	}

	@Override
	public Author edit(Author author) {
		return author;
	}

	@Override
	public List<Author> getAll() {
		return authorService.findAll();

	}

	@Override
	public Author save(Author author) {
		
		author = authorService.save(author);
		for (Book b : author.getBooks()) {
			b.setAuthor(author);
			bookService.save(b);
		}
		return author;
	}

	@Override
	public Author findById(Long id) {
		return authorService.findOne(id);

	}

	@Override
	public void remove(Long id) {
		authorService.delete(findById(id));
	}

}
