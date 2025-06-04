package paralelo;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Usuário
 */
public class ThreadSomadoraTest {
    
    public ThreadSomadoraTest() {
    }

    @Test
    public void testSomarParalelo() throws Exception {
        List<Integer> lista = IntStream.range(1,1_000_000)
                                    .boxed().collect(Collectors.toList());
        ThreadSomadora t1 = new ThreadSomadora(lista.subList(0, lista.size() / 2));
        ThreadSomadora t2 = new ThreadSomadora(lista.subList(lista.size() / 2, lista.size()));
        
        
        
//        int resultado = t1.call() + t2.call();
//        System.out.println("\n" + resultado + "\n");
        
        
        ExecutorService pool = Executors.newFixedThreadPool(2);
        
        long inicio = System.currentTimeMillis();
        Future<Integer> futuro1 = pool.submit(t1);
        Future<Integer> futuro2 = pool.submit(t2);
        System.out.println("Quantidade: " + (futuro1.get() + futuro2.get()));

        System.out.println("Tempo: " + (System.currentTimeMillis() - inicio));
        pool.shutdown();
        
        
    }
    
}
