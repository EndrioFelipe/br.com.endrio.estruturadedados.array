/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.endrio.estruturadedados.array.teste;

import br.com.endrio.estruturadedados.array.Contato;
import br.com.endrio.estruturadedados.array.VetorObjetos;

/**
 *
 * @author endrio
 */
public class TesteVetorObjetos {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(2);
        
        Contato c1 = new Contato("João", "36376552");
        Contato c2 = new Contato("João", "36369819");
        Contato c3 = new Contato("João", "36369819");
        try{
            vetor.adiciona(c1);
            vetor.adiciona(c2);
            
            System.out.println(vetor.toString());
            
            int pos  = vetor.busca(c3);
            if (pos>-1){
                System.out.println("Existe");
            }else{
                System.out.println("Não existe");
            }
            
            
            
        } catch (Exception e ){
            e.printStackTrace();
        }
        
    }
    
}
