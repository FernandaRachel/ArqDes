package br.usjt.arqdes16.mapeamento.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.usjt.arqdes16.mapeamento.dao.CidadeDAO;
import br.usjt.arqdes16.mapeamento.dao.EstadoDAO;
import br.usjt.arqdes16.mapeamento.model.Cidade;
import br.usjt.arqdes16.mapeamento.model.Estado;

public class CargaInicial {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pokemapa");
		EntityManager manager = factory.createEntityManager();
		EstadoDAO estadoDAO = new EstadoDAO(manager);
		CidadeDAO cidadeDAO = new CidadeDAO(manager);

		Estado estado1 = new Estado();
		estado1.setId("SP");
		estado1.setNome("São Paulo");

		Estado estado2 = new Estado();
		estado2.setId("RJ");
		estado2.setNome("Rio de Janeiro");

		Cidade cidade1 = new Cidade();
		cidade1.setNome("Jaboticabal");
		cidade1.setEstado(estado1);

		Cidade cidade2 = new Cidade();
		cidade2.setNome("Niteroi");
		cidade2.setEstado(estado2);

		manager.getTransaction().begin();
		estadoDAO.criar(estado1);
		estadoDAO.criar(estado2);
		cidadeDAO.criar(cidade1);
		cidadeDAO.criar(cidade2);
		manager.getTransaction().commit();
		manager.close();
		factory.close();

	}
}
