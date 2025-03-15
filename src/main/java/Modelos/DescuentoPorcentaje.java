/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Interfaces.Descontable;

/**
 *
 * @author bryan
 */
public class DescuentoPorcentaje implements Descontable<String> {
    @Override
    public String CalcularDesceunto(Double precio) {
        double descuento = 0.1;
        double precioFinal = precio - (precio*descuento);
        return "Precio inicial del producto; $" + precio + "\nPrecion con el desceunto del 10%: $" + Math.round(precioFinal * 100.0) / 100.0;
    }
}