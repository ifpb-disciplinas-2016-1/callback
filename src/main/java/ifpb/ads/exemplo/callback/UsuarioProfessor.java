package ifpb.ads.exemplo.callback;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PostPersist;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 12/04/2016, 08:00:37
 */
@Entity
@EntityListeners({Auditoria.class})
public class UsuarioProfessor implements Serializable{

    @Id
    @GeneratedValue
    private int id;
    private String nome;

    public UsuarioProfessor() {
    }

    public UsuarioProfessor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public UsuarioProfessor(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Professor{" + "id=" + id + ", nome=" + nome + '}';
    }
    
//    @PostPersist
//    public void post(){
//        System.out.println("após persistir: "+this);
//    }
    
}
