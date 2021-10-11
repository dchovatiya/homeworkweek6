package homeworkweek6;

import java.util.Scanner;
//Return type with parameters
public class Calculator
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        Scanner scan=new Scanner(System.in) ;
        System.out.println("Enter first number:");
        num1=scan.nextInt();
        System.out.println("Enter second number:");
        num2=scan.nextInt();
        Calculator c=new Calculator();
        int result1=c.addition(num1,num2);
        System.out.println("Addition of the above numbers is: " +result1);

        int result2=c.subtraction(num1,num2);
        System.out.println("Subtraction of the above two numbers is: " +result2);

        int result3=multiplication(num1,num2);
        System.out.println("Multiplication of the above two numbers is: " +result3);

        int result4=division(num1,num2);
        System.out.println("Division of the above two numbers is: " +result4);

    }
    //Instance method
    public int addition(int num1,int num2)
    {
        int sum;
        sum=num1+num2;
        return sum;
    }
    //Instance method
    public int subtraction(int num1,int num2)
    {
        int sub;
        sub=num1-num2;
        return sub;
    }
    //static method
    public static int multiplication(int num1,int num2)
    {
        int mul;
        mul=num1*num2;
        return mul;
    }
    //static method
    public static int division(int num1,int num2)
    {
        int div;
        div=num1/num2;
        return div;
    }
}
