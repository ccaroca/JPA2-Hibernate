import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Editora;

public class GeraTabelas {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("K21_livraria_pu");
		
		EntityManager manager = factory.createEntityManager();

//		Editora novaEditora = new Editora() ;
//		novaEditora.setNome("Livro de JPA e Hibernate ");
//		novaEditora.setEmail("contato@k21.com.br") ;
//		manager.persist(novaEditora);
//		manager.getTransaction().begin () ;
//		manager.getTransaction().commit () ;
		
		Editora editora1 = manager.find(Editora.class, 1L);
		Editora editora2 = manager.getReference(Editora.class, 3L);
		
		System.out.println(editora1.getNome());
		System.out.println(editora2.getNome());
		
		
		factory.close();

	}

}
