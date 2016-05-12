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
public class TesteRemove {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        try{
            vetor.adiciona("1");
            vetor.adiciona("2");
            vetor.adiciona("3");
            vetor.adiciona("4");
            vetor.adiciona("5");
            System.out.println(vetor.toString());
            vetor.remove(4);
            System.out.println(vetor);
            
        } catch (Exception e ){
            e.printStackTrace();
        }
        
    }
    
}
