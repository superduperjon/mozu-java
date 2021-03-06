/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Facets resource to manage the facets shoppers use to filter product display results on a storefront. Facets can include categories, product attributes, or prices, and use either a range of values or discrete values.
 * </summary>
 */
public class FacetClient {
	
	/**
	 * Retrieves a facet specified by its unique identifier and displays its properties.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient=GetFacetClient(dataViewMode,  facetId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Facet facet = client.Result();
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Facet>
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Facet> getFacetClient(com.mozu.api.DataViewMode dataViewMode, Integer facetId) throws Exception
	{
		return getFacetClient(dataViewMode,  facetId,  null);
	}

	/**
	 * Retrieves a facet specified by its unique identifier and displays its properties.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient=GetFacetClient(dataViewMode,  facetId,  validate);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Facet facet = client.Result();
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to retrieve.
	 * @param validate Validates that the product category associated with a facet is active. System-supplied and read only.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Facet>
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Facet> getFacetClient(com.mozu.api.DataViewMode dataViewMode, Integer facetId, Boolean validate) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.FacetUrl.getFacetUrl(facetId, validate);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.Facet.class;
		MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves a list of the facets defined for the specified category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.FacetSet> mozuClient=GetFacetCategoryListClient(dataViewMode,  categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FacetSet facetSet = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category associated with the facets to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.FacetSet>
	 * @see com.mozu.api.contracts.productadmin.FacetSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.FacetSet> getFacetCategoryListClient(com.mozu.api.DataViewMode dataViewMode, Integer categoryId) throws Exception
	{
		return getFacetCategoryListClient(dataViewMode,  categoryId,  null,  null);
	}

	/**
	 * Retrieves a list of the facets defined for the specified category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.FacetSet> mozuClient=GetFacetCategoryListClient(dataViewMode,  categoryId,  includeAvailable,  validate);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FacetSet facetSet = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category associated with the facets to retrieve.
	 * @param includeAvailable If true, returns a list of the attributes and categories associated with a product type that have not been defined as a facet for the category.
	 * @param validate Validates that the product category associated with a facet is active. System-supplied and read only.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.FacetSet>
	 * @see com.mozu.api.contracts.productadmin.FacetSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.FacetSet> getFacetCategoryListClient(com.mozu.api.DataViewMode dataViewMode, Integer categoryId, Boolean includeAvailable, Boolean validate) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.FacetUrl.getFacetCategoryListUrl(categoryId, includeAvailable, validate);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.FacetSet.class;
		MozuClient<com.mozu.api.contracts.productadmin.FacetSet> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Creates a new category, price, or attribute facet. Supply the category or attribute source to use for the facet values.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient=AddFacetClient(dataViewMode,  facet);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Facet facet = client.Result();
	 * </code></pre></p>
	 * @param facet Properties of the new facet to create. Required properties: Source, FacetType, IsHidden, and CategoryId.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Facet>
	 * @see com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Facet> addFacetClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Facet facet) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.FacetUrl.addFacetUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.Facet.class;
		MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(facet);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Modifies one or more properties of a defined facet.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient=UpdateFacetClient(dataViewMode,  facet,  facetId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Facet facet = client.Result();
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to modify.
	 * @param facet Properties of the defined facet to modify. Required properties: Source, FacetType, IsHidden, and CategoryId.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Facet>
	 * @see com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Facet> updateFacetClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Facet facet, Integer facetId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.FacetUrl.updateFacetUrl(facetId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.Facet.class;
		MozuClient<com.mozu.api.contracts.productadmin.Facet> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(facet);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Deletes the facet specified by its unique identifier.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteFacetByIdClient(dataViewMode,  facetId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteFacetByIdClient(com.mozu.api.DataViewMode dataViewMode, Integer facetId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.FacetUrl.deleteFacetByIdUrl(facetId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



