package br.com.fiap.beanremote;

import java.util.List;

import br.com.fiap.entity.ComentarioProduto;

public interface AtivECommerceBeanRemote {
	
	List<ComentarioProduto> listarComentariosProduto();
	
	void inserirComentarioProduto(ComentarioProduto comentario);

}
