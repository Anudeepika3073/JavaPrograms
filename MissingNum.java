public class MissingNum {
    public void findMissing() {
        int[] arr = {1, 2, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + 1;
            System.out.println(sum);
            if (sum != arr[i]) {
                System.out.println("this num is missing " + sum);
                break;
            }
        }
    }
    public static void main(String[] args) {
        MissingNum missingNum=new MissingNum();
        missingNum.findMissing();
    }
}

