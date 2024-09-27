/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listasdobles;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-17
 */
public class ListasDobles {

    NodoDoble inicio;
    ListasDobles(){
        inicio = null;
    }
    
    public void insertarInicio(String dato){
    
    NodoDoble nuevo = new NodoDoble();
    nuevo.setAnterior(null);
    nuevo.setSiguiente(null);
    nuevo.setDato(dato);
    
        if(inicio != null){
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            //inicio = nuevo;
        }
       inicio = nuevo;
    }
    
    public void imprimir(){
        NodoDoble temporal = inicio;
        if(inicio == null){
            
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }else{
            
            while(temporal!=null){
            JOptionPane.showMessageDialog(null, "Dato: "+temporal.getDato());
            temporal = temporal.getSiguiente();
        }
            
        }
        
    }
    
    public void insertarFinal(String dato){
        
        NodoDoble nuevo = new NodoDoble();
        nuevo.setAnterior(null);
        nuevo.setSiguiente(null);
        nuevo.setDato(dato);
        if(inicio == null){
            inicio = nuevo;
        }
        else{
            NodoDoble temporal = inicio;
            while(temporal.getSiguiente()!=null){
            JOptionPane.showMessageDialog(null, "Dato: "+temporal.getDato());
            temporal = temporal.getSiguiente();
        }
            temporal.setSiguiente(nuevo);
            nuevo.setAnterior(temporal);
            nuevo.setSiguiente(null);
        }
        
    }
    
}
