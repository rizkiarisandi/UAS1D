public class jawabanno2 {
    public static void main(String[] args) {
        System.out.println(ReserveString.Reverse("a b cd ef"));
        System.out.println(ReserveString.Reverse("contoh kalimat"));
    }
    private static jawabanno2 ReserveString;
    public static String Reverse(String str){
        char ki[]=str.toCharArray();
        String rev=" ";
        for (int i=ki.length-1;i>=0;i--){
            rev+=ki[i];
        }
        return rev.replaceAll("(?)[aiueo]","*");
    }
}
