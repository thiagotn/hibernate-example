package br.com.cbds.hibernate.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.cbds.hibernate.modelo.Funcionario;

public class TesteInsere {

	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Antonio Jose");
		funcionario.setEmail("antonio.jose@cbds.inf.br");
		funcionario.setUsuario("antonio.jose");
		funcionario.setSenha("123456");
		
		Transaction t = s.beginTransaction();
		s.save(funcionario);
		t.commit();
		
		s.close();
		sf.close();
	}
	
}
