import sun.plugin2.message.Message;

import java.util.HashMap;
import java.util.logging.Logger;

class Factory
{
    private static  Factory instance=null;
    Logger log = Logger.getLogger("hola");
    private HashMap <String, Command> cache;

    private Factory()
    {
        cache = new HashMap<>();
    }


    public  static Factory getInstance() {
        if (instance == null) instance = new Factory();

        return instance;
    }       //Crea instancia Factory.

    public Command getCommand(String s) {
        log.info ("Se solicita un command "+s);
        Command cmd = cache.get(s);
        if(cmd== null)
        {
            log.info("No estaba guardado el Command en la caché");
            try {
                Class d = Class.forName(s); //guardamos C1 en class d.
                cmd = (Command) d.newInstance();

                cache.put(s, cmd);
                log.info("Se guarda en la caché el command " + s);
            }
            catch(Exception e)
            {

                log.severe(e.getMessage());
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
