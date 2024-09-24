public class BeautifulArray {
    public void findBeautiful() {
        int[] arr = {1, 2, 3, 5, 5};
        boolean isAscending=false;
        boolean isEqual=false;
        for (int i =0; i<arr.length-1;i++) {
            for (int j =i + 1; j<arr.length;j++) {
                if(arr[i] < arr[j]) {
                    isAscending = true;
                        break;

                    }
                if (arr[i]==arr[j]){
                    isEqual=true;
                    break;



                }

            }
        }
        if(isAscending&& isEqual) {
            System.out.println("it is ascending and equal ele");
        }
        else {
            System.out.println("not");
        }

    }

    public static void main(String[] args) {
        BeautifulArray beautifulArray=new BeautifulArray();
        beautifulArray.findBeautiful();
    }
}
