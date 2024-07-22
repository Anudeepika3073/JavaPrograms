//Write a program to find min and max numbers in the array

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int[] array={ 34,5,6,78,6};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }

        System.out.println(max);
        System.out.println(min);

    }
}