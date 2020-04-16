
package com.svea.webpayadminservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpdateOrderResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service}UpdateOrderResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateOrderResult"
})
@XmlRootElement(name = "UpdateOrderResponse", namespace = "http://tempuri.org/")
public class UpdateOrderResponse {

    @XmlElement(name = "UpdateOrderResult", namespace = "http://tempuri.org/", nillable = true)
    protected UpdateOrderResponse2 updateOrderResult;

    /**
     * Gets the value of the updateOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderResponse2 }
     *     
     */
    public UpdateOrderResponse2 getUpdateOrderResult() {
        return updateOrderResult;
    }

    /**
     * Sets the value of the updateOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderResponse2 }
     *     
     */
    public void setUpdateOrderResult(UpdateOrderResponse2 value) {
        this.updateOrderResult = value;
    }

}
