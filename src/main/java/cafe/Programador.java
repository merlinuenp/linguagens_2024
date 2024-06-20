package cafe;

public class Programador extends Thread {
    MaquinaCafe maquinaCafe;
    
    public Programador(MaquinaCafe maquina, String nome){
        this.maquinaCafe = maquina;
        this.setName(nome);
    }
    
    @Override
    public void run(){
        try {
            maquinaCafe.encherXicara(this);
        } catch (InterruptedException ex) {
            System.out.println("Erro ao encher: "+ ex);
        }
    }
    
}
