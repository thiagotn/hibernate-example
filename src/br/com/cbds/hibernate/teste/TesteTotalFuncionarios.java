package br.com.cbds.hibernate.teste;

import org.hibernate.Session;

import br.com.cbds.hibernate.dao.FuncionarioDao;
import br.com.cbds.hibernate.util.HibernateUtil;

public class TesteTotalFuncionarios {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		FuncionarioDao funcionarioDao = new FuncionarioDao(session);
		long total = funcionarioDao.countTotalFuncionarios();
		System.out.println(total);
	}
}
