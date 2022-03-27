import java.util.Scanner;
public class WhileNaturalSum {
    public static void main(String[] args)
    {
        System.out.println("Enter natural number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum is"+sum);

    }
}
