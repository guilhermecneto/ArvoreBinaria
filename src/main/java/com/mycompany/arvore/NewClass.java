/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arvore;

import com.mycompany.arvore.model.Obj;

/**
 *
 * @author ANONYMOUS
 */
public class NewClass {
    public static void main(String[] args) {
        
        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();
        
        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));
        
        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPosOrdem();
        minhaArvore.exibirPreOrdem();
        
        
    }
}
