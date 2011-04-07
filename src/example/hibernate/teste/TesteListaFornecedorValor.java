package example.hibernate.teste;

import java.util.List;

import org.hibernate.Session;

import example.hibernate.dao.ContaPagarDao;
import example.hibernate.modelo.Fornecedor;
import example.hibernate.util.HibernateUtil;


public class TesteListaFornecedorValor {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		ContaPagarDao contaPagarDao = new ContaPagarDao(session);
		List<Object[]> lista = contaPagarDao.listaFornecedorValor(10);
		for(Object[] fv : lista) {
			Fornecedor f = (Fornecedor) fv[0];
			String situacao;
			if ((Boolean) fv[1]) {
				situacao = "Pagas";
			} else {
				situacao = "Não Pagas";
			}
			System.out.println(f.getNome() + " - " 
						+ f.getDescricao() + " - "
						+ situacao);
			System.out.printf("%.2f",fv[2]);
			System.out.println();
		}
	}
}
