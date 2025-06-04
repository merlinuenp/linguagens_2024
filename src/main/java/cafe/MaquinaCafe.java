package cafe;

public class MaquinaCafe {

    public synchronized void encherXicara(Thread t) throws InterruptedException {
        System.out.println(t.getName() + " começou a encher a xícara.");
        Thread.sleep(1000);
        System.out.println(t.getName() + " terminou de encher a xícara.");
    }

}
