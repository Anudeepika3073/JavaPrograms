import java.util.Scanner;

public class PalindromeorNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give a word");
        String original=sc.nextLine();
        StringBuilder reversed= new StringBuilder(original);
        String reverse=reversed.toString();

        if (original.equals(reverse)){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

}
