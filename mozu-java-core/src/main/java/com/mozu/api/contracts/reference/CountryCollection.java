/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.reference;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.reference.Country;

/**
 *	The paged collection of country codes and their corresponding names.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryCollection implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The number of results listed in the query collection, represented by a signed 64-bit (8-byte) integer. This value is system-supplied and read-only.
	 */
	protected Integer totalCount;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * An array list of objects in the returned collection.
	 */
	protected List<Country> items;
	public List<Country> getItems() {
		return this.items;
	}
	public void setItems(List<Country> items) {
		this.items = items;
	}

}