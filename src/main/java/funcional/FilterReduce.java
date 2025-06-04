
package funcional;

import java.util.Arrays;
import java.util.List;


public class FilterReduce {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(0, -2, 15, 34, -18, 22, -9);
        
        Integer soma = 
                lista.stream().filter(n -> n >=0)
                .reduce(0, (subtotal, e) -> subtotal + e);
    }
    
}
