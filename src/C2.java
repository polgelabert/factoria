import java.util.logging.Logger;

public class C2 implements Command{

    Logger log = Logger.getLogger("a");

    public int execute(){
        log.info("Classe C2 executada");
        return 2;
    }
}
