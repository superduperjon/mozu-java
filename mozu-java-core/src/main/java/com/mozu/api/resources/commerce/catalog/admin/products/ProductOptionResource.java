/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.products;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Options resource to configure the option attributes and vocabulary values for an individual product associated with the product type that uses the option attribute. Options are used to generate variations of a product.
 * </summary>
 */
public class ProductOptionResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;
	public ProductOptionResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves a list of all option attributes configured for the product specified in the request.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	ProductOption productOption = productoption.GetOptions(dataViewMode,  productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return List<com.mozu.api.contracts.productadmin.ProductOption>
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public List<com.mozu.api.contracts.productadmin.ProductOption> getOptions(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductOption>> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductOptionClient.getOptionsClient(dataViewMode,  productCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of an option attribute configuration for the specified product.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	ProductOption productOption = productoption.GetOption(dataViewMode,  productCode,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public com.mozu.api.contracts.productadmin.ProductOption getOption(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductOption> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductOptionClient.getOptionClient(dataViewMode,  productCode,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Configures an option attribute for the product specified in the request.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	ProductOption productOption = productoption.AddOption(dataViewMode,  productOption,  productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productOption Properties of the option attribute to define for the product.
	 * @return com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public com.mozu.api.contracts.productadmin.ProductOption addOption(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductOption> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductOptionClient.addOptionClient(dataViewMode,  productOption,  productCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more properties of an option attribute configured for a product.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	ProductOption productOption = productoption.UpdateOption(dataViewMode,  productOption,  productCode,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productOption Properties of the product option attribute configuration to update.
	 * @return com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public com.mozu.api.contracts.productadmin.ProductOption updateOption(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode, String attributeFQN) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductOption> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductOptionClient.updateOptionClient(dataViewMode,  productOption,  productCode,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the configuration of an option attribute for the product specified in the request.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	productoption.DeleteOption(dataViewMode,  productCode,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return 
	 */
	public void deleteOption(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.products.ProductOptionClient.deleteOptionClient(dataViewMode,  productCode,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



