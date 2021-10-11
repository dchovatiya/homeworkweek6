package homeworkweek6;

import java.util.Locale;
import java.util.Scanner;

public class Homework19
{
    public static void main(String[] args)
    {
        Homework19 h=new Homework19();
        h.conversion();
    }
    public void conversion()
    {
        String s1,s2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String:-");
        s1=s.nextLine();
        s2=s1.toLowerCase();
        System.out.println("Above sentence in lower case");

        System.out.println(s2);
    }
}
