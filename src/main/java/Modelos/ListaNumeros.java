/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Interfaces.Ordenable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author bryan
 */
public class ListaNumeros implements Ordenable<String> {

     private final ArrayList<Integer> numeros;

    // Lista predefinida
    public ListaNumeros() {
        this.numeros = new ArrayList<>(Arrays.asList(8, 3, 5, 1, 10, 2));
    }
    @Override
    public String Ordenar() {
        Collections.sort(numeros);
        return "Los numeros en orden son: " + numeros;
    }
}
