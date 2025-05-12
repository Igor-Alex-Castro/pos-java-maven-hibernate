package pos_java_maven_hibernate.pos_java_maven_hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtil {
	
	public static EntityManagerFactory factory = null;
	
	static {
		init();
	}
	
	private static void init() {
		try {
			if(factory == null) {
				factory = Persistence.createEntityManagerFactory("pos-java-maven-hibernate");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	
}
