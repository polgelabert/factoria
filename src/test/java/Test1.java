import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;


public class Test1 {

    Logger log = Logger.getLogger("hola");

    @BeforeClass
    public static void  InitialSet(){ Factory test = Factory.getInstance(); }

    @AfterClass
    public static void  afterset(){ Factory test = Factory.getInstance(); }

    @Test       // Comprueba que inicialmente la caché está vacía.
    public void CacheSizetest() {
        Factory test = Factory.getInstance();       // Instancia Factory con nombre test.
        int cacheSize = test.cache.size();          // Size de la cache (inicialmente vacía).
        assertEquals(0, cacheSize);        // Assert si está vacía.
        log.info("La caché está vacía.");
    }


    @Test       // Comprueba que getCommand añade a la caché un elemento (supuestamente C1).
    public void Cachetest() {
        Factory test = Factory.getInstance();       // Instancia Factory con nombre test.
        test.getCommand("C1");                   // Se comprueba si la clase C1 está en la cache y se añade posteriormente (ya que no esta).
        int cacheSize = test.cache.size();
        assertEquals(1, cacheSize);        // Assert si hay 1 elemento en la cache.

        log.info("Se ha guardado la clase C1 en la caché y ahora tiene 1 elemento.");
    }


    @Test       // Comprueba que getCommand añade a la caché C1.
    public void Cachetest2() {
        Factory test = Factory.getInstance();       // Instancia Factory con nombre test.
        test.getCommand("C1");                   // Se comprueba si la clase C1 está en la cache y se añade posteriormente (ya que no esta).
        //test.getCommand("C2");

        // Como se convierte un Command a String??
        boolean bool = test.cache.containsKey("C1");  // true si C1 está en la caché.
        assertEquals(true, bool);
        log.info("La clase C1 está en la caché. ");
    }


}