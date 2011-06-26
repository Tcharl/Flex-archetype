/**
 * 
 */
package com.osgiliath.services;

import java.util.List;

import org.granite.messaging.service.annotations.RemoteDestination;
import org.granite.tide.data.DataEnabled;
import org.granite.tide.data.DataEnabled.PublishMode;

import com.osgiliath.model.Book;

/**
 * @author Charlie
 *
 */
@RemoteDestination
@DataEnabled(topic="libraryTopic", params=ObserveAllPublishAll.class, publish=PublishMode.ON_SUCCESS)
public interface BookFlexService {
	Book createNew();
	Book edit(Book book);
	List<Book> getAll();
	Book save(Book book);
	Book findById(Long id);
	void remove(Long id);
}
