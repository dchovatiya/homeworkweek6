package homeworkweek6;

import java.util.Scanner;

public class Fahrenheit
{
    public static void main(String[] args)
    {
        Fahrenheit f=new Fahrenheit();
        f.fahrenheit();
    }
    public void fahrenheit()
    {
        double c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter degree Fahrenheit:- ");
        double fh=s.nextInt();
        c=((fh-32)*5/9);
        System.out.println("Celsius is:-" +c);
    }

}


