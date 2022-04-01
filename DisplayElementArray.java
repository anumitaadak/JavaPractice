import java.util.Scanner;
public class DisplayElementArray{
    public static void main(String[] args){
        int myArr[]=new int[5];
        System.out.println("Enter "+myArr.length+"elements of array");
        for(int i=0;i< myArr.length;i++){
            Scanner sc=new Scanner(System.in);
            myArr[i]=sc.nextInt();
            System.out.println(myArr[i]);

        }

    }

}
