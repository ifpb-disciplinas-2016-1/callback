package ifpb.ads.exemplo.callback;

//import javax.persistence.PostPersist;
import java.util.logging.Logger;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 12/04/2016, 08:14:40
 */
public class Auditoria {

    Logger logger = Logger.getLogger("Auditoria");

    @PostPersist
    public void post(Object object) {
        System.out.println("auditoria - após persistir: " + object);
//        logger.log(Level.WARNING, "auditoria - após persistir: " + object);
    }
    @PrePersist
    public void init(Object object) {
        System.out.println("auditoria - pré persistir: " + object);
//        logger.log(Level.WARNING, "auditoria - após persistir: " + object);
    }
}
