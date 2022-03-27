import java.util.Scanner;
public class FindMaxMin {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = sc.nextInt();

        }
        System.out.println("a=" + num[0] + "b=" + num[1] + "c=" + num[2]);
        int a = num[0];
        int b = num[1];
        int c = num[2];
        System.out.println("n1=" + (a + b * c));
        System.out.println("n2=" + (c + a / b));
        System.out.println("n3=" + (a % b + c));
        System.out.println("n4=" + (a * b + c));


        int n1 = a + b * c;
        int n2 = c + a / b;
        int n3 = a % b + c;
        int n4 = a * b + c;

        int[] myArr = {n1, n2, n3, n4};

        FindMaxMin s = new FindMaxMin();
        System.out.println("Maximum value in myArr is" + s.max(myArr));
        System.out.println("Minimum value in myArr is" + s.min(myArr));
    }

    public int max(int[] myArr) {
        int max = 0;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] > max) {
                max = myArr[i];
            }
        }
        return max;

    }

    public int min(int[] myArr) {
        int min = myArr[0];
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] < min) {
                min = myArr[i];
            }
        }
        return min;
    }



}
