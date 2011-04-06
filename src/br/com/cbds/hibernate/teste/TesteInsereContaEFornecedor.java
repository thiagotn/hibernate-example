package br.com.cbds.hibernate.teste;

import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.cbds.hibernate.modelo.ContaPagar;
import br.com.cbds.hibernate.modelo.Fornecedor;

public class TesteInsereContaEFornecedor {

	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Fornecedor f = new Fornecedor();
		f.setNome("Joao da Silva");
		
		ContaPagar contaPagar = new ContaPagar();
		contaPagar.setFornecedor(f);
		contaPagar.setDescricao("Folha A4");
		contaPagar.setData(new GregorianCalendar()); 		
		contaPagar.setValor(100.0);
		
		Transaction t = s.beginTransaction();
		s.save(contaPagar);
		s.save(f);
		t.commit();
	}
	
}
