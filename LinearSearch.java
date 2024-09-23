public class LinearSearch {
    public boolean findElement(int[] arr,int key){
        for (int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,6};
        int key=4;
        LinearSearch linearSearch=new LinearSearch();
        Boolean re= linearSearch.findElement(arr,key);
        System.out.println(re);

    }
}
