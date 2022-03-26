import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter leap year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year>=1586)
        {
            if(year%400==0 || year%4==0 && year%100!=0 )
            {


                    System.out.println("Leap Year");
                } else {
                    System.out.println("not leap year");
                }
            }

        }
    }

