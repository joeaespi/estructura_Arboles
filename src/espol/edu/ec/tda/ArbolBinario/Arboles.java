/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.edu.ec.tda.ArbolBinario;

/**
 *
 * @author joel
 */
public class Arboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AB<String> arbol = new AB<>();
        arbol.add("A", null);
        arbol.add("B", "A");
        arbol.add("C", "A");
        arbol.add("D", "B");
        arbol.add("E", "B");
        arbol.add("F", "C");
        
        arbol.preOrder();
        System.out.print("\n");
        arbol.posOrder();
        System.out.print("\n");
        arbol.inOrder();
        System.out.print("\n");
    }
    
}
