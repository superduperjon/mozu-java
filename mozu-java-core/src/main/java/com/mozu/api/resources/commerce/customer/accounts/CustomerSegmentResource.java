/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer.accounts;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class CustomerSegmentResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public CustomerSegmentResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CustomerSegmentCollection customerSegmentCollection = customersegment.GetAccountSegments( accountId);
	 * </code></pre></p>
	 * @param accountId 
	 * @return com.mozu.api.contracts.customer.CustomerSegmentCollection
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public com.mozu.api.contracts.customer.CustomerSegmentCollection getAccountSegments(Integer accountId) throws Exception
	{
		return getAccountSegments( accountId,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	CustomerSegment customersegment = new CustomerSegment();
	 *	CustomerSegmentCollection customerSegmentCollection = customersegment.GetAccountSegments( accountId,  startIndex,  pageSize,  sortBy,  filter);
	 * </code></pre></p>
	 * @param accountId 
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.customer.CustomerSegmentCollection
	 * @see com.mozu.api.contracts.customer.CustomerSegmentCollection
	 */
	public com.mozu.api.contracts.customer.CustomerSegmentCollection getAccountSegments(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerSegmentCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerSegmentClient.getAccountSegmentsClient( accountId,  startIndex,  pageSize,  sortBy,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



