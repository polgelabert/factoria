import java.util.Scanner;
public class main {


    public static void  main(String[] args)

    {
        System.out.println("Que clase deseas ejecutar?(C1, C2 o C3)");
        Scanner s = new Scanner(System.in);
        String ss = s.nextLine();
        int m = Factory.getInstance().getCommand(ss).execute();


    }

}
