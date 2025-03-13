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
public class Rectangulo implements Geometrica<Double> {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public Double Area() {
        return ancho * alto;
    }

    @Override
    public Double Perimetro() {
        return 2 * (ancho + alto);
    }
}
