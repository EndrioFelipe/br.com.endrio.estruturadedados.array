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
public class Teste {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(4);//capacidade do vetor. Capacidade não é o mesmo que tamanho.
        try{
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
            System.out.println("tamanho do vetor: "+vetor.tamanho());
            System.out.println("Elementos do vetor: "+vetor.toString());
            System.out.println("posicao: "+vetor.busca("elemento 2"));
        
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
    }
}
