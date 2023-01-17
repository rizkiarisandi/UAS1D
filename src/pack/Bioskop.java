package pack;
import java.util.ArrayList;
import java.util.Objects;

public class Bioskop {
    private String nama, alamat;

    public void setStudio(studio[] studio) {
        this.studio = studio;
    }

    studio[] studio;


    public Bioskop(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        studio = new studio[5];
        for (int n = 0; n < 5; n++) {
            studio[n] = new studio();
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @SuppressWarnings("ReassignedVariable")
    public Transaksi reserveSeat(int nStudio) {
        /**
         * Fungsi untuk memesan kursi dalam studio, input no studio dan fungsi dilanjutkan
         * ke fungsi pemesanan kursi di class Studio yang dipilih.
         */
        Transaksi ret = null;
        System.out.println(studio[nStudio-1].toString());
        if (studio[nStudio-1].getFilm() != null) {
          studio = studio[nStudio-1].reserveSeat();
        }

        return ret;
    }

    public void cancelReservation(int nStudio) {
        /**
         * Fungsi pembatalan pemesanan kursi dalam studio yang dipilih,
         * Dilanjutkan dengan fungsi pembatalan di class Studio yang dipilih.
         */
        studio[nStudio - 1].cancelReservation();
    }

    public void setFilmToStudio(int nStudio, String namaFilm, String sinopsis, ArrayList<jamtayang> jamTayang) {
        /**
         * Memasukkan film ke studio yang dipilih serta memasukkan jam tayang
         * film tersebut dan daftar kursi yang tersedia masing-masing jadwal
         * pemutaran.
         */
        studio[nStudio - 1] = new studio(new Film(namaFilm, sinopsis), jamTayang);
    }

    public studio getStudio(int noStudio) {
        return studio[noStudio-1];
    }

    @Override
    public String toString() {
        String ret = "";
        for (int n = 0; n < 5; n++) {
            ret = ret + "----Studio " + (n + 1) + "----\n" +
                    studio[n].toString() + "\n";
        }

        return ret;
    }

    public String w() {
        return null;
    }

    private static class f {
    }

    private class Transaksi {
        public String w() {
            return null;
        }
    }

    private static final class Film {
        private final String namaFilm;
        private final String sinopsis;

        private Film(String namaFilm, String sinopsis) {
            this.namaFilm = namaFilm;
            this.sinopsis = sinopsis;
        }

        public String namaFilm() {
            return namaFilm;
        }

        public String sinopsis() {
            return sinopsis;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            var that = (Film) obj;
            return Objects.equals(this.namaFilm, that.namaFilm) &&
                    Objects.equals(this.sinopsis, that.sinopsis);
        }

        @Override
        public int hashCode() {
            return Objects.hash(namaFilm, sinopsis);
        }

        @Override
        public String toString() {
            return "Film[" +
                    "namaFilm=" + namaFilm + ", " +
                    "sinopsis=" + sinopsis + ']';
        }

        }
}
