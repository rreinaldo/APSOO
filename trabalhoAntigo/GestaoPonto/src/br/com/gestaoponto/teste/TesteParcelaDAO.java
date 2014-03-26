package br.com.gestaoponto.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.gestaoponto.persistencia.dao.FeriasDAO;
import br.com.gestaoponto.persistencia.dao.ParcelaDAO;
import br.com.gestaoponto.persistencia.entidade.Ferias;
import br.com.gestaoponto.persistencia.entidade.Parcela;

public class TesteParcelaDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ParcelaDAO parceladao = new ParcelaDAO();
		
		
		
		List<Parcela> lista = new ArrayList<Parcela>();
		Ferias ferias = new FeriasDAO().getPorId(1);
		
		lista = parceladao.getListaPorFerias(ferias);
		
		for (Parcela parcela : lista) {
			//System.out.println("Ferias:"+ parcela.getFerias().getId());
			System.out.println("Id:"+parcela.getId().toString());
			System.out.println("Inicio:"+parcela.getData_ini().toString());
			System.out.println("Fim:"+parcela.getData_fim().toString());
			
		}
	}

}
