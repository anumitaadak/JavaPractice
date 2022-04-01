package com.blz;

public class EvenArrayPlace {
    public static void main(String[] args){
        int[] myArr=new int[]{3,9,0,2,7,5,4};
        for(int i=1;i<myArr.length;i=i+2){
            System.out.println(myArr[i]);
        }
    }
}
