//Write a Java program to sort an array

import java.util.Arrays;
import java.util.Scanner;

public class Sort
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of values in array");
        int numbers=sc.nextInt();
        int[] arr=new int[numbers];
        System.out.println("enter values ");
        for (int i=0;i<numbers;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
