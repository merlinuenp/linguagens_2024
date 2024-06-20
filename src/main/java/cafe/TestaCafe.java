
package cafe;

import java.util.ArrayList;


public class TestaCafe {
    
    public static void main(String[] args) {
        MaquinaCafe maquina = new MaquinaCafe();
        ArrayList<Programador> lista = new ArrayList();
        lista.add(new Programador(maquina, "Huguinho"));
        lista.add(new Programador(maquina, "Luizinho")); 
        lista.add(new Programador(maquina, "Zezinho")); 
        lista.add(new Programador(maquina, "Tio Donald")); 
        lista.add(new Programador(maquina, "Pateta")); 
        lista.add(new Programador(maquina, "Luluzinha")); 
        lista.add(new Programador(maquina, "Cebolinha")); 
        
        for(Programador p : lista){
            p.start();
        }
    }
}
