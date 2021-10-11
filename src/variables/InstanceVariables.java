package variables;

public class InstanceVariables
{
    int a=100; //instance variable
    public static void main(String[] args)
    {
        //static area
        InstanceVariables obj=new InstanceVariables();
        System.out.println(obj.a); //access with object
        obj.test();
    }
    public void test()
    {
        //instance area
        InstanceVariables obj1=new InstanceVariables();
        System.out.println(obj1.a); //direct access in instance area
    }
}
