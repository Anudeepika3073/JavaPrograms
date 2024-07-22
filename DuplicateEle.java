import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements");
        ArrayList<Integer>Numbers=new ArrayList<>();
        int num= sc.nextInt();

        System.out.println("enter elements");
        for(int i=0;i<num;i++){
            int elements=sc.nextInt();
            Numbers.add(elements);
        }
        System.out.println("these are the elements in the list "+Numbers);
        //now finding duplicate elements
        HashSet<Integer>hashSet=new HashSet<>();
        HashSet<Integer>DuplicateList=new HashSet<>();
        for(Integer elements:Numbers){
            if(!hashSet.add(elements)){

                DuplicateList.add(elements);
            }
        }
        System.out.println("these are the duplicate elements in list"+DuplicateList);




    }

}
