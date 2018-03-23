
package aplicacao;

import dominio.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulajpaPU");
        EntityManager em = emf.createEntityManager();
             
        List<Pessoa> pessoas = em.createQuery("SELECT p FROM Pessoa AS p").getResultList();


        for(Pessoa p : pessoas)
        {
            System.out.println(p);
        }
        
        em.close();
        emf.close();
        
    }
    
}
