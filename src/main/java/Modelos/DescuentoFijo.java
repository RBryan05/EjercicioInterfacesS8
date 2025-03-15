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
public class DescuentoFijo implements Descontable<String>{

    @Override
    public String CalcularDesceunto(Double precio) {
        int descuento = 10;
        if(precio <= descuento){
            return "No aplica para el descuento.";
        }
        else 
        {
            double precioFinal = precio - descuento;
            return "Precio inicial: $" + precio + "\nPrecio con descuendto de $10: $" + precioFinal;
        }
    }
    
}
