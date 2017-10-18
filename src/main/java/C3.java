import java.util.logging.Logger;

public class C3 implements Command{

    Logger log = Logger.getLogger("a");

    public int execute(){
        log.info("Clase C3 ejecutada.");
        return 3;
    }

}
