package homeworkweek6;

public class Homework2
{
    //Static variable
    static String a="Dimple";
    static String b="Patel";
    public static void main(String[] args)
    {
        myMethod();
    }
    //Static area
    public static void myMethod()
    {
        System.out.println(a);//Calling static variable directly
        System.out.println(Homework2.b); //Calling static variable by class name
    }
}
