import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r = 0;
        int sum = 0;
int temp=0;
        temp = num;

        for (; num > 0; num /= 10) {
            r = num % 10;
            sum = (sum * 10) + r;
        }
        System.out.println("reverse number is" + sum );


        System.out.println(+temp);

        System.out.println(sum ==temp ? "number is  palindrome" : "number is not palindrome");
    }
}


