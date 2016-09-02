package br.com.fiap.webservice;

import java.net.URL;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface AtivComentarioProdutoEndPoint extends Service {
	
    public String getAtivComentarioProdutoEndpointPortAddress();

    public IAtivComentarioProdutoEndpoint getAtivComentarioProdutoEndpointPort() throws ServiceException;

    public IAtivComentarioProdutoEndpoint getAtivComentarioProdutoEndpointPort(URL portAddress) throws ServiceException;

}
