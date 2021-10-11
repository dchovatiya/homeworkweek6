package methodpractice;

public class WithReturnTypeNoParameter
{
    public static void main(String[] args)
    {
        WithReturnTypeNoParameter t=new WithReturnTypeNoParameter();
        int result1= t.addition();
        System.out.println(t.addition());
        System.out.println(result1);//50

    }
    //2.With return type, no parameter
    public int addition()
    {
        int a=20;
        int b=30;
        int result=a+b; //50
        return result;
    }

}
