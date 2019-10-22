/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoreheap;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Wali
 */
public class Heap {
    
    private ArrayList<Integer> lista= new ArrayList();
    
    public void inserir(int i){
        lista.add(i);
        OrdenarinsertOnSort();
    }
    
    public void OrdenarinsertOnSort(){
        int n = lista.size();
        for (int i = 1,j; i < n; i++) {
            int t = (int) lista.get(i);
            for (j = i; (j > 0) && (t<(int)lista.get(j-1)); j--) {
                lista.set(j, lista.get(j-1));
            }
            lista.set(j, t);
        }
        Collections.reverse(lista);     
    }
    
    public void remover(Integer i){
        lista.remove(i);
        OrdenarinsertOnSort();
    }
    
    public void imprimir(){
        int n = 0;
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
            if(i==0){
                System.out.println("");
            }
            if(i==2*n+2){
                System.out.println("");
                n=i;
            }       
        }
    }
    
}
