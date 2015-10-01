package br.com.inspublico.model.service;

import java.util.List;

import br.com.inspublico.model.domain.Denuncia;

public interface DenunciaService {

	void salvar(Denuncia  denuncia);

	void remover(Integer protocolo);

	List<Denuncia> listarTodos();
	
}
