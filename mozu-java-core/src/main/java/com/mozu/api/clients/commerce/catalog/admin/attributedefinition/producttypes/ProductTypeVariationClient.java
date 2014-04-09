/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the variations resource to preview possible product variations for a specific product type based on the option attributes defined for the product type, such as size or color.
 * </summary>
 */
public class ProductTypeVariationClient {
	
	/**
	 * Generates the variations possible for a product associated with the product type based on the option values supplied in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> mozuClient=GenerateProductVariationsClient(dataViewMode,  productOptionsIn,  productTypeId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationPagedCollection productVariationPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Unique identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @param productOptionsIn The product option attributes configured for this product type.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> generateProductVariationsClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductOption> productOptionsIn, Integer productTypeId) throws Exception
	{
		return generateProductVariationsClient(dataViewMode,  productOptionsIn,  productTypeId,  null,  null,  null,  null,  null);
	}

	/**
	 * Generates the variations possible for a product associated with the product type based on the option values supplied in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> mozuClient=GenerateProductVariationsClient(dataViewMode,  productOptionsIn,  productTypeId,  productCode,  startIndex,  pageSize,  sortBy,  filter);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationPagedCollection productVariationPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param productCode 
	 * @param productTypeId Unique identifier of the product type.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @param dataViewMode DataViewMode
	 * @param productOptionsIn The product option attributes configured for this product type.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> generateProductVariationsClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductOption> productOptionsIn, Integer productTypeId, String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeVariationUrl.generateProductVariationsUrl(filter, pageSize, productCode, productTypeId, sortBy, startIndex);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductVariationPagedCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productOptionsIn);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}


