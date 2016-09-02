package br.com.fiap.bean;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.fiap.beanremote.AtivECommerceBeanRemote;
import br.com.fiap.entity.ComentarioProduto;


@Local(value=AtivECommerceBeanRemote.class)
@Stateless
public class AtivECommerceBean implements AtivECommerceBeanRemote {

	@PersistenceContext(unitName = "fiapPU")
	private EntityManager em;
	
    public AtivECommerceBean() {
       
    }

	@Override
	public List<ComentarioProduto> listarComentariosProduto() {
		TypedQuery<ComentarioProduto> query = em.createQuery("From comentario_produto",ComentarioProduto.class);
		List<ComentarioProduto> resultList = query.getResultList();
		return resultList;
	}

	@Override
	public void inserirComentarioProduto(ComentarioProduto comentario) {
		em.persist(comentario);
		
	}
    
	
	@Schedule(second="*/5",minute="*",hour="*",month="*",year="*")
	public void init(){
		System.out.println(listarComentariosProduto().size());
	}
    

}
