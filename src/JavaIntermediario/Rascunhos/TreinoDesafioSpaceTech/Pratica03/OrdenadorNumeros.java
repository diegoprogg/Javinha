package JavaIntermediario.Rascunhos.TreinoDesafioSpaceTech.Pratica03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenadorNumeros {
    public List<Integer> ordenarCrescente(List<Integer> listaOriginal){
        List<Integer> listaOrdenada = new ArrayList<>(listaOriginal);
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    public List<Integer> ordenarDecrescente(List<Integer> listaOriginal){
        List<Integer> listaOrdenada = new ArrayList<>(listaOriginal);
        listaOrdenada.sort(Collections.reverseOrder());
        return listaOrdenada;
    }
}
