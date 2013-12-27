package com.BrTicOs.util.jpa;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProducer {

	private EntityManagerFactory factory;
	
	public EntityManagerProducer() {
		factory = Persistence.createEntityManagerFactory("BR-TIC-PU");
	}
	
	// produz uma EntityManager em um escopo de requisicao
	@Produces @RequestScoped
	public EntityManager createEntityManager() {
		return factory.createEntityManager();
	}
	
	// ao termino do ciclo de vida do objeto do produtor, o @Disposes eh chamado
	public void closeEntityManager(@Disposes EntityManager manager) {
		manager.close();
	}
}
