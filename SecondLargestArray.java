import java.util.Arrays;
public class SecondLargestArray {
    public static void main(String[] args) {
        int myArr[] = new int[]{97, 80, 70, 35, 46, 93, 94};
        Arrays.sort(myArr);

        System.out.println(myArr[1]);
    }
}