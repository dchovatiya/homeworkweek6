package methodpractice;

public class MethodDeclaration
{
    public static void main(String[] args) {
        MethodDeclaration obj= new MethodDeclaration();
        int answer= obj.addition(10, 20);
        System.out.println(answer);//30
        String result=obj.name("Prime testing");
        System.out.println(result);


    }
    //with return type with parameters
    public int addition (int a, int b){
        int result=a+b;
        return result;
    }
    public String name(String var)
    {
        String name=var;
        return name;
    }


}
