package example.hibernate.teste;

import org.hibernate.Session;

import example.hibernate.dao.ContaPagarDao;
import example.hibernate.util.HibernateUtil;


public class TesteSumValorContaPagar {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		ContaPagarDao contaPagarDao = new ContaPagarDao(session);
		double sumValor = contaPagarDao.sumValor();
		System.out.println(sumValor);
	}
}
