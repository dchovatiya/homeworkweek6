package homeworkweek6;

public class Homework4
{
    //Instance variables
    String a="Dimple";
    String b="Patel";
    //Static variables
    static short x=10000;
    static short y=20000;
    public static void main(String[] args)
    {
        Homework4 h=new Homework4();
        h.method1();//Calling instance method from static method by creating object
        method2();
    }
    //Instance method
    public void method1()
    {
       //Instance area
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
    //Static method
    public static void method2()
    {
        //Static area
        Homework4 h1=new Homework4();
        System.out.println(h1.a); //Calling instance variable from static method by creating object
        System.out.println(h1.b);
        System.out.println(Homework4.x);//Calling by class
        System.out.println(y);//Calling directly
    }
}
