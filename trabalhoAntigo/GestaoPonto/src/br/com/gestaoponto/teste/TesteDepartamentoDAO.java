package br.com.gestaoponto.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.gestaoponto.persistencia.dao.DepartamentoDAO;
import br.com.gestaoponto.persistencia.entidade.Departamento;

public class TesteDepartamentoDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DepartamentoDAO departamentodao = new DepartamentoDAO();
		
	
		
		Departamento depto = new Departamento();
		
		depto = departamentodao.getPorId(1);
		
		System.out.println(depto.getNome());
		
		departamentodao.excluir(depto);
		
		
	}

}
