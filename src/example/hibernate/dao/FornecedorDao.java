package example.hibernate.dao;

import org.hibernate.Session;

import example.hibernate.modelo.Fornecedor;


public class FornecedorDao extends Dao<Fornecedor> {

	public FornecedorDao(Session session) {
		super(session, Fornecedor.class);
	}
}
