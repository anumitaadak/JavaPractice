import java.util.Arrays;
public class SortAscOrder {
    public static void main(String[] args) {
        int myArr[] = new int[]{56, 78, 90, 23, 32, 11, 10};
        Arrays.sort(myArr);
        System.out.println("Elements of array in ascending order");
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }

    }
}
