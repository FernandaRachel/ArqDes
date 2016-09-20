package br.usjt.arqdes16.mapeamento.dao;

import javax.persistence.EntityManager;
import java.util.List;

import br.usjt.arqdes16.mapeamento.model.Cidade;

public class CidadeDAO {

	private EntityManager manager;

	public CidadeDAO(EntityManager manager) {
		this.manager = manager;
	}

	public void criar(Cidade Cidade) {
		manager.persist(Cidade);
	}

	public void atualizar(Cidade Cidade) {
		manager.merge(Cidade);
	}

	public void remover(Cidade Cidade) {
		manager.remove(Cidade);
	}

	public Cidade selecionar(String id) {
		return manager.find(Cidade.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Cidade> selecionarTodos() {
		return manager.createQuery("select e from Cidade e").getResultList();
	}

}
