import java.util.Arrays;

public class Anagram {
    public boolean areAnagrams(String s1, String s2)
    {
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static  void main(String[] args)
    {
        Anagram anagram=new Anagram();
        String s1 = "listen";
        String s2 = "silent";

        if (anagram.areAnagrams(s1, s2)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
}



