package br.com.cbds.hibernate.teste;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.cbds.hibernate.dao.Dao;
import br.com.cbds.hibernate.modelo.Funcionario;
import br.com.cbds.hibernate.util.HibernateUtil;

public class TesteDao {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		Transaction t = session.beginTransaction();
		
		Dao<Funcionario> funcionarioDao = new Dao<Funcionario>
		(session, Funcionario.class);
		
		// Salvando no Banco de dados
		Funcionario f1 = new Funcionario();
		f1.setNome("Teste");
		funcionarioDao.save(f1);
		t.commit();
		// Buscando no Banco de dados
		Funcionario f = funcionarioDao.load(8L);
		System.out.println(f.getNome());

		// Deletando do Banco de dados
		//funcionarioDao.delete(f);
		
		
	}
}
