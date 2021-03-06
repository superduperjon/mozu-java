/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform;

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
public class ApplicationClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.Application> mozuClient=GetApplicationClient( appId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param appId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.Application>
	 * @see com.mozu.api.contracts.installedapplications.Application
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.Application> getApplicationClient(String appId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.getApplicationUrl(appId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.installedapplications.Application.class;
		MozuClient<com.mozu.api.contracts.installedapplications.Application> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.Application> mozuClient=UpdateApplicationClient( application,  appId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param appId 
	 * @param application 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.Application>
	 * @see com.mozu.api.contracts.installedapplications.Application
	 * @see com.mozu.api.contracts.installedapplications.Application
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.Application> updateApplicationClient(com.mozu.api.contracts.installedapplications.Application application, String appId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.updateApplicationUrl(appId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.installedapplications.Application.class;
		MozuClient<com.mozu.api.contracts.installedapplications.Application> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(application);
		return mozuClient;

	}

}



