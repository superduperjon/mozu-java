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
import com.mozu.api.contracts.productruntime.ProductImage;

/**
 *	Content associated with a product definition that can be localized.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductContent implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Description defined for the metadata used to internally manage information about the product.
	 */
	protected String metaTagDescription;

	public String getMetaTagDescription() {
		return this.metaTagDescription;
	}

	public void setMetaTagDescription(String metaTagDescription) {
		this.metaTagDescription = metaTagDescription;
	}

	/**
	 * Keywords defined for the metadata used to internally manage information about the product.
	 */
	protected String metaTagKeywords;

	public String getMetaTagKeywords() {
		return this.metaTagKeywords;
	}

	public void setMetaTagKeywords(String metaTagKeywords) {
		this.metaTagKeywords = metaTagKeywords;
	}

	/**
	 * Title defined for the metadata used to internally manage information about the product.
	 */
	protected String metaTagTitle;

	public String getMetaTagTitle() {
		return this.metaTagTitle;
	}

	public void setMetaTagTitle(String metaTagTitle) {
		this.metaTagTitle = metaTagTitle;
	}

	/**
	 * Full description of the product, which typically appears on the product details page.
	 */
	protected String productFullDescription;

	public String getProductFullDescription() {
		return this.productFullDescription;
	}

	public void setProductFullDescription(String productFullDescription) {
		this.productFullDescription = productFullDescription;
	}

	/**
	 * The descriptive brief product name.
	 */
	protected String productName;

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * Brief description of the product typically used when the product is displayed in a list or in search results.
	 */
	protected String productShortDescription;

	public String getProductShortDescription() {
		return this.productShortDescription;
	}

	public void setProductShortDescription(String productShortDescription) {
		this.productShortDescription = productShortDescription;
	}

	/**
	 * Product URL defined for search engine optimization.
	 */
	protected String seoFriendlyUrl;

	public String getSeoFriendlyUrl() {
		return this.seoFriendlyUrl;
	}

	public void setSeoFriendlyUrl(String seoFriendlyUrl) {
		this.seoFriendlyUrl = seoFriendlyUrl;
	}

	/**
	 * List of image files associated with the product.
	 */
	protected List<ProductImage> productImages;
	public List<ProductImage> getProductImages() {
		return this.productImages;
	}
	public void setProductImages(List<ProductImage> productImages) {
		this.productImages = productImages;
	}

}