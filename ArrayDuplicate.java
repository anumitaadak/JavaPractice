package com.blz;
import java.io.Console;
import java.util.Arrays;

public class ArrayDuplicate {
    public static void main(String[] args){
        int[] myArr=new int[]{2,3,4,5,2,5,3};
        Arrays.sort(myArr);
        for (int i = 0; i < myArr.length; i++) {
            int count = 1;
            while (i < myArr.length - 1 && myArr[i] == myArr[i + 1]) {
                i++;
                count++;
            }
             if(count>1){
               System.out.println("Duplicate elements are  "+myArr[i]);
               count++;
           }

        }

    }

}
