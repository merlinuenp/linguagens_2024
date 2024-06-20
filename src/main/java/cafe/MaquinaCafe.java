package cafe;

public class MaquinaCafe {

    public synchronized void encherXicara(Thread t) throws InterruptedException {
        System.out.println("Enchendo xícara: " + t.getName());
        Thread.sleep(2000);
    }

}
