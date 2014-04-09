/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.orders;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.commerceruntime.orders.OrderValidationMessage;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderValidationResult implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected DateTime createdDate;

	public DateTime getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = createdDate;
	}

	protected String status;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	protected String validationId;

	public String getValidationId() {
		return this.validationId;
	}

	public void setValidationId(String validationId) {
		this.validationId = validationId;
	}

	protected String validatorName;

	public String getValidatorName() {
		return this.validatorName;
	}

	public void setValidatorName(String validatorName) {
		this.validatorName = validatorName;
	}

	protected String validatorType;

	public String getValidatorType() {
		return this.validatorType;
	}

	public void setValidatorType(String validatorType) {
		this.validatorType = validatorType;
	}

	protected List<OrderValidationMessage> messages;
	public List<OrderValidationMessage> getMessages() {
		return this.messages;
	}
	public void setMessages(List<OrderValidationMessage> messages) {
		this.messages = messages;
	}

}