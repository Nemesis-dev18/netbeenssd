/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.llamadat;

/**
 *
 * @author Nemesis
 */
public class MINUTOS {
    private int numero_D ;
    private double minutos  ;

    public MINUTOS(int numero_D, double minutos) {
        this.numero_D = numero_D;
        this.minutos = minutos;
    }

    public int getNumero_D() {
        return numero_D;
    }

    public double getMinutos() {
        return minutos;
    }


   public void calculo (int i){
       System.out.println(" la llamada al   " +numero_D+" : duro  " +minutos +" minutos  " );
       System.out.println(" su costo total fue : "+(minutos * 200 ) );
   }    
}
