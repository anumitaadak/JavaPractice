import java.util.Scanner;
public class CheckVowelCon {
    public static void main(String[] args)
    {
        System.out.println("Enter Alphabet");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);

        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }


        }
    }



