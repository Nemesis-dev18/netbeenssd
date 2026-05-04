package com.mycompany.juegov_2;

import java.io.*;
import java.util.*;

public class GestorRanking {

    private static final String ARCHIVO = "ranking.txt";

    public static void guardarPuntaje(String nombre, int puntaje) {

        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO, true))) {
            pw.println(nombre + "," + puntaje);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String[]> obtenerRanking() {

        List<String[]> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {

            String linea;

            while ((linea = br.readLine()) != null) {
                String[] p = linea.split(",");
                if (p.length == 2) lista.add(p);
            }

        } catch (IOException e) {
            return lista;
        }

        lista.sort((a, b) ->
                Integer.parseInt(b[1]) - Integer.parseInt(a[1])
        );

        return lista.size() > 5 ? lista.subList(0, 5) : lista;
    }
}