/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Interfaces.Geometrica;

/**
 *
 * @author bryan
 */
public class Circulo implements Geometrica<Double> {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public Double Area() {
        return Math.PI * radio * radio;
    }

    @Override
    public Double Perimetro() {
        return 2 * Math.PI * radio;
    }
}