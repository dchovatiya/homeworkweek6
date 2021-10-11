package homeworkweek6;

public class AreaPerimeterRectangle
{
    static double w,h;//static variable

    public static void main(String[] args)
    {
        AreaPerimeterRectangle ap=new AreaPerimeterRectangle();
        ap.area(5.6,8.5);
        ap.perimeter(5.6,8.5);
    }
    //Instance area
    public void area(double w,double h)
    {
        double area=w*h;
        System.out.println("Area is 5.6*8.5=" +area);
    }
    //Instance area
    public void perimeter(double w,double h)
    {
        double perimeter=2*(w+h);
        System.out.println("Perimeter is 2*(5.6+8.5)= "+perimeter);
    }
}
