/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Interfaces.Pago;

/**
 *
 * @author bryan
 */
public class PagoConTargeta implements Pago<String> {
    @Override
    public String ProcesarPago(Double Cantidad) {
        return "Pago de $" + Cantidad + " procesado con tarjeta de credito.";
    }   
}