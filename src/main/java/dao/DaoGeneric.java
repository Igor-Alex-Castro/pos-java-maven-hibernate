package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import pos_java_maven_hibernate.pos_java_maven_hibernate.HibernateUtil;

public class DaoGeneric<E> {
	
	private EntityManager entityManager = HibernateUtil.getEntityManager();
	
	public void salvar(E entidade) {
		try {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.merge(entidade); //Persiste:  entidade nova sem @id, merge: entidade existente com @id
		transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
