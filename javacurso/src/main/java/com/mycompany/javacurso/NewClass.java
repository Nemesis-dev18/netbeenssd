/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacurso;


import java.applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class NewClass {
    

public class AppletCalculadora extends applet implements ActionListener {
    TextField display;
    String operador = "";
    double operando1 = 0;
    boolean nuevaOperacion = true;

    public void init() {
        setLayout(new BorderLayout());
        display = new TextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        Panel panelBotones = new Panel(new GridLayout(4, 4));
        String[] botones = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String texto : botones) {
            Button b = new Button(texto);
            b.addActionListener(this);
            panelBotones.add(b);
        }

        add(panelBotones, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("\d") || cmd.equals(".")) {
            if (nuevaOperacion) {
                display.setText("");
                nuevaOperacion = false;
            }
            if (!(cmd.equals(".") && display.getText().contains("."))) {
                display.setText(display.getText() + cmd);
            }
        } else if (cmd.matches("[+\-*/]")) {
            operando1 = Double.parseDouble(display.getText());
            operador = cmd;
            nuevaOperacion = true;
        } else if (cmd.equals("=")) {
            double operando2 = Double.parseDouble(display.getText());
            double resultado = 0;
            switch (operador) {
                case "+": resultado = operando1 + operando2; break;
                case "-": resultado = operando1 - operando2; break;
                case "*": resultado = operando1 * operando2; break;
                case "/": resultado = operando1 / operando2; break;
            }
            display.setText(String.valueOf(resultado));
            nuevaOperacion = true;
        }
    }

        private void add(Panel display, String NORTH) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setLayout(BorderLayout borderLayout) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}