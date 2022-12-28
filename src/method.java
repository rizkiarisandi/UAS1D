public class method {
    // method 3
    public static int CetakAngka(){
        return 5;
    }
    // method 4
    public static String[] InputData(int a, double[] v){
        String[] kode = new String[]{"AB","AC","AD"};
        return kode;
    }

    public static void main(String[] args) {
        //output method 3
        int u = CetakAngka();
        System.out.println(u);
        //output method 4
        double[] Parameterkedua = new double[]{5.6,7.9};
        String[] t= InputData(2, Parameterkedua);
        for (String s : t){
            System.out.println(s);
        }
    }
}
