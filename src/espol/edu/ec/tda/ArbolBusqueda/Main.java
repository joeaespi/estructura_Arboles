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
        ABB<Integer> arr = new ABB<>(Integer::compareTo);
        arr.add(8);
        arr.add(19);
        arr.add(9);
        arr.add(7);
        arr.add(5);
        arr.add(3);
        arr.add(1);
//        ar.inOrder();
//        System.out.print("\n");
//        System.out.println(ar.max());
//        System.out.println(ar.min());
//        System.out.println(ar.contains(20));
//        System.out.println(ar.contains(19));
        ar.inOrder(); 
        System.out.print("\n");
        ABB<Integer> ar2 = new ABB<>(Integer::compareTo);
//        ar2.add(8);
//        ar2.add(18);
//        ar2.add(9);
//        ar2.add(7);
//        ar2.add(5);
//        ar2.add(3);
//        ar2.add(1);
//        ar.remove(9);
//        ar.inOrder();
        ar2.add(9);
        ar2.add(20);
        ar2.add(10);
        ar2.add(8);
        ar2.add(6);
        ar2.add(4);
        ar2.add(2);
        ar2.inOrder(); 
        System.out.print("\n");
        System.out.println(ar.equals(ar2));
        ABB<Integer> ar3 = ar.mirror();
        ar3.inOrder(); 
        System.out.print("\n");

        System.out.println(ar3.equals(arr));
    }
}
