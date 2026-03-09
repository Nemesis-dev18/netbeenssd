
package com.mycompany.mostrar_tienda;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author Nemesis
 * jueguen touhou.
 */
public class Mostrar_tienda {

    public static void main(String[] args) {
        Scanner nom = new Scanner(System.in);
        try {
                System.out.print("ingrese la cantidad de empleados trabajando   :  ");// aqui el que ingrese letras enserio que bien pendejo ( le daban agua rebajada en leche ) 
        int cant = nom.nextInt(); 
        nom.nextLine();// aqui limpiamos buffer 
        System.out.println(" ");
        
         calculo empleados [] = new calculo[cant]; // guardamos la cantidad iba a hacerlo con una dinamica pero no me joda son las 12 am y acabo de hacer pierna , me diele un putero la espalda
        
         // pedimos los datos del usuario y como el try catch esta pos nmms el cucho no jode
        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Ingrese el nombre del empleado #" + (i + 1)+ ": ");
            String nombre = nom.nextLine();
            System.out.print("\n Igrese la cantida de EXTRAS que hizo el empleado : ");
            int H_extra = nom.nextInt();
                 nom.nextLine();
            System.out.println(" ");
            empleados[i] = new calculo(nombre, H_extra);// se guardan los datos ingresados y se manda a la otra clase pa q se hagan los calculos 
        }
        
         System.out.print("\n El Salario de los empleados fue :  ");
    for (calculo e : empleados) {
            System.out.println("Nombre: " + e.getNombre_empleado());
            System.out.println("Horas extra: " + e.getH_EXTRA());
            System.out.println("Salario total : " + e.SALARIO_E());// se muestra el salario y esta el get pq como esta en una clase privada en la otra ez pa poder acceder a ese atribbutp que esta protegido 
}
            
    
     
          double salarioMayor = empleados[0].SALARIO_E();
          double salarioMenor = empleados[0].SALARIO_E();// del calculo se manda pa poder empezar a ver a quien le decimos pinche pobre o al que le robamos la plata de poco a poco por pinche lambon con el patron 
          calculo mejor = empleados[0];
          calculo peor = empleados[0];

           for (int i = 1; i < empleados.length; i++) {
               double actual = empleados[i].SALARIO_E();

                salarioMayor = Math.max(salarioMayor, actual);
                 salarioMenor = Math.min(salarioMenor, actual);// usamos la funcion math para el maximo y minimo pa no usar tanto codigo en un if 

                if (actual == salarioMayor) mejor = empleados[i];
                if (actual == salarioMenor) peor = empleados[i];
            }
            
System.out.println("\n EL SALARIO MAS ALTO DE:");
            System.out.println("Nombre: " + mejor.getNombre_empleado());
          System.out.println("SALARIO: " + mejor.SALARIO_E());

            System.out.println("\n EL PEOR SALARIO ES DE:");
            System.out.println("Nombre: " + peor.getNombre_empleado());// aqui imprimimos los resultaodos
         System.out.println("SALARIO: " + peor.SALARIO_E());

         } catch (InputMismatchException e) {
                System.out.println("\n Ingrese valores correctos no sea tan huevon .");// pues es la salida del error , que no ves? ( pendejo jsjsjsj ) 
        }
        }

    }
    
    

