package Zadatak2;

public class Transakcija extends Thread {
    private Racun racun;
    private double promenaRacuna;

    public Transakcija(Racun racun, double promenaRacuna) {
        this.racun = racun;
        this.promenaRacuna = promenaRacuna;
    }

    private void racunaj() {
        boolean dobioDozvolu;
        do {
            synchronized (Banka.dozvolaRacunanja) {
                if (Banka.dozvolaRacunanja) {
                    Banka.dozvolaRacunanja = false;
                    dobioDozvolu = true;
                    // System.out.println("* * * Racunanje nove vrednosti za racun " + racun.getImeVlasinka());
                    double staroStanje = racun.getStanjeRacuna();
                    double novoStanje = staroStanje + promenaRacuna;
                    try {
                        sleep(150);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    racun.setStanjeRacuna(novoStanje);
                    //System.out.println("* * * Racunanje zavrseno za racun " + racun.getImeVlasinka());
                } else {
                    dobioDozvolu = false;
                }
            }
            if (!dobioDozvolu) {

            }
        } while (!dobioDozvolu);
        synchronized (Banka.sinhronizacija) {
            Banka.dozvolaRacunanja = true;
            System.out.println("Racun korisnika " + racun.getImeVlasinka() + " je " + racun.getStanjeRacuna());
        }
    }

    public void run() {
        racunaj();
    }
}

