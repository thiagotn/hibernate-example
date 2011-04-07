package example.hibernate.teste;

import java.util.List;

import org.hibernate.Session;

import example.hibernate.dao.FuncionarioDao;
import example.hibernate.modelo.Funcionario;
import example.hibernate.util.HibernateUtil;


public class TesteBuscaFucionarioSQL {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		FuncionarioDao dao = new FuncionarioDao(session);
		List<Funcionario> lista = dao.buscafuncionarioSQL();
		for (Funcionario funcionario : lista) {
			System.out.println(funcionario.getNome());
		}
	}
}
