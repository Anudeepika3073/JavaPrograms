import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

       Sort sort = new Sort();
        int[] sorted = sort.SortArray(sort.arr, 0, 0, 0);
        for (int value : sorted) {
            System.out.println(value + "");
        }


        Linked linkedList=new Linked();
        linkedList.append(12);
        linkedList.append(2);
        linkedList.append(1);
        linkedList.append(123);
        linkedList.display();
        linkedList.length();
        linkedList.newEnding(100);
        linkedList.newBeginning(45);


    }

}