/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Interfaces.Vehiculo;

/**
 *
 * @author bryan
 */
public class Coche implements Vehiculo<String> {

    @Override
    public String Arrancar() {
        return "El coche arranca y quema gasolina.";
    }

    @Override
    public String Detener() {
        return "El coche frena y el motor descansa.";
    }
}
