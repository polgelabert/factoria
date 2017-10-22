//import sun.plugin2.message.Message;

import java.util.HashMap;
//import java.util.logging.Logger;          //java logger.
import org.apache.log4j.Logger;

class Factory
{
    private static  Factory instance = null;
    Logger log = Logger.getLogger(Factory.class);
    private HashMap <String, Command> cache;

    private Factory()
    {
        cache = new HashMap<>();
    }


    public  static Factory getInstance() {
        if (instance == null) instance = new Factory();         //Crea instancia Factory.

        return instance;

    }

    public Command getCommand(String s) {
        log.info ("Se solicita un command " + s);
        Command cmd = cache.get(s);
        if(cmd == null)
        {
            log.info("No estaba guardado el Command en la caché");
            try {
                Class d = Class.forName(s);             //guardamos C1 en class d.
                cmd = (Command) d.newInstance();        // Guardamos en cmd la instancia de C1.

                cache.put(s, cmd);
                log.info("Se guarda en la caché el command " + s);
            }
            catch(Exception e)
            {
                log.fatal(e.getMessage());
            }

        }
        else
        {
            log.info("El Command está en la caché");
        }

        return cmd;


    }

    public int sizeCache() {
        return this.cache.size();
    }

    public boolean hasCommand(String command) {
        return (this.cache.get(command)!=null);
    }

    public void reset() {
        this.instance = null;

    }
}
