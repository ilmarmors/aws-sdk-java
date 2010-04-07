/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Delete Vpn Gateway Request
 */
public class DeleteVpnGatewayRequest extends AmazonWebServiceRequest {

    private String vpnGatewayId;

    /**
     * Returns the value of the VpnGatewayId property for this object.
     *
     * @return The value of the VpnGatewayId property for this object.
     */
    public String getVpnGatewayId() {
        return vpnGatewayId;
    }
    
    /**
     * Sets the value of the VpnGatewayId property for this object.
     *
     * @param vpnGatewayId The new value for the VpnGatewayId property for this object.
     */
    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }
    
    /**
     * Sets the value of the VpnGatewayId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayId The new value for the VpnGatewayId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteVpnGatewayRequest withVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    
    
}
    