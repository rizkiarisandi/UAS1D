package pack;
public class kursi {
    private String noKursi;
    private boolean isReserved;

    public kursi(String noKursi) {
        this.noKursi = noKursi;
        isReserved = false;
    }

    public String getNoKursi() {
        return noKursi;
    }

    public void setNoKursi(String noKursi) {
        this.noKursi = noKursi;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean isReserved) {
        this.isReserved = isReserved;
    }

    @Override
    public String toString() {
        return "Kursi []";
    }
}
