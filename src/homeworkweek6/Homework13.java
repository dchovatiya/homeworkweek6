package homeworkweek6;

import java.util.Scanner;
//Return type without parameters
public class Homework13
{
    public static void main(String[] args)
    {
        Homework13 h=new Homework13();
        double result=h.average();
        System.out.println(result);//Calling instance method by creating object
    }
    public double average()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter num 1:-");
        int x=scan.nextInt();
        System.out.println("Enter num 2:-");
        int y=scan.nextInt();
        System.out.println("Enter num 3:-");
        int z=scan.nextInt();
        double average=(x+y+z)/3;
        return average;
    }
}
