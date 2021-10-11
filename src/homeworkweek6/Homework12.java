package homeworkweek6;
//With return type no parameter
public class Homework12
{
    public static void main(String[] args)
    {
        double result=myMethod();
        System.out.println(result);
    }
    public static double myMethod() {
        double a = 25.5;
        double b = 3.5;
        double c = 40.5;
        double d = 4.5;
        double total=((a*b-b*b)/(c-d));
        return total;
    }
}
