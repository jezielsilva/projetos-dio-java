package com.projetono;

public class Main {
    public static void main(String[] args){
        No<String> no1 = new No("Conteudo no1");
        No<String> no2 = new No("Conteudo no2");
        No<String> no3 = new No("Conteudo no3");
        No<String> no4 = new No("Conteudo no4");
        //referenciando cada nó ao próximo
        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);
        //printa o conteúdo do nó
        System.out.println(no1);
        //printa o nó referenciado
        System.out.println(no1.getProximoNo());
    }
}
