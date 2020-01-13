package Zadatak2;

public class Banka {

    public static Boolean dozvolaRacunanja = true;
    public static final Object sinhronizacija = new Object();

    public static void main(String[] args) {

        Racun racun1 = new Racun("Petar Petrovic", 0.0);
        Racun racun2 = new Racun("Mirko Mirkovic", 0.0);
        Racun racun3 = new Racun("Jovan Jovanovic", 0.0);
        Racun racun4 = new Racun("Sava Savic", 0.0);

        Transakcija t11 = new Transakcija(racun1, 1000);
        Transakcija t21 = new Transakcija(racun2, 1000);
        Transakcija t31 = new Transakcija(racun3, 1000);
        Transakcija t41 = new Transakcija(racun4, 1000);

        Transakcija t12 = new Transakcija(racun1, 1000);
        Transakcija t22 = new Transakcija(racun2, 1000);
        Transakcija t32 = new Transakcija(racun3, 1000);
        Transakcija t42 = new Transakcija(racun4, 1000);

        Transakcija t13 = new Transakcija(racun1, 1000);
        Transakcija t23 = new Transakcija(racun2, 1000);
        Transakcija t33 = new Transakcija(racun3, 1000);
        Transakcija t43 = new Transakcija(racun4, 1000);

        t11.start();
        t12.start();
        t13.start();

        t21.start();
        t22.start();
        t23.start();

        t31.start();
        t32.start();
        t33.start();

        t41.start();
        t42.start();
        t43.start();
    }
}

