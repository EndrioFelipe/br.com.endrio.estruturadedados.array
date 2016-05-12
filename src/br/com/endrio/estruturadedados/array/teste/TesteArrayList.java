/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.endrio.estruturadedados.array.teste;

import java.util.ArrayList;

/**
 *
 * @author endrio
 */
public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();//não precisa passar a capacidade
                                                              //  o ArrayList é autoincrementado
                                                              // à medida que adicionamos um obj.  
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println(arrayList);
        
        boolean existe = arrayList.contains("A");
        if (existe){ // aqui não precisa escrever if(existe = true)
            System.out.println("Existe");
        } else {
            System.out.println("Não Existe");
        }
        
        int pos = arrayList.indexOf("O");
        if(pos>-1){
            System.out.println("Existe ai "+pos);
        } else {
            System.out.println("Não existe ai "+pos);
        }
        
        System.out.println("Buscando o elemento na posição: "+arrayList.get(2));// busca por posição
        
        arrayList.remove(0);//remove por posição
        arrayList.remove("B");//remove pelo nome
        System.out.println(arrayList);
        System.out.println("Tamanho atual do vetor: "+arrayList.size());
    }
    
}
