package Zadatak3;

public class Kamion {
    private int maxBrojPaleta;
    private int utovarenBrojPaleta = 0;
    public String ime = " ";

    public Kamion(int maxBrojPaleta, String ime) {
        this.maxBrojPaleta = maxBrojPaleta;
        this.utovarenBrojPaleta = utovarenBrojPaleta;
        this.ime = ime;
    }

    public synchronized boolean utovariPaletu() {
        if (utovarenBrojPaleta >= maxBrojPaleta) {
            return false;
        }
        utovarenBrojPaleta++;
        return true;
    }

    public int getUtovarenBrojPaleta() {
        return utovarenBrojPaleta;
    }
}

