package ifpb.ads.exemplo.callback;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 12/04/2016, 08:02:58
 */
public class App {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CallBackPU");
        EntityManager em = emf.createEntityManager();
//        Usuario aluno = new Usuario("Madruga");
//        em.getTransaction().begin();

//        UsuarioProfessor prof =  new UsuarioProfessor("Job <3");
//        System.out.println("pré");
//        em.persist(aluno);
//        System.out.println("pós");
//        em.persist(prof);
//        System.out.println("commit");
//        em.getTransaction().commit();
        List<Usuario> lista = em
                .createQuery("SELECT a FROM Usuario a", 
                Usuario.class)
                .getResultList();
//        Usuario find = em.find(Usuario.class, 1151);
//        System.out.println("find = " + find);
           
        lista.stream().forEach(System.out::println);
    }

}
