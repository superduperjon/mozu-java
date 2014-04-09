/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productruntime.CategoryImage;

/**
 *	Localized page content for a product category.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryContent implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The localized description of the category to display on a storefront.
	 */
	protected String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Defined description of the metadata used to manage product information internally, such as search engine optimization.
	 */
	protected String metaTagDescription;

	public String getMetaTagDescription() {
		return this.metaTagDescription;
	}

	public void setMetaTagDescription(String metaTagDescription) {
		this.metaTagDescription = metaTagDescription;
	}

	/**
	 * Defined keywords of the metadata used to manage product information internally, such as search engine optimization.
	 */
	protected String metaTagKeywords;

	public String getMetaTagKeywords() {
		return this.metaTagKeywords;
	}

	public void setMetaTagKeywords(String metaTagKeywords) {
		this.metaTagKeywords = metaTagKeywords;
	}

	/**
	 * Defined title of the metadata used to manage product information internally, such as search engine optimization.
	 */
	protected String metaTagTitle;

	public String getMetaTagTitle() {
		return this.metaTagTitle;
	}

	public void setMetaTagTitle(String metaTagTitle) {
		this.metaTagTitle = metaTagTitle;
	}

	/**
	 * Name of the product category.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Title that appears on the top of new pages associated with the product category on the storefront.
	 */
	protected String pageTitle;

	public String getPageTitle() {
		return this.pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	/**
	 * Human-readable identifier to associated with a product category to create friendly URLs.
	 */
	protected String slug;

	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	/**
	 * Array list of image media associated with the product category.
	 */
	protected List<CategoryImage> categoryImages;
	public List<CategoryImage> getCategoryImages() {
		return this.categoryImages;
	}
	public void setCategoryImages(List<CategoryImage> categoryImages) {
		this.categoryImages = categoryImages;
	}

}