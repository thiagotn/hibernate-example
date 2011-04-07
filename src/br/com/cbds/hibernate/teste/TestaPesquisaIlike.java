package br.com.cbds.hibernate.teste;

import java.util.List;

import org.hibernate.Session;

import br.com.cbds.hibernate.dao.FuncionarioDao;
import br.com.cbds.hibernate.modelo.Funcionario;
import br.com.cbds.hibernate.util.HibernateUtil;

public class TestaPesquisaIlike {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		FuncionarioDao funcionarioDao = new FuncionarioDao(session);
		List<Funcionario> lista = funcionarioDao.buscaFuncionario("%ia%");
		for (Funcionario f : lista) {
			System.out.println(f.getNome());
		}
	}
}
