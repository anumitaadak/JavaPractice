import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args)
    {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int r=0;


        for(int num=sc.nextInt();num>0;num/=10)
        {
            r=num%10;
            sum=(sum*10)+r;

        }
          System.out.println("reverse is"+sum);



    }
}
