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
    
    public boolean remove(E child){
        if(child == null && isEmpty()){
            return false;
    }else if (root.getData().equals(child)){
        root= null;
        return true;
    }else{
        Node<E> p =searchParent(child);
        if(p!=null){
            if(p.getLeft()!=null&& p.getLeft().getData().equals(child)){
                p.setLeft(null);
            }else{
            p.setRight(null);
        }
            return true;
    }
    }
        return false;
    }
    
    private Node<E> searchParent(E data){
        return searchParent(data, root);
    }
    
    private Node<E> searchParent(E data, Node<E> node){
        if(node==null){
            return null;
        }else if (node.getLeft()!=null&& node.getLeft().getData().equals(data) 
                ||node.getRight()!=null && node.getRight().getData().equals(data)){
            return node;
        }else {
            Node<E> l= searchParent(data,node.getLeft());
            if(l!=null){
                return l;
            }else {
                return searchParent(data,node.getRight());
            }
        }
    }
    
    public int height(){
        return height(root);
    }
    
    private int height(Node<E> p){
        if(p==null){
            return 0;
        }else {
            return 1+Math.max(height(p.getLeft()), height(p.getRight()));
        }
        
    }
    
    public void preOrder(){
        preOrder(root);
    }
    
    private void preOrder(Node<E> p){
        if(p!=null){
            System.out.print(p.getData());
            preOrder(p.getLeft());
            preOrder(p.getRight());
        }
    }
    
    public void posOrder(){
        posOrder(root);
    }
    
    private void posOrder(Node<E> p){
        if(p!=null){
            preOrder(p.getLeft());
            preOrder(p.getRight());
            System.out.print(p.getData());
        }
    }

    public Node<E> getRoot() {
        return root;
    }

    public void setRoot(Node<E> root) {
        this.root = root;
    }
    
    
}
