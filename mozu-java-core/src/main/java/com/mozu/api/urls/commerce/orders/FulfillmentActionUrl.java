/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.orders;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class FulfillmentActionUrl
{

	/**
	 * Get Resource Url for PerformFulfillmentAction
	 * @param orderId Unique identifier of the order for which to perform the fulfillment action.
	 * @return   String Resource Url
	 */
	public static MozuUrl performFulfillmentActionUrl(String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/fulfillment/actions/");
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

