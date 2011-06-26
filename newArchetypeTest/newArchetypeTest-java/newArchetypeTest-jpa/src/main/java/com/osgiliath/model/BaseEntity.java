/**
 * 
 */
package com.osgiliath.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Version;

import org.granite.tide.data.DataPublishListener;

/**
 * @author Charlie Mordant
 * 
 */
@MappedSuperclass
@EntityListeners({ BaseEntity.BaseEntityListener.class,
		DataPublishListener.class })
public abstract class BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private int version;
	/* "UUID" and "UID" are Oracle reserved keywords -> "ENTITY_UID" */
	@Column(name = "ENTITY_UID", unique = true, nullable = false, updatable = false, length = 36)
	private String uid;

	/**
	 * @return the version
	 */
	@Version
	public int getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		return (o == this || (o instanceof BaseEntity && uid().equals(
				((BaseEntity) o).uid())));
	}

	@Override
	public int hashCode() {
		return uid().hashCode();
	}

	public static class BaseEntityListener {

		@PrePersist
		public void onPrePersist(BaseEntity abstractEntity) {
			abstractEntity.uid();
		}
	}

	private String uid() {
		if (uid == null)
			uid = UUID.randomUUID().toString();
		return uid;
	}

}
