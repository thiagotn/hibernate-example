package example.hibernate.teste;

import java.util.List;

import org.hibernate.Session;

import example.hibernate.dao.FuncionarioDao;
import example.hibernate.modelo.Funcionario;
import example.hibernate.util.HibernateUtil;


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
