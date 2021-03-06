/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.customer.attributedefinition;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class AttributeUrl
{

	/**
	 * Get Resource Url for GetAttributes
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getAttributesUrl(String filter, Integer pageSize, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/attributedefinition/attributes/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAttribute
	 * @param attributeFQN 
	 * @return   String Resource Url
	 */
	public static MozuUrl getAttributeUrl(String attributeFQN)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/attributedefinition/attributes/{attributeFQN}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAttributeVocabularyValues
	 * @param attributeFQN 
	 * @return   String Resource Url
	 */
	public static MozuUrl getAttributeVocabularyValuesUrl(String attributeFQN)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/attributedefinition/attributes/{attributeFQN}/VocabularyValues");
		formatter.formatUrl("attributeFQN", attributeFQN);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

