package homeworkweek6;

import java.util.Scanner;

public class Area
{
    public static void main(String[] args)
    {
        Area a=new Area();
        a.myMethod(); //Calling instance method by creating object
    }
    public void myMethod()
    {
        double pie=3.14;
        double r;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter radius value of the circle:-");
        r=scan.nextInt();
        double area=pie*r*r;
        System.out.println("Area of the circle is " + area);
    }

}
