package br.com.fiap.webservice;

import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.XMLType;

public class AtivComentarioProdutoEndPointSoapBindingStub extends Stub implements IAtivComentarioProdutoEndpoint{

	    private java.util.Vector cachedSerClasses = new java.util.Vector();
	    private java.util.Vector cachedSerQNames = new java.util.Vector();
	    private java.util.Vector cachedSerFactories = new java.util.Vector();
	    private java.util.Vector cachedDeserFactories = new java.util.Vector();

	    static OperationDesc [] _operations;

	    static {
	        _operations = new org.apache.axis.description.OperationDesc[2];
	        _initOperationDesc1();
	    }

	    private static void _initOperationDesc1(){
	        OperationDesc oper;
	        ParameterDesc param;
	        oper = new OperationDesc();
	        oper.setName("listaComentariosProduto");
	        oper.setReturnType(new QName("http://webservice.fiap.com.br/", "comentarioProduto"));
	        oper.setReturnClass(ComentarioProduto[].class);
	        oper.setReturnQName(new QName("", "return"));
	        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
	        oper.setUse(org.apache.axis.constants.Use.LITERAL);
	        _operations[0] = oper;

	        oper = new OperationDesc();
	        oper.setName("inserirComentarioProduto");
	        param = new ParameterDesc(new QName("", "arg0"), ParameterDesc.IN, new QName("http://webservice.fiap.com.br/", "comentarioProduto"), ComentarioProduto.class, false, false);
	        param.setOmittable(true);
	        oper.addParameter(param);
	        oper.setReturnType(XMLType.AXIS_VOID);
	        oper.setStyle(Style.WRAPPED);
	        oper.setUse(Use.LITERAL);
	        _operations[1] = oper;

	    }

	    public AtivComentarioProdutoEndPointSoapBindingStub() throws AxisFault {
	         this(null);
	    }

	    public AtivComentarioProdutoEndPointSoapBindingStub(URL endpointURL, Service service) throws AxisFault {
	         this(service);
	         super.cachedEndpoint = endpointURL;
	    }

	    public AtivComentarioProdutoEndPointSoapBindingStub(Service service) throws AxisFault {
	        if (service == null) {
	            super.service = new org.apache.axis.client.Service();
	        } else {
	            super.service = service;
	        }
	        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
	            java.lang.Class cls;
	            javax.xml.namespace.QName qName;
	            javax.xml.namespace.QName qName2;
	            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
	            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
	            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
	            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
	            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
	            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
	            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
	            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
	            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
	            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
	            qName = new javax.xml.namespace.QName("http://webservice.fiap.com.br/", "comentarioProduto");
	            cachedSerQNames.add(qName);
	            cls = ComentarioProduto.class;
	            cachedSerClasses.add(cls);
	            cachedSerFactories.add(beansf);
	            cachedDeserFactories.add(beandf);

	    }

	    protected Call createCall() throws RemoteException {
	        try {
	            Call call = super._createCall();
	            if (super.maintainSessionSet) {
	                call.setMaintainSession(super.maintainSession);
	            }
	            if (super.cachedUsername != null) {
	                call.setUsername(super.cachedUsername);
	            }
	            if (super.cachedPassword != null) {
	                call.setPassword(super.cachedPassword);
	            }
	            if (super.cachedEndpoint != null) {
	                call.setTargetEndpointAddress(super.cachedEndpoint);
	            }
	            if (super.cachedTimeout != null) {
	                call.setTimeout(super.cachedTimeout);
	            }
	            if (super.cachedPortName != null) {
	                call.setPortName(super.cachedPortName);
	            }
	            java.util.Enumeration keys = super.cachedProperties.keys();
	            while (keys.hasMoreElements()) {
	                java.lang.String key = (java.lang.String) keys.nextElement();
	                call.setProperty(key, super.cachedProperties.get(key));
	            }
	            // All the type mapping information is registered
	            // when the first call is made.
	            // The type mapping information is actually registered in
	            // the TypeMappingRegistry of the service, which
	            // is the reason why registration is only needed for the first call.
	            synchronized (this) {
	                if (firstCall()) {
	                    // must set encoding style before registering serializers
	                    call.setEncodingStyle(null);
	                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
	                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
	                        javax.xml.namespace.QName qName =
	                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
	                        java.lang.Object x = cachedSerFactories.get(i);
	                        if (x instanceof Class) {
	                            java.lang.Class sf = (java.lang.Class)
	                                 cachedSerFactories.get(i);
	                            java.lang.Class df = (java.lang.Class)
	                                 cachedDeserFactories.get(i);
	                            call.registerTypeMapping(cls, qName, sf, df, false);
	                        }
	                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
	                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
	                                 cachedSerFactories.get(i);
	                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
	                                 cachedDeserFactories.get(i);
	                            call.registerTypeMapping(cls, qName, sf, df, false);
	                        }
	                    }
	                }
	            }
	            return call;
	        }
	        catch (java.lang.Throwable _t) {
	            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
	        }
	    }

	    public ComentarioProduto[] listarComentariosProduto() throws RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call call = createCall();
	        call.setOperation(_operations[0]);
	        call.setUseSOAPAction(true);
	        call.setSOAPActionURI("");
	        call.setEncodingStyle(null);
	        call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
	        call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
	        call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        call.setOperationName(new javax.xml.namespace.QName("http://webservice.fiap.com.br/", "listaComentariosProduto"));

	        setRequestHeaders(call);
	        setAttachments(call);
	 try {        java.lang.Object _resp = call.invoke(new java.lang.Object[] {});

	        if (_resp instanceof RemoteException) {
	            throw (RemoteException)_resp;
	        }
	        else {
	            extractAttachments(call);
	            try {
	                return (ComentarioProduto[]) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (ComentarioProduto[]) org.apache.axis.utils.JavaUtils.convert(_resp, ComentarioProduto[].class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

	    public void inserirComentarioProduto(ComentarioProduto arg0) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call call = createCall();
	        call.setOperation(_operations[1]);
	        call.setUseSOAPAction(true);
	        call.setSOAPActionURI("");
	        call.setEncodingStyle(null);
	        call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
	        call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
	        call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        call.setOperationName(new javax.xml.namespace.QName("http://webservice.fiap.com.br/", "inserirComentarioProduto"));

	        setRequestHeaders(call);
	        setAttachments(call);
	 try {        java.lang.Object _resp = call.invoke(new java.lang.Object[] {arg0});

	        if (_resp instanceof RemoteException) {
	            throw (RemoteException)_resp;
	        }
	        extractAttachments(call);
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }


	
	
}
