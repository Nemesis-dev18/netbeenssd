
package com.mycompany.operador;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class NewClass {
    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        double pago, total;
        int dias;
        
        pago = 6.189; // Asumimos que es pago por día
        System.out.print("Digita cuántos días trabajaste en la semana: ");
        dias = entrada.nextInt();
        
        total = pago * dias;
        System.out.printf("El total del pago semanal es = %.2f%n", total);
    }
}