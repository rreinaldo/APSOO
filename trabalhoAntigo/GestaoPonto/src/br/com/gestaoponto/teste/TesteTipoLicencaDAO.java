package br.com.gestaoponto.teste;

import br.com.gestaoponto.persistencia.dao.TipoLicencaDAO;
import br.com.gestaoponto.persistencia.entidade.TipoLicenca;

public class TesteTipoLicencaDAO {
	public static void main(String[] args) {
		TipoLicencaDAO tipolicencadao = new TipoLicencaDAO();
		
		TipoLicenca tipolicenca = new TipoLicenca();
		
		tipolicenca.setNome("maternidade");
		
		tipolicencadao.cadastrar(tipolicenca);
		
	}
}
