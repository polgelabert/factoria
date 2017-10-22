import org.apache.log4j.Logger;

public class C1 implements Command{

    Logger log = Logger.getLogger(C1.class);

    public int execute(){
        log.info("Clase C1 ejecutada.");
        return 1;
    }
}
