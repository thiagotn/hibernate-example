package br.com.cbds.hibernate.teste;

import java.util.List;

import org.hibernate.Session;

import br.com.cbds.hibernate.dao.ContaPagarDao;
import br.com.cbds.hibernate.modelo.Fornecedor;
import br.com.cbds.hibernate.util.HibernateUtil;

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
