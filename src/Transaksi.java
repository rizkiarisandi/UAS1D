public class Transaksi {
    private String namaFilm;
    private String jamTayang;
    private long hargaTiket;
    private String noKursi;
    private int jmlKursi;

    public Transaksi(String namaFilm, String jamTayang, long hargaTiket,
                     String noKursi, int jmlKursi) {
        this.namaFilm = namaFilm;
        this.jamTayang = jamTayang;
        this.hargaTiket = hargaTiket;
        this.noKursi = noKursi;
        this.jmlKursi = jmlKursi;
    }

    public String getNamaFilm() {
        return namaFilm;
    }

    public String getJamTayang() {
        return jamTayang;
    }

    public long getHargaTiket() {
        return hargaTiket;
    }

    public String getNoKursi() {
        return noKursi;
    }

    public int getJmlKursi() {
        return jmlKursi;
    }

    public long totalHarga() {
        return getJmlKursi() * getHargaTiket();
    }

    public String toString() {
        return "Nama film : " + getNamaFilm() +
                "\nJam Tayang : " + getJamTayang() +
                "\nNo kursi : " + getNoKursi() +
                "\nTotal harga : " + totalHarga() + "\n";
    }
}
