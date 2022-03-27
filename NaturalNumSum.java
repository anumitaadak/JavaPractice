import java.util.Scanner;
public class NaturalNumSum {
    public static void main(String[] args)
    {
        System.out.println("Enter natural number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of "+n+ "numbers are" +sum);
    }
}
