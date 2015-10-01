package br.com.inspublico.model.facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import br.com.inspublico.model.domain.Denuncia;
import br.com.inspublico.model.service.DenunciaService;

public class DenunciaFacade {

	
	@Inject
	private DenunciaService service;

	@GET
	@Path("/")
	public List<Denuncia> listarTodos() {
		return service.listarTodos();
	}

	@POST
	@Path("/")
	public void salvar(Denuncia denuncia) {
		service.salvar(denuncia);
	}

	@DELETE
	@Path("/{protocolo}")
	public void remover(@PathParam("protocolo") Integer protocolo) {
		service.remover(protocolo);
	}
	
	
}
