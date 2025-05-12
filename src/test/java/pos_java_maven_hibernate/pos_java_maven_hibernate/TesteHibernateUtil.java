package pos_java_maven_hibernate.pos_java_maven_hibernate;

import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class TesteHibernateUtil {
	
	@Test
	public void teteHibernateUtil() {
		HibernateUtil.getEntityManager();
	}
	
	@Test
	public void testeDaoGenericSalvar() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa pessoa = new UsuarioPessoa();
		//pessoa.setId(1L);
		pessoa.setIdade(45);
		pessoa.setLogin("teste");
		pessoa.setNome("Igor Alex");
		pessoa.setSenha("123");
		pessoa.setSobreNome("Edidio");
		pessoa.setEmail("igoralex8701@gmail.com");
		
		
		daoGeneric.salvar(pessoa);
		
	}
}
