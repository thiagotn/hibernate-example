package br.com.cbds.hibernate.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.cbds.hibernate.modelo.Funcionario;

public class TesteBusca {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Funcionario f = (Funcionario) s.load(Funcionario.class, 1L);
		System.out.println(f.getNome());
		System.out.println(f.getId());
	}
}
