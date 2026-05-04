package JavaIntermediario.Rascunhos.TreinoDesafioSpaceTech.Pratica02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenadorNumeros {
    public List<Integer> ordenadorCrescente(List<Integer> listaOriginal){
        List<Integer> listaCrescente = new ArrayList<>(listaOriginal);
        Collections.sort(listaCrescente);
        return listaCrescente;
    }

    public List<Integer> ordenadorDecrescente(List<Integer> listaOriginal){
        List<Integer> listaDecrescente = new ArrayList<>(listaOriginal);
        listaDecrescente.sort(Collections.reverseOrder());
        return listaDecrescente;
    }
}
