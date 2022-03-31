import java.util.Arrays;
public class ArrayLargest {
    public static void main(String[] args){
        int myArr[]=new int[]{78,95,60,14,25,30,45};
        Arrays.sort(myArr);
        for(int i=0;i<myArr.length;i++){
            System.out.println(myArr[i]);
        }
        System.out.println(myArr[myArr.length-1]);
    }
}
