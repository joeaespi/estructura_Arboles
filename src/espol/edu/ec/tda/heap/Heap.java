/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.edu.ec.tda.heap;

import java.util.Comparator;

/**
 *
 * @author joel
 */
public class Heap<E> {
    private E [] array;
    private int efectivo;
    private int capacity=100;
    private Comparator<E> f;
    private boolean tipo; // true es MAX Y false es MIN
    
    public Heap(Comparator<E> f, boolean tipo ){
        array=(E[]) new Object[capacity];
        efectivo= 0;
        this.tipo = tipo;
        this.f = f;
    }
    
    public boolean isEmpty(){
        return efectivo==0;
    }
    
    public int size(){
        return efectivo;
    }
    
    //public boolean constain()
    
    private int posIzq(int index){
        return ((index*2)+1<efectivo)?(index*2)+1:-1;
    }
    
    private int posDer(int index){
        return ((index*2)+2<efectivo)?(index*2)+2:-1;
    }
    
    private int posPadre(int index){
        return ((index-1)/2!=0)?(index-1)/2:-1;
    }
}
