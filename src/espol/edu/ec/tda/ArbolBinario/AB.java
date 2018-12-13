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
    
    public int size(){
        return size(root);
    }
    
    private int size(Node<E> node){
        if(node == null){
            return 0;
        }
        return 1+size(node.getLeft())+size(node.getRight());
        
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
            Node<E> l= searchNode(data,node.getLeft());
            if(l!=null){
                return l;
            }else {
                return searchNode(data,node.getRight());
            }
        }
    }
    
    public int contarHojas(){
        return contarHojas(root);
    }
    private int contarHojas(Node<E> node){
        if(node == null){
            return 0;
        }else if(node.getLeft()==null && node.getRight()==null){
            return 1;
        }
        else {
            return contarHojas(node.getLeft()) + contarHojas(node.getRight());
        }
        
    }
    
    public boolean add(E child, E parent){
        if(child == null && parent==null){
            return false;
        }else if(child != null && parent==null && isEmpty()){
            this.root = new Node<>(child);
            return true;
        }else if (child != null && parent!=null){
            Node<E>p = searchNode(parent);
            Node<E> c = searchNode(child);
            if(p!=null && c==null){
                c= new Node<>(child);
                if(p.getLeft()==null){
                    p.setLeft(c);
                    return true;
                }else if (p.getRight()==null){
                    p.setRight(c);
                    return true;
                }
            }
        }
        return false;
    }

    public Node<E> getRoot() {
        return root;
    }

    public void setRoot(Node<E> root) {
        this.root = root;
    }
    
    
}
