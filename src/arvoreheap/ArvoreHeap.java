/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoreheap;

/**
 *
 * @author Wali
 */
public class ArvoreHeap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Heap heap = new Heap();
        
        heap.inserir(9);
        heap.inserir(1);
        heap.inserir(7);
        heap.inserir(2);
        heap.inserir(4);
        heap.inserir(5);
        heap.inserir(6);
        
        heap.imprimir();
        
        
    }
    
}
