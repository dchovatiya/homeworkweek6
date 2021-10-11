package homeworkweek6;
//No return type with parameters
public class Triangle
{
    public static void main(String[] args)
    {
        Triangle t=new Triangle();
        t.method(10,8); //Calling instance method by object
    }
    public void method(int b,int h)
    {
        double area=b/2*h;
        System.out.println(area);

    }
}
