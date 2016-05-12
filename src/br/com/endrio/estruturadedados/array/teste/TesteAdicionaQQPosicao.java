/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.endrio.estruturadedados.array.teste;

import br.com.endrio.estruturadedados.array.Vetor;

/**
 *
 * @author endrio
 */
public class TesteAdicionaQQPosicao {
    
    public static void main(String[] args) {
        Vetor vetor = new Vetor(6);
        
        try{
        vetor.adiciona("B");
        vetor.adiciona("c");
        vetor.adiciona("f");
        vetor.adiciona("g");
        
            System.out.println(vetor.toString());
        vetor.adiciona(0, "A");
            System.out.println(vetor.toString());
            vetor.adiciona(3,"d");
            System.out.println(vetor.toString());
            
        } catch(Exception e ){
            e.printStackTrace();
        }
        
    }
    
    
    
    
}
