package example.hibernate.teste;

import org.hibernate.Session;

import example.hibernate.dao.FuncionarioDao;
import example.hibernate.util.HibernateUtil;


public class TesteTotalFuncionarios {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		FuncionarioDao funcionarioDao = new FuncionarioDao(session);
		long total = funcionarioDao.countTotalFuncionarios();
		System.out.println(total);
	}
}
