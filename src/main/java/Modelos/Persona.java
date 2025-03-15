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
public class Persona implements Alimentacion<String> {

    @Override
    public String Comer() {
        return "La persona come vegetales y bomita porque no le gustan.";
    }
}