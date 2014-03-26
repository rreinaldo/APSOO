package br.com.gestaoponto.teste;

import br.com.gestaoponto.persistencia.dao.FeriasDAO;
import br.com.gestaoponto.persistencia.dao.FuncionarioDAO;
import br.com.gestaoponto.persistencia.entidade.Ferias;
import br.com.gestaoponto.persistencia.entidade.Funcionario;

public class TesteFeriasDAO {
	public static void main(String[] args) {
		FeriasDAO feriasDAO = new FeriasDAO();
		
		Ferias ferias = new Ferias();
		
		Funcionario funcionario = new Funcionario();
		funcionario = new FuncionarioDAO().getPorId(3);
		
		ferias.setFuncionario(funcionario);
		ferias.setDias_gozados(20);
		ferias.setDias_vendidos(10);
		
		feriasDAO.cadastrar(ferias);
		
	}
}
