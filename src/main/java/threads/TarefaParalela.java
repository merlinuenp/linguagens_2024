package threads;

public class TarefaParalela extends Thread {
    
    public TarefaParalela(String nome) {
        super(nome);
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Sou a tarefa " + this.getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {   }
        }
    }

}
