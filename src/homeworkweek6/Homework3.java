package homeworkweek6;

public class Homework3
{
    double a = 2.5; //instance variable
    static int b=10; //Static variable

    public static void main(String[] args)
    {
        Homework3 h=new Homework3();
        h.method1(); //Calling instance method by using object
        method2(); //Directly calling static method from main method as it is static

    }
    public void method1() //instance method
    {
        //Instance area
        //Can access instance variable  by creating object
        Homework3 hw=new Homework3();
        System.out.println(hw.a);
        System.out.println(b);
    }
    public static void method2() //static method
    {
        //Static area
        //Can access static method directly or by using class
        Homework3 hw1=new Homework3();
        System.out.println(hw1.a);//Calling instance variable using object from static method
        System.out.println(b);//Calling directly
    }
}
