package br.com.inspublico.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.inspublico.model.dao.DenunciaDAO;
import br.com.inspublico.model.domain.Denuncia;

public class DenunciaServiceImpl implements DenunciaService {

	@Inject
	private DenunciaDAO dao;

	@Override
	@Transactional
	public void salvar(Denuncia denuncia) {

		dao.salvarOuAtualizar(denuncia);
	}

	@Override
	@Transactional
	public void remover(Integer protocolo) {

		dao.remover(dao.findByProtocolo(protocolo));
	}

	@Override
	public List<Denuncia> listarTodos() {

		return dao.listar();
	}

	
	
}
