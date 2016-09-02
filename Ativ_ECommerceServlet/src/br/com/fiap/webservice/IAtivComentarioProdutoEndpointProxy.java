package br.com.fiap.webservice;

import java.rmi.RemoteException;

import javax.xml.rpc.Stub;

public class IAtivComentarioProdutoEndpointProxy  implements IAtivComentarioProdutoEndpoint {

	  private String endpoint = null;
	  private IAtivComentarioProdutoEndpoint iAtivComentarioProdutoEndpoint = null;
	  
	  public IAtivComentarioProdutoEndpointProxy() {
	      initIAtivComentarioProdutoEndpointProxy();
	  }
	  
	  public IAtivComentarioProdutoEndpointProxy(String endpoint) {
	     this.endpoint = endpoint;
	     initIAtivComentarioProdutoEndpointProxy();
	  }
	  
	  private void initIAtivComentarioProdutoEndpointProxy() {
	    try {
	    	iAtivComentarioProdutoEndpoint = (new AtivComentarioProdutoEndPointLocator()).getAtivComentarioProdutoEndpointPort();
	      if (iAtivComentarioProdutoEndpoint != null) {
	        if (endpoint != null)
	          ((Stub)iAtivComentarioProdutoEndpoint)._setProperty("javax.xml.rpc.service.endpoint.address", endpoint);
	        else
	          endpoint = (String)((javax.xml.rpc.Stub)iAtivComentarioProdutoEndpoint)._getProperty("javax.xml.rpc.service.endpoint.address");
	      }
	      
	    }
	    catch (javax.xml.rpc.ServiceException serviceException) {}
	  }
	  
	  public String getEndpoint() {
	    return endpoint;
	  }
	  
	  public void setEndpoint(String endpoint) {
	    this.endpoint = endpoint;
	    if (iAtivComentarioProdutoEndpoint != null)
	      ((Stub)iAtivComentarioProdutoEndpoint)._setProperty("javax.xml.rpc.service.endpoint.address", endpoint);
	    
	  }
	  
	  public IAtivComentarioProdutoEndpoint getAtivComentarioProdutoEndpoint() {
	    if (iAtivComentarioProdutoEndpoint == null)
	    	initIAtivComentarioProdutoEndpointProxy();
	    return iAtivComentarioProdutoEndpoint;
	  }
	  
	  @Override
	  public ComentarioProduto[] listarComentariosProduto() throws RemoteException{
	    if (iAtivComentarioProdutoEndpoint == null)
	    	initIAtivComentarioProdutoEndpointProxy();
	    return iAtivComentarioProdutoEndpoint.listarComentariosProduto();
	  }
	  
	  @Override
	  public void inserirComentarioProduto(ComentarioProduto comentarioProd) throws RemoteException{
	    if (iAtivComentarioProdutoEndpoint == null)
	    	initIAtivComentarioProdutoEndpointProxy();
	    iAtivComentarioProdutoEndpoint.inserirComentarioProduto(comentarioProd);
	  }


	
}
