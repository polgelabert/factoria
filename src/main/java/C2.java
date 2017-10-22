import org.apache.log4j.Logger;

public class C2 implements Command{

    Logger log = Logger.getLogger(C2.class);

    public int execute(){
        log.info("Clase C2 ejecutada.");
        return 2;
    }
}
