package homeworkweek6;

import java.util.Scanner;

public class ConvertDecimalToBinary
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Input a Decimal Number:");
        int a=s.nextInt();
        String b=Integer.toBinaryString(a);
        System.out.println("Binary number is: "+b);

    }
}
