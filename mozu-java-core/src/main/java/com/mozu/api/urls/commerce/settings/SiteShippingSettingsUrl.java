/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.settings;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class SiteShippingSettingsUrl
{

	/**
	 * Get Resource Url for GetSiteShippingSettings
	 * @return   String Resource Url
	 */
	public static MozuUrl getSiteShippingSettingsUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/shipping/");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}
