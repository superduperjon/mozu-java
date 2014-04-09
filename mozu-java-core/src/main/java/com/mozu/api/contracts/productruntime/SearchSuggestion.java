/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Suggest product search terms to a customer based on defined queries.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchSuggestion implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The query term entered by the shopper.
	 */
	protected String query;

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	/**
	 * The term suggestions to return based on the specified query value.
	 */
	protected List<String> suggestions;
	public List<String> getSuggestions() {
		return this.suggestions;
	}
	public void setSuggestions(List<String> suggestions) {
		this.suggestions = suggestions;
	}

}