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
public class Gato implements Animal<String> {
    @Override
    public String hacerSonido() {
        return "El gato maulla: Miau miau.";
    }

    @Override
    public String mover() {
        return "El gato salta agilmente.";
    }
}
