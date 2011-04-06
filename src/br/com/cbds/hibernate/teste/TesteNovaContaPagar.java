package br.com.cbds.hibernate.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.cbds.hibernate.modelo.ContaPagar;
import br.com.cbds.hibernate.modelo.Fornecedor;

public class TesteNovaContaPagar {

	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Fornecedor fornecedor = (Fornecedor) s.load(Fornecedor.class, 1L);
		
		ContaPagar cp = new ContaPagar();
		cp.setFornecedor(fornecedor);
		cp.setValor(200.0);
		cp.setPago(true);
		
		Transaction t = s.beginTransaction();
		s.save(cp);
		t.commit();
	}
	
}
