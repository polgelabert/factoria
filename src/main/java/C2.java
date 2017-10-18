import java.util.logging.Logger;

public class C2 implements Command{

    Logger log = Logger.getLogger("a");

    public int execute(){
        log.info("Clase C2 ejecutada.");
        return 2;
    }
}
