package com.blz;
import java.util.Arrays;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] myArr = new int[]{1, 2, 6, 1, 1, 6, 1};//1,1,1,1,2,6,6=7
        Arrays.sort(myArr);
        for (int i = 0; i < myArr.length; i++) {
            int count = 1;
            while (i < myArr.length - 1 && myArr[i] == myArr[i + 1]) {
                i++;
                count++;
            }

                System.out.println("Frequency of: "+myArr[i] + " is " + count);
                count++;
            }

            }

            }




