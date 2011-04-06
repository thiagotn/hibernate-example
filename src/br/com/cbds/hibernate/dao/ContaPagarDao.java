package br.com.cbds.hibernate.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

import br.com.cbds.hibernate.modelo.ContaPagar;

public class ContaPagarDao extends Dao<ContaPagar> {

	public ContaPagarDao(Session session, Class persistentClass) {
		super(session, persistentClass);
	}

	public double avgValor() {
		Criteria c = getSession().createCriteria(ContaPagar.class);
		c.setProjection(Projections.avg("valor"));
		return (Double) (c.uniqueResult());
	}
	
	public double sumValor(){
		Criteria c = getSession().createCriteria(ContaPagar.class);
		c.setProjection(Projections.sum("valor"));
		return (Double) (c.uniqueResult());
	}
	
}
