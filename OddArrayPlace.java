package com.blz;

public class OddArrayPlace {
    public static void main(String[] args){
        int[] myArr=new int[]{1,8,0,4,6,4,9,2};
        for(int i=0;i< myArr.length;i=i+2){
            System.out.println(myArr[i]);
        }
    }
}
