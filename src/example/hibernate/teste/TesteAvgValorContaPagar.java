package example.hibernate.teste;

import org.hibernate.Session;

import example.hibernate.dao.ContaPagarDao;
import example.hibernate.util.HibernateUtil;


public class TesteAvgValorContaPagar {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		ContaPagarDao contaPagarDao = new ContaPagarDao(session);
		double avgValor = contaPagarDao.avgValor();
		System.out.println(avgValor);
	}
}
