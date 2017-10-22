import java.util.Scanner;
import org.apache.log4j.Logger;

public class main {

    final static Logger log = Logger.getLogger(main.class.getName());

    public static void  main(String[] args)
    {
        org.apache.log4j.BasicConfigurator.configure();

        log.info("Que clase deseas ejecutar?(C1, C2 o C3)");
        Scanner s = new Scanner(System.in);
        String ss = s.nextLine();
        int m = Factory.getInstance().getCommand(ss).execute();


    }

}
