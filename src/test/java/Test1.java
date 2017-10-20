import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Scanner;

import java.util.logging.Logger;


public class Test1 {
    Factory test;
    Logger log = Logger.getLogger("hola");

    @Before
    public void initialSet(){
        this.test = Factory.getInstance();
    }

    @After
    public void  afterSet(){
       Factory.getInstance().reset();
    }

    @Test       // Comprueba que inicialmente la caché está vacía.
    public void cacheSizetest() {
              // Instancia Factory con nombre test.
        int cacheSize = test.sizeCache();          // Size de la cache (inicialmente vacía).
        assertEquals(0, cacheSize);        // Assert si está vacía.
        log.info("La caché está vacía.");
    }


    @Test       // Comprueba que getCommand añade a la caché un elemento (supuestamente C1).
    public void cacheTest() {

        assertFalse(test.hasCommand("C1"));

        assertEquals(test.getCommand("C1").execute(),1);                   // Se comprueba si la clase C1 está en la cache y se añade posteriormente (ya que no esta).

        assertTrue(test.hasCommand("C1"));
        log.info("Se ha guardado la clase C1 en la caché y ahora tiene 1 elemento.");
    }





}