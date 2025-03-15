/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Interfaces.Alimentacion;

/**
 *
 * @author bryan
 */
public class Animales implements Alimentacion<String> {

    @Override
    public String Comer() {
        return "El animal come croquetas y se alegra porque le encantan.";
    }
    
}
