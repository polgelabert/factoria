import java.util.logging.Logger;

public class C1 implements Command{

    Logger log = Logger.getLogger("a");

    public int execute(){
        log.info("Clase C1 ejecutada.");
        return 1;
    }
}
