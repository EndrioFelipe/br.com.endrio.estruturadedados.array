/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.endrio.estruturadedados.array.teste;

import br.com.endrio.estruturadedados.array.Lista;

/**
 *
 * @author endrio
 */
public class TesteRestringirTipoDoVetorAPartirDeUmaRepresentacaoGenericaDoVetor {
    public static void main(String[] args)  {
        Lista<String> lista = new Lista<String>(2);
        try{
        lista.adiciona("bunda de véia");
        lista.adiciona("cu de bunda");
            System.out.println(lista);
        } catch (Exception e){
            e.printStackTrace();
        }    
        }
}
