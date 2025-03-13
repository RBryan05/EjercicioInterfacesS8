/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Interfaces.Animal;

/**
 *
 * @author bryan
 */
public class Perro implements Animal<String> {
    @Override
    public String hacerSonido() {
        return "El perro ladra: Guau guau.";
    }

    @Override
    public String mover() {
        return "El perro corre rapidamente.";
    }
}
