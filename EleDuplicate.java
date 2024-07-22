import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EleDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements");
        int number=sc.nextInt();


        HashSet<Integer>UniqueElements=new HashSet<>();
        HashSet<Integer>DuplicateElements=new HashSet<>();
        int totalElements=sc.nextInt();
        for(int i=0;i<totalElements;i++){
            if(!UniqueElements.add(totalElements));

            DuplicateElements.add(totalElements);

        }
        System.out.println(DuplicateElements);


        }
    }
