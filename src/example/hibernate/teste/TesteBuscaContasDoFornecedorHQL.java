package example.hibernate.teste;

import java.util.List;

import org.hibernate.Session;

import example.hibernate.dao.ContaPagarDao;
import example.hibernate.modelo.ContaPagar;
import example.hibernate.util.HibernateUtil;


public class TesteBuscaContasDoFornecedorHQL {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		ContaPagarDao dao = new ContaPagarDao(session);
		List<ContaPagar> lista = dao.listaContasDoFornecedor("%ia%");
		for (ContaPagar contaPagar : lista) {
			System.out.println(contaPagar.getId());
		}
	}
}
