package homeworkweek6;
//Return type with parameters
public class UpperToLower
{
    public static void main(String[] args)
    {
        UpperToLower ul=new UpperToLower();
        String result=ul.upperToLower("DIMPLE");
        System.out.println("Conversion from upper to lower:  " +result);
    }
    public String upperToLower(String s1)
    {
        String s2;
        s2=s1.toLowerCase();
        System.out.println(s1);
        return s2;
    }
}
