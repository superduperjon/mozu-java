/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform.adminuser;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Displays the user accounts and account details associated with a developer or Mozu tenant administrator. Email addresses uniquely identify admin user accounts.
 * </summary>
 */
public class AdminUserResource {
	
	/**
	 * Retrieves the details of the specified administrator user account.
	 * <p><pre><code>
	 *	AdminUser adminuser = new AdminUser();
	 *	User user = adminuser.GetUser( userId);
	 * </code></pre></p>
	 * @param userId Unique identifier of the administrator account to retrieve.
	 * @return com.mozu.api.contracts.core.User
	 * @see com.mozu.api.contracts.core.User
	 */
	public com.mozu.api.contracts.core.User getUser(String userId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.User> client = com.mozu.api.clients.platform.adminuser.AdminUserClient.getUserClient( userId);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of the Mozu tenants or development stores for which the specified user has an assigned role.
	 * <p><pre><code>
	 *	AdminUser adminuser = new AdminUser();
	 *	TenantCollection tenantCollection = adminuser.GetTenantScopesForUser( userId);
	 * </code></pre></p>
	 * @param userId Unique identifier of the user whose tenant scopes you want to retrieve.
	 * @return com.mozu.api.contracts.tenant.TenantCollection
	 * @see com.mozu.api.contracts.tenant.TenantCollection
	 */
	public com.mozu.api.contracts.tenant.TenantCollection getTenantScopesForUser(String userId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.tenant.TenantCollection> client = com.mozu.api.clients.platform.adminuser.AdminUserClient.getTenantScopesForUserClient( userId);
		client.executeRequest();
		return client.getResult();

	}

}



