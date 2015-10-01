package br.com.inspublico.model.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.inspublico.model.dao.DenunciaDAO;
import br.com.inspublico.model.domain.Denuncia;

public class DenunciaDaoImpl  implements DenunciaDAO {

	
	@PersistenceContext(unitName = "DenunciaPU")
	private EntityManager em;
	
	
	@Override
	public Denuncia findByProtocolo(Integer protocolo) {

		
		return em.find(Denuncia.class, protocolo);
	}

	@Override
	public List<Denuncia> listar() {
		Query query = em.createQuery("from denuncia");

		return query.getResultList();
	}

	@Override
	public void remover(Denuncia denuncia) {
		denuncia = em.merge(denuncia);

		em.remove(denuncia);
	}

	@Override
	public Denuncia salvarOuAtualizar(Denuncia denuncia) {

		if (denuncia.getProtocolo() != null) {
			denuncia = em.merge(denuncia);
		}


		em.persist(denuncia);
		

		
		
		return denuncia;
	}

}
