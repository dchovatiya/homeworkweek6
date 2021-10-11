package morningchallenge;

import java.util.Scanner;

public class ChallengeOne
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name = scanner.nextLine();
        System.out.println("Please greeting msg");
        String message=scanner.nextLine();
        System.out.println("Hi" + name);
        System.out.println(message);
    }

}
