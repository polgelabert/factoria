import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;


public class Test1 {

    Logger log = Logger.getLogger("hola");


    @Test       // Comprueba que inicialmente la caché está vacía.
    public void CacheSizetest() {
        Factory test = Factory.getInstance();       // Instancia Factory con nombre test.
        int cacheSize = test.cache.size();          // Size de la cache (inicialmente vacía).
        assertEquals(0, cacheSize);        // Assert si está vacía.
    }


    @Test       // Comprueba que getCommand añade a la caché C1.
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
        test.getCommand("C2");

        // Como se convierte un Command a String??
       // String s = (String) test.cache.get("C2");  // esta linea peta
       // assertEquals("C2", s);

    }

/*
    @Test
    public void testCuaBuida() {
        Cola c  = new ColaImpl<Integer>(10);

        // assert statements
        assertEquals("10 x 0 must be 0", 0, c.size(), 0);
    }
*/

}