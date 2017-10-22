import org.junit.*;
import static org.junit.Assert.*;


import org.apache.log4j.Logger;



public class Test1 {

    final static Logger log = Logger.getLogger(Test1.class.getName());
    Factory test;


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
        int cacheSize = test.sizeCache();          // Size de la cache (inicialmente vacía).
        assertEquals(0, cacheSize);        // Assert si está vacía.
        log.info("La caché está vacía.");
    }


    @Test       // Comprueba que getCommand añade a la caché un elemento (supuestamente C1).
    public void cacheTest() {

        assertFalse(test.hasCommand("C1"));

        assertEquals(1, test.getCommand("C1").execute());                   // Se comprueba si la clase C1 está en la cache y se añade posteriormente (ya que no esta).

        assertTrue(test.hasCommand("C1"));
        log.info("Se ha guardado la clase C1 en la caché y ahora tiene 1 elemento.");
    }





}