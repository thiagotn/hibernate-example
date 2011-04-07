package br.com.cbds.hibernate.teste;

import org.hibernate.Session;

import br.com.cbds.hibernate.dao.ContaPagarDao;
import br.com.cbds.hibernate.util.HibernateUtil;

public class TesteAvgValorContaPagar {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		ContaPagarDao contaPagarDao = new ContaPagarDao(session);
		double avgValor = contaPagarDao.avgValor();
		System.out.println(avgValor);
	}
}
