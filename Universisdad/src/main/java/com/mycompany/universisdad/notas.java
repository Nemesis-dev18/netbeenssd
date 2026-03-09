/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universisdad;

/**
 *
 * @author Nemesis
 */
public class notas {
    private String nombre_E;
    private double nota_1 ;
    private double nota_2 ;
    private double nota_3 ;

    public notas(String nombre_E, double nota_1, double nota_2, double nota_3) {
        this.nombre_E = nombre_E;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
        this.nota_3 = nota_3;
    }

    
    public notas(String nombre_E) {
        this.nombre_E = nombre_E;
    }
    
    public double promedio (){
        return (nota_1+nota_2+nota_3)/3;
    }

    public void total (int i){
        System.out.print("\nel estudiante : "+ nombre_E );
        System.out.println("");
        if (promedio()> 3.0 ) {
            System.out.print("\nsu promedio  de : "+promedio()+ " - es suficiente para pasar " );
            System.out.println("  ");
        }else {
         System.out.print("\nsu promedio  de : "+promedio()+ " - es insuficiente para pasar" );
            System.out.println("");
                    }
            
        }
    }    

