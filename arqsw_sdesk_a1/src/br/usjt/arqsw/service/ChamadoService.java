package br.usjt.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.arqsw.dao.ChamadoDAO;
import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.entity.Fila;

public class ChamadoService {


	@SuppressWarnings({ "rawtypes", "unused" })
	private ChamadoDAO dao;
	
	@SuppressWarnings("rawtypes")
	public ChamadoService() {
		dao = new ChamadoDAO();
	}
	public ArrayList<Fila> listarChamado() throws IOException{
		return listarChamado();
	}
	public Chamado carregar(String Fila) throws IOException{
		// TODO Auto-generated method stub
		return null;
	}
}

