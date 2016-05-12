/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.endrio.estruturadedados.array;

/**
 *
 * @author endrio
 */
public class Lista <T> {
     private T[] elementos;
    private int tamanho;
    
    public Lista(int capacidade){
        this.elementos= (T[]) new Object[capacidade];
        this.tamanho=0;
    }
    
    public void adiciona(T elemento) throws Exception{
        this.aumentaCapadicade();
        if (this.tamanho<elementos.length){
            this.elementos[this.tamanho]=elemento;
            this.tamanho++;
            
            
        }else{
        throw new Exception("Cheio!");
        }
        
    }
    
    public int tamanho(){
        return this.tamanho;
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i=0; i<this.tamanho;i++){
            s.append(this.elementos[i]);
            //System.out.println(this.tamanho);
            if (i<this.tamanho-1){
            
                s.append(", ");
            }else{
                s.append("");
            }
        } 
        if(this.tamanho>0){
        s.append("]");
        }
        
        return s.toString();
    }
    
    public T busca(int posicao){
        if(!(posicao>=0 && posicao<this.tamanho)){//if(!())negação do if
            throw new IllegalArgumentException("não existe elementos nessa posição.");
        }
        return this.elementos[posicao]; 
    }
    
    public int busca(T elemento){
        for(int i=0; i<this.tamanho;i++){
            if(this.elementos[i].equals(elemento))
                return i;
        }
        return -1;
    }
    
    public void remove (int posicao){
        if(!(posicao>=0 && posicao<this.tamanho)){//if(!())negação do if
            throw new IllegalArgumentException("não existe elementos nessa posição.");
        }
        for(int i=posicao; i<this.tamanho-1; i++){
            this.elementos[i]=this.elementos[i+1];
                        
        }
        this.tamanho--;
    }
    
    public boolean adiciona(int posicao, T elemento){
        this.aumentaCapadicade();
        if(!(posicao>=0 && posicao<this.tamanho)){//if(!())negação do if
            throw new IllegalArgumentException("não existe elementos nessa posição.");
        }
        
        for(int i=this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1]=this.elementos[i];
            System.out.println(tamanho);
            
        }
        this.elementos[posicao]=elemento;
        this.tamanho++;
        return true;
    }
    
    public void aumentaCapadicade(){
        if (this.tamanho==this.elementos.length){
            T [] elementosNovos = (T[]) new Object[this.elementos.length*2];
            for (int i=0; i<this.elementos.length;i++){
                elementosNovos[i]=this.elementos[i];
            }
            this.elementos=elementosNovos;
            System.out.println(elementosNovos.length);
        }
    }
}
