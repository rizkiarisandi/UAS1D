import java.util.ArrayList;
import java.util.Scanner;

public class UAS1D {
    private String MassageID;
    private String MassageName;
    private ArrayList CONTEXT;
    private String cari;
    private Scanner sc;

    public String getMessageID(){
        return MassageID;
    }
    public void setMessageID(String s){
        this.setMessageID(sc.nextLine());
    }
    public String getMassageName(){
        return MassageName;
    }
    public void setMessageName(String s){
        this.setMessageName(sc.nextLine());
    }
    public ArrayList<String> getCONTEXT(){
        return CONTEXT;
    }
    public void setContext(ArrayList<String> CONTEXT){
        for (Object o : this.CONTEXT) {
            
        }

    }
    public void FindWords(ArrayList<String> CONTEXT){
       CONTEXT.add(cari)
        for (int index = 0; index<CONTEXT.size(); index++){
            CONTEXT.get(index).indexof(cari);
        }
    }
    public static void main(String[] args) {
        int jum=4;
        UAS1D myMessage = new UAS1D();
        Scanner sc = new Scanner(System.in);
        myMessage.setMessageID(sc.nextLine());
        myMessage.setMessageName(sc.nextLine());
        ArrayList<String> CONTEXT = new ArrayList<>();
        for (int index=0; index<jum;index++){
            CONTEXT.add(sc.nextLine());
        }
        myMessage.setContext(CONTEXT);
        System.out.println("kata yang dicari : ");
        String cari = sc.nextLine();
        System.out.println(myMessage.FindWords(CONTEXT.cari));
    }
}
