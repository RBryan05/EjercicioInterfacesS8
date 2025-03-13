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
public class Bicicleta implements Vehiculo<String> {

    @Override
    public String Arrancar() {
        return "El conductor pedalea y la bicicleta arranca.";
    }

    @Override
    public String Detener() {
        return "El condcutor se cansa y la bicicleta frena.";
    }   
}
