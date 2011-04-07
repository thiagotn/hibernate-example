package example.hibernate.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import example.hibernate.modelo.Funcionario;


public class TesteInsere {

	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Thiago Nogueira");
		funcionario.setEmail("thiagotn@gmail.com");
		funcionario.setUsuario("thiagotn");
		funcionario.setSenha("123456");
		
		Transaction t = s.beginTransaction();
		s.save(funcionario);
		t.commit();
		
		s.close();
		sf.close();
	}
	
}
