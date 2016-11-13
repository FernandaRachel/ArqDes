package estudo.controller;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import estudo.model.Livro;
import estudo.service.LivroService;

@Transactional
@Controller
public class ControllerPrincipal {

	private LivroService ls;

	@Autowired
	public ControllerPrincipal(LivroService ls) {
		this.ls = ls;
	}

	public ControllerPrincipal() {

	}

	@RequestMapping("livro")
	public String execute() {
		return "LivroCriar";
	}

	@RequestMapping("incluir_livro")
	public String incluir(@Valid Livro l/* , BindingResult result, Model model */) {
		ls.Inserir(l);
		// return "redirect:mostrar_livro";
		/*
		 * try { if (result.hasErrors()) { List<Livro> livros = ls.listar();
		 * model.addAttribute("livro", livros);
		 * 
		 * return "redirect:livro"; } ls.Inserir(l); return
		 * "redirect:mostrar_livro"; } catch (IOException e) {
		 * e.printStackTrace(); model.addAttribute("erro", e); }
		 */

		// model.addAttribute("livro", livro)
		// return "redirect:livro";
		return "LivroMostrar";

	}

	@RequestMapping("mostrar_livro")
	public String mostrar(Livro livro, Model model) {

		model.addAttribute("livro", ls.mostrar(livro));
		return "LivroMostrar";

	}

	@RequestMapping("alterar_livro")
	public String alterar(Livro livro) {
		ls.Alterar(livro);

		return "LivroMostrar";
	}

	@RequestMapping("excluir_livro")
	public String excluir(@Valid Livro l) {
		ls.Excluir(l);

		return "LivroListar";

	}

	@RequestMapping("listar_livro")
	public String Listagem(@Valid String lchave, Model model) {
		try {
			if (lchave == null || lchave == ("")) {
				model.addAttribute("livro", ls.listar());
			} else {
				model.addAttribute("livro", ls.listar(lchave));
			}
			return "LivroListar";
		} catch (IOException e) {
			e.printStackTrace();
			model.addAttribute("erro", e);
		}
		return "LivroListar";

	}
}
