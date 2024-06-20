package somador;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class Somador implements Callable<Integer> {

    private final Integer vetor[];
    
    public Somador(Integer v[]){
       vetor = v; 
    }
    
    @Override
    public Integer call() throws Exception {
        return Arrays.stream(vetor).reduce(0, Integer::sum);
    }
    
}
