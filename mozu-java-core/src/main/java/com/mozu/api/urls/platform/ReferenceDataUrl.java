/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.platform;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ReferenceDataUrl
{

	/**
	 * Get Resource Url for GetAddressSchema
	 * @param countryCode The 2-letter geographic code representing the country for the physical or mailing address. Currently limited to the US.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAddressSchemaUrl(String countryCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/addressschema/{countryCode}");
		formatter.formatUrl("countryCode", countryCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetAddressSchemas
	 * @return   String Resource Url
	 */
	public static MozuUrl getAddressSchemasUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/addressschemas");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetBehavior
	 * @param behaviorId ***Always private and should not be published.***
	 * @return   String Resource Url
	 */
	public static MozuUrl getBehaviorUrl(Integer behaviorId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/behaviors/{behaviorId}");
		formatter.formatUrl("behaviorId", behaviorId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetBehaviorCategories
	 * @return   String Resource Url
	 */
	public static MozuUrl getBehaviorCategoriesUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/behaviors/categories");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetBehaviorCategory
	 * @param categoryId ***Always private and should not be published.***
	 * @return   String Resource Url
	 */
	public static MozuUrl getBehaviorCategoryUrl(Integer categoryId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/behaviors/categories/{categoryId}");
		formatter.formatUrl("categoryId", categoryId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetBehaviors
	 * @param userType 
	 * @return   String Resource Url
	 */
	public static MozuUrl getBehaviorsUrl(String userType)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/behaviors?userType={userType}");
		formatter.formatUrl("userType", userType);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetContentLocales
	 * @return   String Resource Url
	 */
	public static MozuUrl getContentLocalesUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/contentLocales");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetCountries
	 * @return   String Resource Url
	 */
	public static MozuUrl getCountriesUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/countries");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetCurrencies
	 * @return   String Resource Url
	 */
	public static MozuUrl getCurrenciesUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/currencies");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetTimeZones
	 * @return   String Resource Url
	 */
	public static MozuUrl getTimeZonesUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/timezones");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetTopLevelDomains
	 * @return   String Resource Url
	 */
	public static MozuUrl getTopLevelDomainsUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/topleveldomains");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetUnitsOfMeasure
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @return   String Resource Url
	 */
	public static MozuUrl getUnitsOfMeasureUrl(String filter)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/reference/unitsofmeasure?filter={filter}");
		formatter.formatUrl("filter", filter);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

}

