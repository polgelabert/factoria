public class Factory
{
    private static  Factory instance;

    private Factory()
    {

    }

    public  static Factory getInstance()
    {
        instance = new Factory();
    }

    public static Factory getCommand(String s)
    {

    }
}
