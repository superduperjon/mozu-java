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
 * Use the Extras subresource to define how a product attribute classified as an "extra" is used for a specific product type. Product attribute defintions are unique for each associated product type.
 * </summary>
 */
public class ProductTypeExtraClient {
	
	/**
	 * Retrieves a list of extra attributes defined for the specified product type.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> mozuClient=GetExtrasClient(dataViewMode,  productTypeId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AttributeInProductType>>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> getExtrasClient(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraUrl.getExtrasUrl(productTypeId);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AttributeInProductType>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeInProductType>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the details of an extra attribute definition for the specified product type.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=GetExtraClient(dataViewMode,  productTypeId,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productTypeId Identifier of the product type whose extra is being retrieved.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> getExtraClient(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraUrl.getExtraUrl(attributeFQN, productTypeId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Assigns a defined extra attribute to the product type based on the information supplied in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=AddExtraClient(dataViewMode,  attributeInProductType,  productTypeId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType The properties of the extra attribute definition for this product type assignment.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> addExtraClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraUrl.addExtraUrl(productTypeId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeInProductType);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Update the definition of an extra attribute for the specified product type.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient=UpdateExtraClient(dataViewMode,  attributeInProductType,  productTypeId,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeInProductType attributeInProductType = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @param attributeInProductType The properties of the extra attribute definition to update for the product type.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeInProductType>
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 * @see com.mozu.api.contracts.productadmin.AttributeInProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> updateExtraClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeInProductType attributeInProductType, Integer productTypeId, String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraUrl.updateExtraUrl(attributeFQN, productTypeId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeInProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeInProductType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeInProductType);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Removes an extra attribute definition from the specified product type.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteExtraClient(dataViewMode,  productTypeId,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteExtraClient(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeExtraUrl.deleteExtraUrl(attributeFQN, productTypeId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



