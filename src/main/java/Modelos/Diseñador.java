/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Interfaces.Trabajador;

/**
 *
 * @author bryan
 */
public class Diseñador implements Trabajador<String> {

    @Override
    public String Trabajar() {
        return "El diseñador empieza a crear la interfaz que la aplicacion tendra";
    }
}
