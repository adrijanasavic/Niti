package zadatak1;

public class Stampanje {

    public static Boolean dozvoljenoStampanje = true;
    public static final Object sinhronizacija = new Object();

    public static void main(String[] args) {

        Stampac stampac = new Stampac();

        DokumentNit dokument1 = new DokumentNit(stampac, "hello ", "world\n", "dokument1");
        DokumentNit dokument2 = new DokumentNit(stampac, "hello ", "world\n", "dokument2");
        DokumentNit dokument3 = new DokumentNit(stampac, "hello ", "world\n", "dokument3");
        DokumentNit dokument4 = new DokumentNit(stampac, "hello ", "world\n", "dokument4");
        DokumentNit dokument5 = new DokumentNit(stampac, "hello ", "world\n", "dokument5");
        DokumentNit dokument6 = new DokumentNit(stampac, "hello ", "world\n", "dokument6");
        DokumentNit dokument7 = new DokumentNit(stampac, "hello ", "world\n", "dokument7");
        DokumentNit dokument8 = new DokumentNit(stampac, "hello ", "world\n", "dokument8");
        DokumentNit dokument9 = new DokumentNit(stampac, "hello ", "world\n", "dokument9");
        DokumentNit dokument10 = new DokumentNit(stampac, "hello ", "world\n", "dokument10");

        dokument1.start();
        dokument2.start();
        dokument3.start();
        dokument4.start();
        dokument5.start();
        dokument6.start();
        dokument7.start();
        dokument8.start();
        dokument9.start();
        dokument10.start();
    }
}