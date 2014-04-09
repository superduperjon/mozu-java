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
 * Use the Admin User authentication tickets resource to generate and refresh authentication tickets that enable Mozu administrator or developer account users to access development or production tenants.
 * </summary>
 */
public class TenantAdminUserAuthTicketResource {
	
	/**
	 * Creates an authentication ticket for the supplied user to specify in API requests associated with the supplied tenant.
	 * <p><pre><code>
	 *	TenantAdminUserAuthTicket tenantadminuserauthticket = new TenantAdminUserAuthTicket();
	 *	TenantAdminUserAuthTicket tenantAdminUserAuthTicket = tenantadminuserauthticket.CreateUserAuthTicket( userAuthInfo);
	 * </code></pre></p>
	 * @param userAuthInfo The user authentication information required to generate the user authentication ticket, which consists of a user name and password.
	 * @return com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.core.UserAuthInfo
	 */
	public com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket createUserAuthTicket(com.mozu.api.contracts.core.UserAuthInfo userAuthInfo) throws Exception
	{
		return createUserAuthTicket( userAuthInfo,  null);
	}

	/**
	 * Creates an authentication ticket for the supplied user to specify in API requests associated with the supplied tenant.
	 * <p><pre><code>
	 *	TenantAdminUserAuthTicket tenantadminuserauthticket = new TenantAdminUserAuthTicket();
	 *	TenantAdminUserAuthTicket tenantAdminUserAuthTicket = tenantadminuserauthticket.CreateUserAuthTicket( userAuthInfo,  tenantId);
	 * </code></pre></p>
	 * @param tenantId Unique identifier of the development or production tenant for which to generate the user authentication ticket.
	 * @param userAuthInfo The user authentication information required to generate the user authentication ticket, which consists of a user name and password.
	 * @return com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.core.UserAuthInfo
	 */
	public com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket createUserAuthTicket(com.mozu.api.contracts.core.UserAuthInfo userAuthInfo, Integer tenantId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> client = com.mozu.api.clients.platform.adminuser.TenantAdminUserAuthTicketClient.createUserAuthTicketClient( userAuthInfo,  tenantId);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Generates a new user authentication ticket for the specified tenant by supplying the user's existing refresh token information.
	 * <p><pre><code>
	 *	TenantAdminUserAuthTicket tenantadminuserauthticket = new TenantAdminUserAuthTicket();
	 *	TenantAdminUserAuthTicket tenantAdminUserAuthTicket = tenantadminuserauthticket.RefreshAuthTicket( existingAuthTicket);
	 * </code></pre></p>
	 * @param existingAuthTicket Properties of the authentication ticket to refresh. The refresh token is required to complete this request.
	 * @return com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 */
	public com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket refreshAuthTicket(com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket existingAuthTicket) throws Exception
	{
		return refreshAuthTicket( existingAuthTicket,  null);
	}

	/**
	 * Generates a new user authentication ticket for the specified tenant by supplying the user's existing refresh token information.
	 * <p><pre><code>
	 *	TenantAdminUserAuthTicket tenantadminuserauthticket = new TenantAdminUserAuthTicket();
	 *	TenantAdminUserAuthTicket tenantAdminUserAuthTicket = tenantadminuserauthticket.RefreshAuthTicket( existingAuthTicket,  tenantId);
	 * </code></pre></p>
	 * @param tenantId 
	 * @param existingAuthTicket Properties of the authentication ticket to refresh. The refresh token is required to complete this request.
	 * @return com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 */
	public com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket refreshAuthTicket(com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket existingAuthTicket, Integer tenantId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> client = com.mozu.api.clients.platform.adminuser.TenantAdminUserAuthTicketClient.refreshAuthTicketClient( existingAuthTicket,  tenantId);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the authentication ticket for the user by supplying the refresh token.
	 * <p><pre><code>
	 *	TenantAdminUserAuthTicket tenantadminuserauthticket = new TenantAdminUserAuthTicket();
	 *	tenantadminuserauthticket.DeleteUserAuthTicket( refreshToken);
	 * </code></pre></p>
	 * @param refreshToken Refresh token string associated with the user authentication ticket.
	 * @return 
	 */
	public void deleteUserAuthTicket(String refreshToken) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.adminuser.TenantAdminUserAuthTicketClient.deleteUserAuthTicketClient( refreshToken);
		client.executeRequest();

	}

}



