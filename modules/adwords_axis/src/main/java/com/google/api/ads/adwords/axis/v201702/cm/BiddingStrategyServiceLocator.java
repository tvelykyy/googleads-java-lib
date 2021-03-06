// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * BiddingStrategyServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201702.cm;

public class BiddingStrategyServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.adwords.axis.v201702.cm.BiddingStrategyService {

    public BiddingStrategyServiceLocator() {
    }


    public BiddingStrategyServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BiddingStrategyServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BiddingStrategyServiceInterfacePort
    private java.lang.String BiddingStrategyServiceInterfacePort_address = "https://adwords.google.com/api/adwords/cm/v201702/BiddingStrategyService";

    public java.lang.String getBiddingStrategyServiceInterfacePortAddress() {
        return BiddingStrategyServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BiddingStrategyServiceInterfacePortWSDDServiceName = "BiddingStrategyServiceInterfacePort";

    public java.lang.String getBiddingStrategyServiceInterfacePortWSDDServiceName() {
        return BiddingStrategyServiceInterfacePortWSDDServiceName;
    }

    public void setBiddingStrategyServiceInterfacePortWSDDServiceName(java.lang.String name) {
        BiddingStrategyServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.adwords.axis.v201702.cm.BiddingStrategyServiceInterface getBiddingStrategyServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BiddingStrategyServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBiddingStrategyServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.adwords.axis.v201702.cm.BiddingStrategyServiceInterface getBiddingStrategyServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.adwords.axis.v201702.cm.BiddingStrategyServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201702.cm.BiddingStrategyServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getBiddingStrategyServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBiddingStrategyServiceInterfacePortEndpointAddress(java.lang.String address) {
        BiddingStrategyServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.adwords.axis.v201702.cm.BiddingStrategyServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.adwords.axis.v201702.cm.BiddingStrategyServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201702.cm.BiddingStrategyServiceSoapBindingStub(new java.net.URL(BiddingStrategyServiceInterfacePort_address), this);
                _stub.setPortName(getBiddingStrategyServiceInterfacePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BiddingStrategyServiceInterfacePort".equals(inputPortName)) {
            return getBiddingStrategyServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201702", "BiddingStrategyService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201702", "BiddingStrategyServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BiddingStrategyServiceInterfacePort".equals(portName)) {
            setBiddingStrategyServiceInterfacePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
