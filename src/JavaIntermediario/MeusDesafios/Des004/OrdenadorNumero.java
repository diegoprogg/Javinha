package JavaIntermediario.MeusDesafios.Des004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenadorNumero {

    // Método de cópia da lista original retornando a lista de forma crescente
    public List<Integer> ordenarCrescente(List<Integer> lista){
        List<Integer> listaOrdenada = new ArrayList<>(lista);
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    // Método de cópia da lista original retornando a lista de forma decrescente
    public List<Integer> ordenarDecrescente(List<Integer> lista){
        List<Integer> listaOrdenada = new ArrayList<>(lista);
        listaOrdenada.sort(Collections.reverseOrder());
        return listaOrdenada;
    }
}
