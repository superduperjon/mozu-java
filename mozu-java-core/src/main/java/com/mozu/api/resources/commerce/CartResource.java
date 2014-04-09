/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Carts resource to manage storefront shopping carts as items are added and removed. Each time a shopper's cart is modified, the Carts resource updates the estimated total with any applicable discounts.
 * </summary>
 */
public class CartResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public CartResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves the cart specified in the request.
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	Cart cart = cart.GetCart( cartId);
	 * </code></pre></p>
	 * @param cartId Identifier of the cart to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart getCart(String cartId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.CartClient.getCartClient( cartId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a cart's contents for the current shopper. If the shopper does not have an active cart on the site, the service creates one.
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	Cart cart = cart.GetOrCreateCart();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart getOrCreateCart() throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.CartClient.getOrCreateCartClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves summary information associated with the cart of the current shopper, including the number of items, the current total, and whether the cart has expired. All anonymous idle carts that do not proceed to checkout expire after 14 days.
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CartSummary cartSummary = cart.GetCartSummary();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartSummary getCartSummary() throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary> client = com.mozu.api.clients.commerce.CartClient.getCartSummaryClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the cart of the user specified in the request.
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	Cart cart = cart.GetUserCart( userId);
	 * </code></pre></p>
	 * @param userId Unique identifier of the user whose cart you want to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart getUserCart(String userId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.CartClient.getUserCartClient( userId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves summary information associated with the cart of user specified in the request, including the number of items in the cart, the current total, and whether the cart has expired. All anonymous idle carts that do not proceed to checkout expire after 14 days.
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	CartSummary cartSummary = cart.GetUserCartSummary( userId);
	 * </code></pre></p>
	 * @param userId Unique identifier of the user whose cart details you want to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 * @see com.mozu.api.contracts.commerceruntime.carts.CartSummary
	 */
	public com.mozu.api.contracts.commerceruntime.carts.CartSummary getUserCartSummary(String userId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.CartSummary> client = com.mozu.api.clients.commerce.CartClient.getUserCartSummaryClient( userId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Update the current shopper's cart.
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	Cart cart = cart.UpdateCart( cart);
	 * </code></pre></p>
	 * @param cart All of the properties of the cart to update. The product code is required.
	 * @return com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 * @see com.mozu.api.contracts.commerceruntime.carts.Cart
	 */
	public com.mozu.api.contracts.commerceruntime.carts.Cart updateCart(com.mozu.api.contracts.commerceruntime.carts.Cart cart) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.carts.Cart> client = com.mozu.api.clients.commerce.CartClient.updateCartClient( cart);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the cart specified in the request.
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	cart.DeleteCart( cartId);
	 * </code></pre></p>
	 * @param cartId Identifier of the cart to delete.
	 * @return 
	 */
	public void deleteCart(String cartId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.CartClient.deleteCartClient( cartId);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * Deletes the cart of the currently active shopper.
	 * <p><pre><code>
	 *	Cart cart = new Cart();
	 *	cart.DeleteCurrentCart();
	 * </code></pre></p>
	 * @return 
	 */
	public void deleteCurrentCart() throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.CartClient.deleteCurrentCartClient();
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



