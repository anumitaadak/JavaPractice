import java.util.Arrays;
public class ArraySmallest {
    public static void main(String[] args) {
        int myArr[] = new int[]{56, 78, 90, 23, 32, 11, 10};
        Arrays.sort(myArr);
        System.out.println("Elements of array in ascending order");
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }
        System.out.println(myArr[0]);
        //System.out.println(myArr[myArr.length-1]);
    }
}
