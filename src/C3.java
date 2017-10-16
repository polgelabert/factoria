import java.util.logging.Logger;

public class C3 implements Command{

    Logger log = Logger.getLogger("a");

    public void execute(){
        log.info("Classe C3 executada");
    }

}
