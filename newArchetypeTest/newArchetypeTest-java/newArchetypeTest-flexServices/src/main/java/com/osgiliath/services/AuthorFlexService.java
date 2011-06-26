/**
 * 
 */
package com.osgiliath.services;

import java.util.List;

import org.granite.messaging.service.annotations.RemoteDestination;
import org.granite.tide.data.DataEnabled;
import org.granite.tide.data.DataEnabled.PublishMode;

import com.osgiliath.model.Author;



/**
 * @author Charlie
 *
 */
@RemoteDestination
@DataEnabled(topic="libraryTopic", params=ObserveAllPublishAll.class, publish=PublishMode.ON_SUCCESS)
public interface AuthorFlexService {
	Author createNew();
	Author edit(Author author);
	List<Author> getAll();
	Author save(Author author);
	Author findById(Long id);
	void remove (Long id);
}
