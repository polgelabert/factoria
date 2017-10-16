import java.util.logging.Logger;

public class C1 implements Command{

    Logger log = Logger.getLogger("a");

    public void execute(){
        log.info("Classe C1 executada");
    }
}
