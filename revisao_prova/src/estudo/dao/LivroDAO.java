package estudo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import estudo.model.Livro;

@Repository
public class LivroDAO {
	@PersistenceContext
	EntityManager em;

	public void criar(Livro livro) {
		em.persist(livro);
		// em.persist(em.find(Livro.class, livro.getId()));
	}

	public Livro selecionarLivro(int id) {
		return em.find(Livro.class, id);
	}

	public void editar(Livro livro) {
		em.merge(em.find(Livro.class, livro));

	}

	public void deletar(Livro livro) {
		em.remove(em.find(Livro.class, livro.getId()));
	}

	@SuppressWarnings("unchecked")
	public List<Livro> listarLivros() {
		return em.createQuery("select l from Livro l").getResultList();

	}

	@SuppressWarnings("unchecked")
	public List<Livro> listarLivros(String lchave) {
		String tolist = "select l form Livro l where l.nome like :parte)";
		Query query = em.createQuery(tolist);
		query.setParameter("parte", "%" + lchave + "%");
		List<Livro> resultadoBusca = query.getResultList();
		return resultadoBusca;

	}

}
