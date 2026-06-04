class Shape
{
    public static double area(double radius)
    {
        double area ;
        area = 3.14 * radius * radius;
        return area;
    }
    // public static void area(double radius)
    // {
    //     double area ;
    //     area = 3.14 * radius * radius;
    //     System.out.printf("\nradius = %f ",radius);
    //     System.out.printf("\n area of circle = %.2f",area);
    // }
    public static void area(double length,double breadth)
    {
        double area ;
        area = length * breadth;
        System.out.printf("\nlength = %.2f \t breadth = %.2f",length,breadth);
        System.out.printf("\n area of rectangle = %.2f",area);
    }

}

public class OverloadingEg {
    public static void main(String[] args) {

    double a;
    a =   Shape.area(2.5);

    System.out.println("area of circle:"+a);

    Shape.area(100,2000);

    }
}