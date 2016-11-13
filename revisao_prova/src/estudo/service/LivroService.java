package estudo.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import estudo.dao.LivroDAO;
import estudo.model.Livro;

@Service
public class LivroService {

	private LivroDAO dao;

	@Autowired
	public LivroService(LivroDAO dao) {
		// new LivroDAO();
		this.dao = dao;
	}

	public void Inserir(Livro livro) {
		dao.criar(livro);
	}

	public void Excluir(Livro livro) {
		dao.deletar(livro);
	}
	
	public void Alterar(Livro livro){
		dao.editar(livro);
	}

	public List<Livro> listar() throws IOException {
		return dao.listarLivros();
	}

	public List<Livro> listar(String lchave) throws IOException {
		return dao.listarLivros(lchave);
	}

	public Livro mostrar(Livro livro) {
		return dao.selecionarLivro(livro.getId());

	}
}
