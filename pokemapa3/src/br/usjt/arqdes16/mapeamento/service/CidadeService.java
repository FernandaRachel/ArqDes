package br.usjt.arqdes16.mapeamento.service;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.arqdes16.mapeamento.dao.CidadeDAO;
import br.usjt.arqdes16.mapeamento.model.Cidade;

public class CidadeService {
	private CidadeDAO dao;
	
	public CidadeService(){
		dao = new CidadeDAO();
	}
	public ArrayList<Cidade> listarCidades() throws IOException{
		return dao.selecionarTodas();
	}
}
