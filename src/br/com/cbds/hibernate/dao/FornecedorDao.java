package br.com.cbds.hibernate.dao;

import org.hibernate.Session;

import br.com.cbds.hibernate.modelo.Fornecedor;

public class FornecedorDao extends Dao<Fornecedor> {

	public FornecedorDao(Session session) {
		super(session, Fornecedor.class);
	}
}
