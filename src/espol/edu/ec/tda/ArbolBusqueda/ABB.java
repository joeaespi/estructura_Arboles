/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.edu.ec.tda.ArbolBusqueda;

import java.util.Comparator;

/**
 *
 * @author joel
 */
public class ABB<E> {
    private Node<E> root;
    private Comparator<E> f;
    
    public ABB(Comparator<E> f){
        this.f=f;
        this.root = null;
    }
    
    public boolean isEmpty(){
        return root==null;
    }
    
    public boolean add(E data){
        if(data == null){
            return false;
        }else {
            this.root = add(data,root);
        }
        return true;
    }
    
    private Node<E> add( E data, Node<E> p){
        if(p==null){
            p= new Node<>(data);
        }else if(f.compare(data, p.getData())>0){
            p.setRight(add(data,p.getRight()));
        }else if(f.compare(data, p.getData())< 0){
            p.setLeft(add(data,p.getLeft()));
        }
        return p;
    }
    
}
