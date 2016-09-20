package br.usjt.arqdes16.mapeamento.dao;

import javax.persistence.EntityManager;

import java.util.List;
import br.usjt.arqdes16.mapeamento.model.Estado;

public class EstadoDAO {

	private EntityManager manager;

	public EstadoDAO(EntityManager manager) {
		this.manager = manager;
	}

	public void criar(Estado estado) {
		manager.persist(estado);
	}

	public void atualizar(Estado estado) {
		manager.merge(estado);
	}

	public void remover(Estado estado) {
		manager.remove(estado);
	}

	public Estado selecionar(String id) {
		return manager.find(Estado.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Estado> selecionarTodos() {
		return manager.createQuery("select e from Estado e").getResultList();
	}

}
