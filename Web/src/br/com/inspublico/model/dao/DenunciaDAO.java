package br.com.inspublico.model.dao;

import java.util.List;

import br.com.inspublico.model.domain.Denuncia;



public interface DenunciaDAO {


	Denuncia findByProtocolo(Integer protocolo);

	List<Denuncia> listar();

	void remover(Denuncia denuncia);

	Denuncia salvarOuAtualizar(Denuncia denuncia);
	
	
	
	
}
