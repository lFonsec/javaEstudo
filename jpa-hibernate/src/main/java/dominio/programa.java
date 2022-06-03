package dominio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Pessoa;

public class programa {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo");
        EntityManager em = emf.createEntityManager();
        System.out.println();
        Pessoa p = em.find(Pessoa.class, 2);
        System.out.println(p);
        System.out.println("fim");
        em.close();
        emf.close();

    }
}
