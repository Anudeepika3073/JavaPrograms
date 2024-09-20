public class StringCount {
    public int returnCountOfChar(){
        String string="anu";
        int Sum=0;
        for (int i=0;i<string.length();i++){
            Sum++;
        }
        return Sum;
    }
    public static void main(String[] args) {
        StringCount stringCount=new StringCount();
        int total=stringCount.returnCountOfChar();
        System.out.println(total);
    }


}
