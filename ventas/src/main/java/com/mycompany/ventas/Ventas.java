/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ventas;

import java.util.Scanner;

/**
 *
 * @author Nemesis
 */
public class Ventas {

    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
 
        
             System.out.print("\ningrese el nombre del articulo: ");
            String produc = nombre.nextLine();
            
            System.out.print("\ningrese el nombre del ingrese el precio  :");
            int preci = nombre.nextInt();
            
            System.out.print("\ningrese la cantidad que hay en stock  : ");
            int stock = nombre.nextInt();
            nombre.nextLine();
        proceso p = new proceso(produc,preci,stock);
            
   
        boolean opcion = true;
        while (opcion) {
                System.out.println("-----Menu de opciones ----\n");
               nombre.nextLine();
                System.out.print("""
                                    1. ver disponibilidad
                                   2.ingresar al stock
                                   3.vender del  stock
                                   4. salir del menu \n""");
                
                System.out.print("\ningrese su opcion : ");
                int op= nombre.nextInt();
                
                switch (op) {
                    case 1:
                        System.out.print (" \nla disponibilidad es : ");
                        p.verDisponibilidad();
                            break;
                    case 2:
                           System.out.print(" \n ponga cuanto  stock quiere añadir : ");
                           int ingreso = nombre.nextInt();
                           p.ingresarStock(ingreso  );
                           break;
                    case 3:
                            System.out.print("\n ponga cuantas unidades se venderan : ");
                            int retiro = nombre.nextInt();
                           p.retirarStock(retiro);
                           break ; 
                    case 4:
                        System.out.println("SALIENDO DEL MENU ");
                        opcion = false;
                        break;
                    default:
                        throw new AssertionError();
                }
    }

}
}
