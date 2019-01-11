/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.edu.ec.tda.grafos;

/**
 *
 * @author joel
 */
public class Main {
    public static void main(String[] args) {
        GraphMA<Integer> g1 = new GraphMA<>(true);
        g1.addVertex(1);
        g1.addVertex(2);
        System.out.println(g1.addVertex(1));
        
    }
    
}
