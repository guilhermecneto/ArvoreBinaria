/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arvore.model;

/**
 *
 * @author ANONYMOUS
 */
public abstract class ObjArvore<T> implements Comparable<T> {
    
    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int compareTo(T obj);
    public abstract String toString();
    
    
}
