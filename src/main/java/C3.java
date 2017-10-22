import org.apache.log4j.Logger;

public class C3 implements Command{

    Logger log = Logger.getLogger(C3.class);

    public int execute(){
        log.info("Clase C3 ejecutada.");
        return 3;
    }

}
