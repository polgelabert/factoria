import sun.plugin2.message.Message;

import java.util.HashMap;
import java.util.logging.Logger;

class Factory
{
    private static  Factory instance;
    Logger log = Logger.getLogger("hola");
    HashMap <String, Command> cache;

    private Factory()
    {
        cache = new HashMap<>();

    }

    public  static Factory getInstance()
    {
        return instance = new Factory();
    }

    public Command getCommand(String s)
    {
        Command cmd = cache.get(s);
        if(cmd== null)
        {
            log.info("No estaba guardado el Command en la caché");
            try {
                Class d = Class.forName(s);
                cmd = (Command) d.newInstance();

                cache.put(s, cmd);
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
}
