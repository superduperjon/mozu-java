/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Fulfillment resource to manage shipments or pickups of collections of packages for an order.
 * </summary>
 */
public class FulfillmentActionClient {
	
	/**
	 * Retrieve a list of the fulfillment information for the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> mozuClient=GetFulfillmentInfoClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FulfillmentInfo fulfillmentInfo = client.Result();
	 * </code></pre></p>
	 * @param orderId Retrieves a list of the fulfillment information for the specified order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> getFulfillmentInfoClient(String orderId) throws Exception
	{
		return getFulfillmentInfoClient( orderId,  null);
	}

	/**
	 * Retrieve a list of the fulfillment information for the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> mozuClient=GetFulfillmentInfoClient( orderId,  draft);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FulfillmentInfo fulfillmentInfo = client.Result();
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order's fulfillment information, which might include uncommitted changes.
	 * @param orderId Retrieves a list of the fulfillment information for the specified order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> getFulfillmentInfoClient(String orderId, Boolean draft) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.FulfillmentActionUrl.getFulfillmentInfoUrl(draft, orderId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Sets the fulfillment action to "Ship" or "PickUp". To ship an order or prepare it for in-store pickup, the order must have a customer name, the "Open" or "OpenAndProcessing" status. To ship the order, it must also have the full shipping address and shipping method. Shipping all packages or picking up all pickups for an order will complete a paid order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=PerformFulfillmentActionClient( action,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to perform the fulfillment action.
	 * @param action The action to perform for the order fulfillment.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> performFulfillmentActionClient(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.FulfillmentActionUrl.performFulfillmentActionUrl(orderId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(action);
		return mozuClient;

	}

	/**
	 * Updates one or more propertes of fulfillment information for the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> mozuClient=SetFulFillmentInfoClient( fulfillmentInfo,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FulfillmentInfo fulfillmentInfo = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the fulfillment information to update.
	 * @param fulfillmentInfo Array of shipping fulfillment information associated with an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> setFulFillmentInfoClient(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo fulfillmentInfo, String orderId) throws Exception
	{
		return setFulFillmentInfoClient( fulfillmentInfo,  orderId,  null,  null);
	}

	/**
	 * Updates one or more propertes of fulfillment information for the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> mozuClient=SetFulFillmentInfoClient( fulfillmentInfo,  orderId,  updateMode,  version);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FulfillmentInfo fulfillmentInfo = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the fulfillment information to update.
	 * @param updateMode Specifies whether to set the fulfillment information by updating the original order, updating the order in draft mode, or updating the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param fulfillmentInfo Array of shipping fulfillment information associated with an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> setFulFillmentInfoClient(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo fulfillmentInfo, String orderId, String updateMode, String version) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.FulfillmentActionUrl.setFulFillmentInfoUrl(orderId, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(fulfillmentInfo);
		return mozuClient;

	}

}


