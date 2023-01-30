/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arvore.model;

import java.util.Objects;

/**
 *
 * @author ANONYMOUS
 */
public class Obj extends ObjArvore <Obj>{
    
    Integer meuValor;

    public Obj(Integer meuValor) {
        this.meuValor = meuValor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(meuValor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Obj other = (Obj) obj;
        if (!Objects.equals(this.meuValor, other.meuValor)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Obj obj) {
        int i = 0;
        
        if(this.meuValor > obj.meuValor){
            i = 1;     
        }else if(this.meuValor < obj.meuValor){
            i = -1;
        }
        return i;
    }

    @Override
    public String toString() {
        return meuValor.toString();
    
    }




   
  
}
