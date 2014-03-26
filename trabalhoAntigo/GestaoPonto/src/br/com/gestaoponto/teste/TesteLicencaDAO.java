package br.com.gestaoponto.teste;

import java.util.Calendar;
import java.util.Date;

import br.com.gestaoponto.persistencia.dao.FuncionarioDAO;
import br.com.gestaoponto.persistencia.dao.LicencaDAO;
import br.com.gestaoponto.persistencia.dao.TipoLicencaDAO;
import br.com.gestaoponto.persistencia.entidade.Funcionario;
import br.com.gestaoponto.persistencia.entidade.Licenca;
import br.com.gestaoponto.persistencia.entidade.TipoLicenca;

public class TesteLicencaDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LicencaDAO licencaDAO = new LicencaDAO();
		
		Funcionario funcionario = new FuncionarioDAO().getPorId(3);
		TipoLicenca tipolicenca = new TipoLicencaDAO().getPorId(1);
		
		Licenca licenca = new Licenca();
		Date data_ini = new Date("01/06/11");
		Date data_fim = new Date("20/06/11");
	
		licenca.setFuncionario(funcionario);
		licenca.setTipolicenca(tipolicenca);
		licenca.setData_ini(data_ini);
		licenca.setData_fim(data_fim);
		
		licencaDAO.cadastrar(licenca);
	}

}
