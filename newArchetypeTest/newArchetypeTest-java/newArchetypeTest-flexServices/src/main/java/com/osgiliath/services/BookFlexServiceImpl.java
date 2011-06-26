/**
 * 
 */
package com.osgiliath.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.osgiliath.model.Book;

/**
 * @book Charlie
 * 
 */
@Service
public class BookFlexServiceImpl implements BookFlexService {

	@Resource
	BookService bookService;


	@Override
	public Book createNew() {
		return new Book();
	}

	@Override
	public Book edit(Book book) {
		return book;
	}

	@Override
	public List<Book> getAll() {
		return bookService.findAll();

	}

	@Override
	public Book save(Book book) {
		return bookService.save(book);
	}

	@Override
	public Book findById(Long id) {
		return bookService.findOne(id);
	}

	@Override
	public void remove(Long id) {
		bookService.delete(findById(id));
	}

}
