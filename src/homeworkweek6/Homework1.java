package homeworkweek6;

public class Homework1
{
    int a=100; //instance variable
    int b=200; //instance variable

    public static void main(String[] args)
    {
        Homework1 h=new Homework1();
        h.myMethod();
    }
    //instance method
    public void myMethod()
    {
        //Called instance variable inside the instance method in print statement by creating object
        Homework1 h=new Homework1();
        System.out.println(h.a);
        System.out.println(h.b);
    }


}
