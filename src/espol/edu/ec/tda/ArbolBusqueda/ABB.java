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
    
    public boolean contains(E data){
        if(data == null || this.isEmpty()){
            return false;
        }else{
            return constains(data,root);
        }
    }
    
    private boolean constains(E data, Node<E> p){
        if(p == null){
            return false;
        }else if(data == p.getData()){
            return true;
        }else if(f.compare(data, p.getData())>0){
            return constains(data,p.getRight());
        }else if(f.compare(data, p.getData())< 0){
            return constains(data,p.getLeft());
        }
        return false;
    }
    
    public E max(){
        if(this.isEmpty()){
            return null;
        }else {
            return max(root);
        }
    }
    
    private E max(Node<E> p ){
        if(p.getRight()==null){
            return p.getData();
        }else{
            return max(p.getRight());
        }
    }
    
    public E min(){
        if(this.isEmpty()){
            return null;
        }else {
            return min(root);
        }
    }
    
    private E min(Node<E> p ){
        if(p.getLeft()==null){
            return p.getData();
        }else{
            return min(p.getLeft());
        }
    }
    
    public void preOrder(){
        preOrder(root);
    }
    
    private void preOrder(Node<E> p){
        if(p!=null){
            System.out.print(p.getData()+" ");
            preOrder(p.getLeft());
            preOrder(p.getRight());
        }
    }
    
    public void posOrder(){
        posOrder(root);
    }
    
    private void posOrder(Node<E> p){
        if(p!=null){
            posOrder(p.getLeft());
            posOrder(p.getRight());
            System.out.print(p.getData()+" " );
        }
    }
    
    public void inOrder(){
        inOrder(root);
    }
    
    private void inOrder(Node<E> p){
        if(p!=null){
            inOrder(p.getLeft());
            System.out.print(p.getData()+" ");
            inOrder(p.getRight());
        }
    }
    
    public boolean remove ( E data){
        if(this.isEmpty()||data==null){
            return false;
        }else{
            this.root= remove(data,this.root);
            return true;
        }
    }
    
    private Node<E> remove(E data, Node<E> p){
        if(p==null){
            return p;
        }else if (f.compare(data, p.getData())>0){
            p.setRight(remove(data,p.getRight()));
        }else if (f.compare(data, p.getData())<0){
            p.setLeft(remove(data,p.getLeft()));
        }else {
            if(p.getLeft()!=null && p.getRight()!=null){
                p.setData(min(p.getRight()));
                p.setRight(remove(p.getData(),p.getRight()));
            }else {
                p=(p.getLeft()!=null)? p.getLeft(): p.getRight();
            }
        }
        return p;
    }
    
    public boolean isfull(){
        return isFull(root);
    }
    
    private boolean isFull(Node<E> p){
        if(p == null){
            return true;
        }else if(p.getLeft()!= null && p.getRight()== null ||
                p.getLeft() == null && p.getRight()!= null){
            return false;
        }else {
            return (isFull(p.getLeft()) && isFull(p.getRight()));
        }
    }
}
