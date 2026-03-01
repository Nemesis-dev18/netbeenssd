/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.introduccion1;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Introduccion1 {
    public static void main (String [] args ){
        
        String cadena;
        int entero;
        double decimal;
        char letra;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        letra = JOptionPane.showInputDialog("digita un caracter: ").charAt(0);
        decimal =Double.parseDouble(JOptionPane.showInputDialog("Digita un decimal con el separador . : "));
        
        
      JOptionPane.showMessageDialog(null,"la cadena es: "+ cadena); 
      JOptionPane.showMessageDialog(null,"el numero es :"+ entero);
      JOptionPane.showMessageDialog(null,"la letra es: "+ letra);
      JOptionPane.showMessageDialog(null,"el decimal  es: "+ decimal);
        
                    
        
    }

            
}