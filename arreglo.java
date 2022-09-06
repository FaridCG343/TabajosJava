/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.arreglo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author 701
 */
public class Arreglo {

    private int[] arreglo;
    private int suma;
    private int mayor;
    private int menor;
    private int prom;

    public Arreglo(int tam) {
        this.arreglo = new int[tam];
        this.suma = 0;
        this.mayor = 0;
        this.prom = 0;
        this.menor = 0;
    }
    public void llenarArreglo(){
        Random r = new Random();
        for (int i = 0; i < this.arreglo.length; i++) {
            arreglo[i]= r.nextInt(11);
        }
    }
    public int BuscarMayor(){
        this.mayor=this.arreglo[0];
        for (int x: this.arreglo) {
            if(this.mayor<x){
                this.mayor = x;
            }
        }
        return this.mayor;
    }
    
    
    @Override
    public String toString() {
        return "Arreglo{" + "arreglo=" + Arrays.toString(arreglo) + ", suma=" + suma + ", mayor=" + mayor + ", menor=" + menor + ", prom=" + prom + '}';
    }
    
}
