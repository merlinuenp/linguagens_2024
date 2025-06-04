package paralelo;

import java.util.List;
import java.util.concurrent.Callable;

// implementar Callable permite retornar valor ( método call( ) )
public class ThreadSomadora implements Callable<Integer> {
    List<Integer> lista;
    
    public ThreadSomadora(List<Integer> lista) {
        this.lista = lista; 
    }
    
    @Override
    public Integer call() throws Exception {
        return lista.stream().reduce(0, Integer::sum);
    }
}
