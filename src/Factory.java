public class Factory
{
    private static  Factory instance;

    private Factory()
    {

    }

    public  static Factory getInstance()
    {
        return instance = new Factory();
    }

    public static C1 getCommand()
    {

        C1 cc;
        return  cc = new C1();




    }
}
