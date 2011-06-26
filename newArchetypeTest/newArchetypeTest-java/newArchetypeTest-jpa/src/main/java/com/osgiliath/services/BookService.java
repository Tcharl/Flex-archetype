/**
 * 
 */
package com.osgiliath.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.osgiliath.model.Book;

/**
 * @author Charlie Mordant
 *
 */
public interface BookService extends
JpaRepository<Book, Long> {
@Override
@Transactional
Book save(@Valid Book entity);

@Override
@Transactional(readOnly = true, timeout = 60)
List<Book> findAll();
@Query
Book findByTitle(String title);
@Override
@Transactional(readOnly = true)
public Book findOne(Long arg0);
}
