/**
 * 
 */
package com.osgiliath.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.osgiliath.model.Author;

/**
 * @author Charlie Mordant
 * 
 */

public interface AuthorService extends JpaRepository<Author, Long> {
	@Override
	@Transactional
	Author save(@Valid Author entity);

	@Override
	@Transactional(readOnly = true)
	List<Author> findAll();

	@Override
	@Transactional(readOnly = true)
	public Author findOne(Long arg0);
}
