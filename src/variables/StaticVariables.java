package variables;

public class StaticVariables
{
    static int x=10; // static variable
    static String name="Dimple";

    public static void main(String[] args)
    {
         int b=10;
        System.out.println(x); //10 direct access
        System.out.println(StaticVariables.name); //calling by using class name
        System.out.println(name); //calling directly
        System.out.println(StaticVariables.x);
        myMethod();

    }
    public static void myMethod()
    {
        System.out.println(x); //direct access
        System.out.println(StaticVariables.x);
        System.out.println(StaticVariables.name); //calling by using class name
        System.out.println(name); //calling directly
        int c=11;
    }
}
