import pack.Bioskop;
import pack.jamtayang;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner s;
        int pil = 0;
        Bioskop b = new Bioskop("CINEMA", "TEGAL SELATAN");
        System.out.println("Bioskop " + b.getNama() +
                "\nAlamat : " + b.getAlamat());
        while (pil != 4) {
            s = new Scanner(System.in);
            System.out.print("Menu\n" +
                    "1. Pemesanan tiket\n" +
                    "2. Pembatalan pesanan\n" +
                    "3. [ADMIN] Putar film baru\n" +
                    "4. Keluar\n" +
                    "Pilihan : ");
            pil = s.nextInt();
            switch (pil) {
                case 1 : {
                    System.out.print(b.w() +
                            "\nPilih studio : ");
                    try {
                        int nStudio = s.nextInt();
                        try {
                            System.out.println(b.reserveSeat(nStudio)); 
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        };
                    } catch(Exception e) {
                        System.out.println(e);
                    }

                    break;
                }

                case 2 : {
                    try {
                        System.out.print(b.toString() +
                                "Pilih Studio : ");
                        int nStudio = s.nextInt();
                        b.cancelReservation(nStudio);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    break;
                }

                case 3 : {
                    System.out.print("Masukkan password : ");
                    s = new Scanner(System.in);
                    String pass = s.nextLine();

                    if (pass.equals("Admin")) {
                        System.out.print("Masukkan ke studio [1-5] : ");
                        s = new Scanner(System.in);
                        ArrayList<jamtayang> jamTayang = new ArrayList<>();
                        try {
                            int nStudio = s.nextInt();
                            if (nStudio < 1 || nStudio > 5) {
                                s.close();
                                throw new IllegalArgumentException("Invalid studio");
                            } else {
                                System.out.print("Nama Film : ");
                                s = new Scanner(System.in);
                                String namaFilm = s.nextLine();
                                System.out.print("Sinopsis : ");
                                String sinopsis = s.nextLine();

                                char rep = 'y';
                                while (rep != 'n') {
                                    System.out.print("Masukkan jam tayang [Format 'hh:mm'] : ");
                                    s = new Scanner(System.in);
                                    String jam = s.nextLine();
                                    if (jam.length() != 5) {
                                        System.out.println("Format jam tidak valid (24h format) a");
                                    } else {
                                        int hour = Integer.parseInt(jam.substring(0, 2));
                                        int min = Integer.parseInt(jam.substring(3, 5));
                                        if (hour < 0 || hour > 24 || min < 0 || min > 59 ||
                                                jam.charAt(2) != ':') {
                                            System.out.println("Format jam tidak valid (24h format)");
                                        } else {
                                            jamtayang jt = new jamtayang(jam);
                                            jamTayang.add(jt);
                                        }
                                    }
                                    System.out.print("Tambah jam? [y/n] ");
                                    rep = s.next().charAt(0);
                                    if (rep != 'y' && rep != 'n') {
                                        s.close();
                                        throw new IllegalArgumentException("Invalid input");
                                    }
                                }
                                if (!jamTayang.isEmpty()) {
                                    b.setFilmToStudio(nStudio, namaFilm, sinopsis, jamTayang);
                                } else {
                                    System.out.println("Daftar jam putar kosong, penambahan film dibatalkan");
                                }
                            }
                        } catch(IllegalArgumentException e1) {
                            System.out.println(e1.getMessage());
                        } catch(InputMismatchException e2) {
                            System.out.println("Input nomor studio salah [1-5]");
                        }
                    } else {
                        System.out.println("Invalid password");
                    }
                }

                default : break;
            }
        }
    }
}
