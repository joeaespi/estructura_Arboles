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
public class AB<E> {
    private Node<E> root;
    public AB(){
        root= null;
    }
    
    public boolean isEmpty(){
        return root==null;
    }
    
    private Node<E> searchNode(E data){
        return searchNode(data,root);
    }
    
    private Node<E> searchNode(E data, Node<E> node){
        if(node==null){
            return null;
        }else if (node.getData().equals(data)){
            return node;
        }else {
            
        }
    }
}
