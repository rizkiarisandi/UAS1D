import java.util.ArrayList;
public class Instabro {
    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public ArrayList<String> getSnap() {
        return Snap;
    }

    public void setSnap(ArrayList<String> snap) {
        Snap = snap;
    }

    private String UserID;
    private String UserName;
    private String FullName;
    private ArrayList<String> Snap;
    public Instabro(){
        System.out.println("Constructor tanpa parameter.....");
    }

    public Instabro(String id, String usr, String name, ArrayList<String> snap){
        this.UserID = id;
        this.UserName = usr;
        this.FullName = name;
        this.Snap = snap;
    }

    public static void main(String[] args) {
        Instabro user1 = new Instabro();
        user1.setUserID("01");
        user1.setUserName("@ky");
        user1.setFullName("kiky");

        ArrayList<String> Postingan = new ArrayList<>();
        Postingan.add("HAllo goblok");
        Postingan.add("yuhhuuu");
        Postingan.add("balik yuuh");
        user1.setSnap(Postingan);

        //mengambil value entity dari object
        System.out.println("mengambil value dari getter");
        System.out.println(user1.getUserID());
        System.out.println(user1.getUserName());
        System.out.println(user1.getFullName());

        System.out.println("Snap are : ");
        // for(int i=0;i<Postingan.size():i++){
        for(String p : Postingan ){
            System.out.println(p);
        }
    }
}
