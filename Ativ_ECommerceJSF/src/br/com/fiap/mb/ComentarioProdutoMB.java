package br.com.fiap.mb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.fiap.entity.ComentarioProduto;
import br.com.fiap.webservice.IAtivComentarioProdutoEndpoint;

@ManagedBean
@RequestScoped
public class ComentarioProdutoMB {
	
	@EJB
	IAtivComentarioProdutoEndpoint endpoint;

	private ComentarioProduto comentarioProduto;
	private List<ComentarioProduto> listaComentario = new ArrayList<ComentarioProduto>();
	
	public ComentarioProdutoMB() {
		comentarioProduto = new ComentarioProduto();
		setListaComentario(new ArrayList<ComentarioProduto>());
		
	}
	
	@PostConstruct
	public void listarComentarioProduto(){
		setListaComentario(endpoint.listarComentariosProduto());
	}
	
	public void inserirComentarioProduto(){
		endpoint.inserirComentarioProduto(comentarioProduto);
		listarComentarioProduto();
	}

	public ComentarioProduto getComentarioProduto() {
		return comentarioProduto;
	}

	public void setComentarioProduto(ComentarioProduto comentario) {
		this.comentarioProduto = comentario;
	}

	public List<ComentarioProduto> getListaComentario() {
		return listaComentario;
	}

	public void setListaComentario(List<ComentarioProduto> listaComentario) {
		this.listaComentario = listaComentario;
	}

	

}
