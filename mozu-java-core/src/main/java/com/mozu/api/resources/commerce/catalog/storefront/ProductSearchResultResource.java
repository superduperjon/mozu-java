/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.storefront;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Provide dynamic search results to shoppers as they browse and search for products on the storefront. Suggest possible search terms as the shopper enters text.
 * </summary>
 */
public class ProductSearchResultResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public ProductSearchResultResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Searches the categories displayed on the storefront for products or product options that the shopper types in a search query.
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	ProductSearchResult productSearchResult = productsearchresult.Search();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productruntime.ProductSearchResult
	 * @see com.mozu.api.contracts.productruntime.ProductSearchResult
	 */
	public com.mozu.api.contracts.productruntime.ProductSearchResult search() throws Exception
	{
		return search( null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Searches the categories displayed on the storefront for products or product options that the shopper types in a search query.
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	ProductSearchResult productSearchResult = productsearchresult.Search( query,  filter,  facetTemplate,  facetTemplateSubset,  facet,  facetFieldRangeQuery,  facetHierPrefix,  facetHierValue,  facetHierDepth,  facetStartIndex,  facetPageSize,  facetSettings,  facetValueFilter,  sortBy,  pageSize,  startIndex);
	 * </code></pre></p>
	 * @param facet Individually list the facet fields you want to display in a storefront product search.
	 * @param facetFieldRangeQuery Display a range facet not specified in a template in a storefront product search by listing the facet field and the range to display.
	 * @param facetHierDepth If filtering using category facets in a hierarchy, the number of category hierarchy levels to return for the facet. This option is only available for category facets.
	 * @param facetHierPrefix If filtering using category facets in a hierarchy, the parent categories you want to skip in the storefront product search. This parameter is only available for category facets.
	 * @param facetHierValue If filtering using category facets in a hierarchy, the category in the hierarchy to begin faceting on. This parameter is only available for category facets.
	 * @param facetPageSize The number of facet values to return for one or more facets.
	 * @param facetSettings Settings reserved for future facet search functionality on a storefront product search.
	 * @param facetStartIndex When paging through multiple facets, the startIndex value for each facet.
	 * @param facetTemplate The facet template to use on the storefront. A template displays all facets associated with the template on the storefront product search. Currently, only category-level facet templates are available.
	 * @param facetTemplateSubset Display a subset of the facets defined in the template specified in facetTemplate parameter.
	 * @param facetValueFilter The facet values to apply to the filter.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter product search results by any of its properties, including product code, type, category, and name. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=categoryId+eq+12"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param query The terms to search on.
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.productruntime.ProductSearchResult
	 * @see com.mozu.api.contracts.productruntime.ProductSearchResult
	 */
	public com.mozu.api.contracts.productruntime.ProductSearchResult search(String query, String filter, String facetTemplate, String facetTemplateSubset, String facet, String facetFieldRangeQuery, String facetHierPrefix, String facetHierValue, String facetHierDepth, String facetStartIndex, String facetPageSize, String facetSettings, String facetValueFilter, String sortBy, Integer pageSize, Integer startIndex) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> client = com.mozu.api.clients.commerce.catalog.storefront.ProductSearchResultClient.searchClient( query,  filter,  facetTemplate,  facetTemplateSubset,  facet,  facetFieldRangeQuery,  facetHierPrefix,  facetHierValue,  facetHierDepth,  facetStartIndex,  facetPageSize,  facetSettings,  facetValueFilter,  sortBy,  pageSize,  startIndex);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Suggests possible search terms as the shopper enters search text.
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	SearchSuggestion searchSuggestion = productsearchresult.Suggest();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productruntime.SearchSuggestion
	 * @see com.mozu.api.contracts.productruntime.SearchSuggestion
	 */
	public com.mozu.api.contracts.productruntime.SearchSuggestion suggest() throws Exception
	{
		return suggest( null,  null);
	}

	/**
	 * Suggests possible search terms as the shopper enters search text.
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	SearchSuggestion searchSuggestion = productsearchresult.Suggest( q,  pageSize);
	 * </code></pre></p>
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param q Text that the shopper is currently entering.
	 * @return com.mozu.api.contracts.productruntime.SearchSuggestion
	 * @see com.mozu.api.contracts.productruntime.SearchSuggestion
	 */
	public com.mozu.api.contracts.productruntime.SearchSuggestion suggest(String q, Integer pageSize) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestion> client = com.mozu.api.clients.commerce.catalog.storefront.ProductSearchResultClient.suggestClient( q,  pageSize);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}


