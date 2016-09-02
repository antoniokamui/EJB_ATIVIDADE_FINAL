package br.com.fiap.webservice;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.jws.WebService;

import br.com.fiap.beanremote.AtivECommerceBeanRemote;
import br.com.fiap.entity.ComentarioProduto;

@WebService(serviceName = "AtivComentarioProdutoEndPoint")
@Stateless
@Local(value=IAtivComentarioProdutoEndpoint.class)
public class AtivComentarioProdutoEndpoint implements IAtivComentarioProdutoEndpoint {

	@EJB
	AtivECommerceBeanRemote remote;

	@Override
	public List<ComentarioProduto> listarComentariosProduto() {
		List<ComentarioProduto> listaComentario = new ArrayList<ComentarioProduto>();
		try{
			listaComentario = remote.listarComentariosProduto();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return listaComentario;
	}

	@Override
	public void inserirComentarioProduto(ComentarioProduto comentarioProd) {
		try{
			remote.inserirComentarioProduto(comentarioProd);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
}
