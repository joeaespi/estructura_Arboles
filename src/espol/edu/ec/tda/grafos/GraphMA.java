/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.edu.ec.tda.grafos;

import java.util.ArrayList;

/**
 *
 * @author joel
 */
public class GraphMA<E> {
    private ArrayList<E> vertex;
    private int[][] matrix;
    private int capacity = 100;
    private boolean directed; 
    
    public GraphMA(boolean directed){
        this.vertex = new ArrayList<>();
        matrix = new int[capacity][capacity];
        this.directed = directed;
    }
    
    public boolean isEmpty(){
        return vertex.isEmpty();
    }
    
    public int size(){
        return vertex.size();
    }
    
    public boolean addVertex(E data){
        return (this.vertex.contains(data)||data == null)? false: vertex.add(data) ;
    }
    
    public boolean addEdge(E origen, E destino, int peso){
        int io = vertex.indexOf(origen);
        int id = vertex.indexOf(destino);
        if(io!= -1 && id != -11&& peso!=0 && matrix[io][id]==0){
            matrix[io][id] =peso;
            if(!directed){
                matrix[id][io]=peso;
            }
            return true;
        }
        return false;
    }
    
    public boolean removeVertex(E data){
        int i = vertex.indexOf(data);
        if(i == -1 ) return false;
        for(int j = i; j<vertex.size();j++){
            matrix[j]= matrix[j+1];
            for(int k = 0; k<vertex.size();k++){
                matrix[k][j] =matrix[k][k+1];
            }
        }
        vertex.remove(i);
        return true;
    }
    
    
//    public int gradoEntrada(E element){
//        if(element!= null && searchVertex(element)!=-1){
//            int io = searchVertex(element);
//            int grados = 0;
//            for (int i = 0;i<this.efectivo;i++){
//                if(this.matrix[i][io]!=0)
//                    grados ++ ;
//                
//            }
//            return grados;
//        }
//        return -1;
//    }
//    
//    public int gradoSalida(E element){
//        if(element!= null && searchVertex(element)!=-1){
//            int id = searchVertex(element);
//            int grados = 0;
//            for (int i = 0;i<this.efectivo;i++){
//                if(this.matriz[id][i]!=0)
//                grados ++;
//                
//            }
//            return grados;
//        }
//        return -1;
//    }
//    
    
}
