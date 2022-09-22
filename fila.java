/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filas;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author 701
 */
public class Filas {
    private int frente;
    private int end;
    private int[] arr;
    private int max;

    public Filas(int tam) {
        this.arr = new int[tam];
        this.end = -1;
        this.frente = -1;
        this.max = tam;
    }
    
    public void llenarDatos(){
        Random r =new Random();
        for (int i = 0; i < max; i++) {
            this.arr[i] = r.nextInt(100);
        }
    }
    
    public void insertarDato(int dato){
        if(this.end<this.max){
            this.end++;
            arr[this.end]=dato;
            if(this.end==0){
                this.frente=0;
            }
        }else{
            System.out.println("Desbordamiento");
        }
    }
    
    public void eliminarDato(){
        int dato;
        if(this.frente!=-1){
            dato=this.arr[this.frente];
            
        }else{
            
        }
    }
    
    @Override
    public String toString() {
        return "Filas:" + "frente=" + frente + ", end=" + end + ", arr=" + Arrays.toString(arr) ;
    }

    
    
    
}
