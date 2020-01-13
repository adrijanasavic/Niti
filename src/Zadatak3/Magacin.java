package Zadatak3;

public class Magacin {
    private int brojPaleta;

    public Magacin(int brojPaleta) {
        this.brojPaleta = brojPaleta;
    }

    public synchronized boolean uzmiPaletu() {
        if (brojPaleta == 0) {
            return false;
        }
        brojPaleta--;
        return true;
    }
}

