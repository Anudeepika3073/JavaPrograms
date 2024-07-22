//find the second largest number in an array in Java?

public class HighestEle {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 9};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax=max;
                max = arr[i];
            } else if (arr[i]>secondMax&&secondMax!=max) {
                secondMax=arr[i];
            }
        }
        System.out.println(secondMax);
    }
}

