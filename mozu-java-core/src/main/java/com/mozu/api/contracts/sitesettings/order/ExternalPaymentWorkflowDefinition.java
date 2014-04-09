/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.order;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.sitesettings.order.ThirdPartyCredentialField;

/**
 *	Properties of an external payment processing workflow defined for the site. At this time, only PayPal Express is supported.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPaymentWorkflowDefinition implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * If true, the associated external payment workflow definition is enabled for the site.
	 */
	protected Boolean isEnabled;

	public Boolean getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	/**
	 * The name of the external payment workflow definition.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The credential fields required to communicate with the external payment processor.
	 */
	protected List<ThirdPartyCredentialField> credentials;
	public List<ThirdPartyCredentialField> getCredentials() {
		return this.credentials;
	}
	public void setCredentials(List<ThirdPartyCredentialField> credentials) {
		this.credentials = credentials;
	}

}
