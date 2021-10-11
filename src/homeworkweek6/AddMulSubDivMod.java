package homeworkweek6;

import java.util.Scanner;

public class AddMulSubDivMod
{
    int add,sub,mul,div,mod; //Instance variable
    int total; //Instance variable
    public static void main(String[] args)
    {
        AddMulSubDivMod obj=new AddMulSubDivMod();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number");
        int x=s.nextInt();
        System.out.println("Enter second number");
        int y=s.nextInt();
        obj.sumAddMulSubDivMod(x,y);
    }
    public void sumAddMulSubDivMod(int x,int y)
    {
        add=x+y;
        System.out.println("125+24= " + add);
        sub=x-y;
        System.out.println("125-24= " + sub);
        mul=x*y;
        System.out.println("125*24= " + mul);
        div=x/y;
        System.out.println("125/24= " + div);
        mod=x%y;
        System.out.println("125 mod 24= " + mod);
    }
}
