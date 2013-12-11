import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.BrTicOs.modelo.Papel;
import com.BrTicOs.modelo.Usuario;


public class TesteUsuarioJPA {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BR-TIC-PU");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction trx = em.getTransaction();
		
		trx.begin();
		
		Usuario usuario = new Usuario("Bruno Silva", "bruno@silva.com", "123mudar");
		
		Papel papel = new Papel("Filha", "Minha alegria");
		
		usuario.setPapel(papel);
		
		papel.getUsuarios().add(usuario);
		
		em.persist(papel);
		
		//em.persist(usuario);

		trx.commit();
		
		em.close();
		
	}

}
