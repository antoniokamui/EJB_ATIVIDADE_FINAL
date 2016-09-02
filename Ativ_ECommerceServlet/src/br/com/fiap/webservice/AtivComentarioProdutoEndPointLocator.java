package br.com.fiap.webservice;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;

public class AtivComentarioProdutoEndPointLocator  extends Service implements AtivComentarioProdutoEndPoint {

    public AtivComentarioProdutoEndPointLocator() {
    }


    public AtivComentarioProdutoEndPointLocator(EngineConfiguration config) {
        super(config);
    }

    public AtivComentarioProdutoEndPointLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ComentarioEndpointPort
    private String AtivComentarioProdutoEndpointPort_address = "http://localhost:8080/Ativ_ECommerceJSF/AtivComentarioProdutoEndPoint/AtivComentarioProdutoEndpoint";

    public String getAtivComentarioProdutoEndpointPortAddress() {
        return AtivComentarioProdutoEndpointPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ComentarioEndpointPortWSDDServiceName = "ComentarioEndpointPort";

    public java.lang.String getAtivComentarioProdutoEndpointPortWSDDServiceName() {
        return ComentarioEndpointPortWSDDServiceName;
    }

    public void setAtivComentarioProdutoEndpointPortWSDDServiceName(java.lang.String name) {
        ComentarioEndpointPortWSDDServiceName = name;
    }

    public IAtivComentarioProdutoEndpoint getAtivComentarioProdutoEndpointPort() throws ServiceException {
       URL endpoint;
        try {
            endpoint = new URL(AtivComentarioProdutoEndpointPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAtivComentarioProdutoEndpointPort(endpoint);
    }

    public IAtivComentarioProdutoEndpoint getAtivComentarioProdutoEndpointPort(URL portAddress) throws ServiceException {
        try {
        	AtivComentarioProdutoEndPointSoapBindingStub _stub = new AtivComentarioProdutoEndPointSoapBindingStub(portAddress, this);
            _stub.setPortName(getAtivComentarioProdutoEndpointPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAtivComentarioProdutoEndpointPortEndpointAddress(java.lang.String address) {
    	AtivComentarioProdutoEndpointPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (IAtivComentarioProdutoEndpoint.class.isAssignableFrom(serviceEndpointInterface)) {
            	AtivComentarioProdutoEndPointSoapBindingStub _stub = new AtivComentarioProdutoEndPointSoapBindingStub(new java.net.URL(AtivComentarioProdutoEndpointPort_address), this);
                _stub.setPortName(getAtivComentarioProdutoEndpointPortWSDDServiceName());
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
        if ("AtivComentarioProdutoEndpointPort".equals(inputPortName)) {
            return getAtivComentarioProdutoEndpointPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.fiap.com.br/", "AtivComentarioProdutoEndPoint");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new QName("http://webservice.fiap.com.br/", "AtivComentarioProdutoEndpointPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws ServiceException {
        
if ("AtivComentarioProdutoEndpointPort".equals(portName)) {
            setAtivComentarioProdutoEndpointPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(QName portName, java.lang.String address) throws ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }




	
}
