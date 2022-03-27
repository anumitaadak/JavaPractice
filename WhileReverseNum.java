import java.util.Scanner;
public class WhileReverseNum {
    public static void main(String[] args)
    {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int r=0;
        int sum=0;
        while(num>0){
            r=num%10;
            sum=sum*10+r;
            num=num/10;
        }
        System.out.println("Reverse number is"+sum);
    }
}
