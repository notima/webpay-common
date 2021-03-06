package com.svea.webpay.common.reconciliation;

/**
 * Additional payment references for a payment.
 * 
 * @author Daniel Tamm
 *
 */
public class PaymentReference {

	public static final String WEBPAY_REF_CLIENTORDERNO = "clientOrderNo";
	public static final String WEBPAY_REF_ORDERNO = "orderNo";
	public static final String WEBPAY_REF_INVOICENO = "invoiceNo";
	public static final String WEBPAY_REF_CHECKOUTORDERID = "checkoutOrderId";
	public static final String WEBPAY_REF_TRANSACTIONID = "transactionid";
	
	private String	referenceKey;
	private String	referenceValue;
	
	public PaymentReference() {}
	
	public PaymentReference(String key, String value) {
		referenceKey = key;
		referenceValue = value;
	}
	
	public String getReferenceKey() {
		return referenceKey;
	}
	public void setReferenceKey(String referenceKey) {
		this.referenceKey = referenceKey;
	}
	public String getReferenceValue() {
		return referenceValue;
	}
	public void setReferenceValue(String referenceValue) {
		this.referenceValue = referenceValue;
	}
	
}
