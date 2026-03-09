/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mostrar_tienda;

/**
 *
 * @author Nemesis
 */
public class calculo {
    private String nombre_empleado;
    private double Salario = 1750905 ; // el salario  "minimo" en colombia ( entre comillas pq pagan la mitad de eso )  
    private int H_EXTRA ;

    public calculo(String nombre_empleado, int H_EXTRA) {
        this.nombre_empleado = nombre_empleado;
        this.H_EXTRA = H_EXTRA;
    }
    public double C_salario() {
        return Salario ;
        
}
    public int getH_EXTRA() {
        return H_EXTRA;
    }
    public double SALARIO_E(){
        return C_salario()+(H_EXTRA*2000) ; // pues el calculo pa las horas extra q no ves? 
        
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }
    
   

    }

