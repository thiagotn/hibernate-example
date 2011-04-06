package br.com.cbds.hibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import br.com.cbds.hibernate.modelo.Funcionario;

public class FuncionarioDao extends Dao<Funcionario> {

	public FuncionarioDao(Session session, Class persistentClass) {
		super(session, persistentClass);
	}

	@SuppressWarnings("unchecked")
	public List<Funcionario> buscaFuncionario(String nome) {
		Criteria c = getSession().createCriteria(Funcionario.class);
		c.add(Restrictions.ilike("nome", nome));
		c.addOrder(Order.asc("email"));
		return c.list();
	}

	@SuppressWarnings("unchecked")
	public List<Funcionario> buscaFuncionarioPorNomeEEmail(String nome, String email) {
		Criteria c = getSession().createCriteria(Funcionario.class);
		c.add(Restrictions.ilike("nome", nome));
		c.add(Restrictions.ilike("email", email));
		return c.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Funcionario> buscaFuncionarioOr(String nome, String email) {
		Criteria c = getSession().createCriteria(Funcionario.class);
		Criterion c1 = Restrictions.ilike("nome", nome);
		Criterion c2 = Restrictions.ilike("email", email);
		Criterion c3 = Restrictions.or(c1, c2);
		c.add(c3);
		return c.list();
	}
	
	public int countTotalFuncionarios() {
		Criteria c = getSession().createCriteria(Funcionario.class);
		c.setProjection(Projections.rowCount());
		return (Integer) (c.uniqueResult());
	}
}
