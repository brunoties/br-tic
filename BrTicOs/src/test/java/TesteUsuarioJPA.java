import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.BrTicOs.modelo.Atendimento;
import com.BrTicOs.modelo.Papel;
import com.BrTicOs.modelo.StatusAtendimento;
import com.BrTicOs.modelo.Tarefa;
import com.BrTicOs.modelo.Usuario;


public class TesteUsuarioJPA {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BR-TIC-PU");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction trx = em.getTransaction();
		
		trx.begin();
		
		Usuario usuario = new Usuario("Lulu", "anjo@lindo.com", "123mudar");
		//Usuario usuario = em.find(Usuario.class, 1L);
		//System.out.println(usuario.getNome());
		Papel papel = new Papel("Filha", "Minha alegria");
		
		usuario.setPapel(papel);
		
		//papel.getUsuarios().add(usuario);
		
		//Atendimento atendimento = new Atendimento();
		
//		Atendimento atendimento = em.find(Atendimento.class, 1L);
		//System.out.println(atendimento.getSolicitacao());
	/*	atendimento.setDtHrAbertura(Calendar.getInstance());
		atendimento.setItemConfiguracao("computador");
		atendimento.setSolicitacao("Não instala o FDC");
		atendimento.setObservacao("O suporte do FDC falou que não é com eles");
		atendimento.setStatus(StatusAtendimento.AGUARDANDO_ATENDIMENTO);
		atendimento.setUsuarioAbertura(usuario);*/
		
		
		em.persist(usuario);
		
//		Usuario usuario = new Usuario("a", "a@b.com", "123");
//		
//		Papel papel = em.find(Papel.class, 1L);
		
//		usuario.setPapel(papel);
		
//		em.persist(usuario);
		
		//em.persist(atendimento);
		
		/*Tarefa tarefa = new Tarefa();
		
		tarefa.setAtendimento(atendimento);
		
		tarefa.setUsuario(usuario);
		
		tarefa.setDtHrAbertura(Calendar.getInstance());
		
		tarefa.setDescricao("foi feito backup e o pc será formatado amanhã");
		
		usuario.getAtendimentos().add(atendimento);
		
		usuario.getTarefas().add(tarefa);
		
		atendimento.getTarefas().add(tarefa);
		
		em.persist(tarefa);
*/
		trx.commit();
		
		em.close();
		
	}

}
