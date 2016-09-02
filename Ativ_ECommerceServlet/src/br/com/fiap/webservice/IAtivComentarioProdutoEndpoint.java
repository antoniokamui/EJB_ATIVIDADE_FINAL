package br.com.fiap.webservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAtivComentarioProdutoEndpoint extends Remote {

	  public ComentarioProduto[] listarComentariosProduto() throws RemoteException;
	  public void inserirComentarioProduto(ComentarioProduto comentarioProd) throws RemoteException;
}
