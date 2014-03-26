package br.com.gestaoponto.persistencia.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.gestaoponto.persistencia.entidade.DiaDaSemana;
import br.com.gestaoponto.persistencia.entidade.Marcacao;
import br.com.gestaoponto.persistencia.entidade.Marcacao;
import br.com.gestaoponto.persistencia.util.HibernateUtil;

public class MarcacaoDAO extends GenericDAO<Marcacao, Integer>{

	public List<Marcacao> getListaPorDiaDaSemana(DiaDaSemana diaDaSemana){
		Session sessao = HibernateUtil.abrirSessao();
		Query query = null;
		List<Marcacao> marcacoes = new ArrayList<Marcacao>();
		try {
			query = sessao.createQuery("from Marcacao where dia=?");
			query.setParameter(0, diaDaSemana);
			marcacoes = (List<Marcacao>)query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sessao.close();
		}
		
		return marcacoes;
	}
}
