import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        int numbers= sc.nextInt();
        int[] array=new int[numbers];
        System.out.println("enter the elements in an array");
       for (int i=0;i<numbers;i++){
            array[i]=sc.nextInt();
       }
        sc.close();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<numbers;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
