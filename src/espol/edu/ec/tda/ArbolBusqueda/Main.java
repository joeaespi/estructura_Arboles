/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.edu.ec.tda.ArbolBusqueda;

/**
 *
 * @author joel
 */
public class Main {
    public static void main(String[] args) {
        ABB<Integer> ar = new ABB<>(Integer::compareTo);
        ar.add(8);
        ar.add(19);
        ar.add(9);
        ar.add(7);
        ar.add(5);
        ar.add(3);
        ar.add(1);
//        ar.inOrder();
//        System.out.print("\n");
//        System.out.println(ar.max());
//        System.out.println(ar.min());
//        System.out.println(ar.contains(20));
//        System.out.println(ar.contains(19));
        ar.inOrder(); 
        System.out.print("\n");
        ar.remove(9);
        ar.inOrder();
    }
}
