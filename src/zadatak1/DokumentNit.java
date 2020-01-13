package zadatak1;


public class DokumentNit extends Thread {
    private Stampac stampac;
    private String rec1;
    private String rec2;
    private String nazivDokumenta;

    public DokumentNit(Stampac stampac, String rec1, String rec2, String nazivDokumenta) {
        this.stampac = stampac;
        this.rec1 = rec1;
        this.rec2 = rec2;
        this.nazivDokumenta = nazivDokumenta;
    }

    private void stampanje() {
        boolean dobioDozvolu;
        do {
            synchronized (Stampanje.sinhronizacija) {
                System.out.println("Provera zauzeća štampača za dokument " + nazivDokumenta);

                if (Stampanje.dozvoljenoStampanje = true) {
                    Stampanje.dozvoljenoStampanje = false;
                    dobioDozvolu = true;
                    stampac.stampaj(rec1);
                    try {
                        this.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    stampac.stampaj(rec2);
                } else {
                    dobioDozvolu = false;
                }
            }
            if (!dobioDozvolu) {

            }

        } while (!dobioDozvolu);
        try {
            this.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (Stampanje.sinhronizacija) {
            Stampanje.dozvoljenoStampanje = true;
        }
    }

    @Override
    public void run() {
        stampanje();
    }
}



