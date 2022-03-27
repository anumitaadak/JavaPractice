import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args)
    {
        System.out.println("Enter value of a");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        System.out.println("Enter value of b");
        double b=sc.nextDouble();
        System.out.println("Enter the value of c");
        double c=sc.nextDouble();
        double d=b*b-4*a*c;
        if(d>0.0)
        {
            double s1=(-b+ Math.pow(d,0.5))/(2.0*a);
            double s2=(-b-Math.pow(d,0.5))/(2.0*a);
            System.out.println("First root is"+s1+"Second root is"+s2);
        }else if(d==0.0)
        {
            double s1=-b/2.0*a;
            System.out.println("root is"+s1);
        }else{
            System.out.println("roots are not real");
        }
    }
}
