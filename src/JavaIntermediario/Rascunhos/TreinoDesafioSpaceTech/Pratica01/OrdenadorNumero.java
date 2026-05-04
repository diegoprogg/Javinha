package JavaIntermediario.Rascunhos.TreinoDesafioSpaceTech.Pratica01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenadorNumero {
    public List<Integer> ordenadorCrescente(List<Integer> listaOriginal){
        List<Integer> listaOrdenada = new ArrayList<>(listaOriginal);
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    public List<Integer> ordenadorDecrescente(List<Integer> listaOriginal){
        List<Integer> listaDecrescente = new ArrayList<>(listaOriginal);
        listaDecrescente.sort(Collections.reverseOrder());
        return listaDecrescente;
    }
}
