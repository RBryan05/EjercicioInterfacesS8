/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosemana8;

import Interfaces.Animal;
import Interfaces.Geometrica;
import Interfaces.Pago;
import Interfaces.Vehiculo;
import Modelos.Bicicleta;
import Modelos.Circulo;
import Modelos.Coche;
import Modelos.Gato;
import Modelos.PagoConEfectivo;
import Modelos.PagoConTargeta;
import Modelos.Perro;
import Modelos.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class EjercicioSemana8 {

    public static void main(String[] args) {
        
        //Animal
        Animal<String> perro = new Perro();
        Animal<String> gato = new Gato();
        
        //Vehiculo
        Vehiculo<String> coche = new Coche();
        Vehiculo<String> bicicleta = new Bicicleta();
        
        //Pago
        Pago<String> pagoConEfectivo = new PagoConEfectivo();
        Pago<String> pagoConTargeta = new PagoConTargeta();
        
        //Perro
        System.out.println("Comportamiento del Perro:");
        System.out.println(perro.hacerSonido());
        System.out.println(perro.mover());       
        //Gato
        System.out.println("\nComportamiento del Gato:");
        System.out.println(gato.hacerSonido());
        System.out.println(gato.mover());
        
        //Coche
        System.out.println("\nComportamiento del Coche:");
        System.out.println(coche.Arrancar());
        System.out.println(coche.Detener());       
        //Bicicleta
        System.out.println("\nComportamiento de la bicicleta:");
        System.out.println(bicicleta.Arrancar());
        System.out.println(bicicleta.Detener());
        
        // Pago con Targeta
        System.out.println("\nPago con targeta:");
        System.out.println(pagoConTargeta.ProcesarPago(25.75));
        // Pago en Efectico
        System.out.println("\nPago en efectivo:");
        System.out.println(pagoConEfectivo.ProcesarPago(5.99));
        
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos para Circulo
        System.out.print("Ingrese el radio del circulo: ");
        double radio = scanner.nextDouble();
        Geometrica<Double> circulo = new Circulo(radio);

        // Ingresar datos para Rectangulo
        System.out.print("Ingrese el ancho del rectangulo: ");
        double ancho = scanner.nextDouble();
        System.out.print("Ingrese el alto del rectangulo: ");
        double alto = scanner.nextDouble();
        Geometrica<Double> rectangulo = new Rectangulo(ancho, alto);
        
        //Circulo
        System.out.println("\nLos datos del circulo son:");
        System.out.println("Area: " + circulo.Area());
        System.out.println("Perímetro: " + circulo.Perimetro());

        //Rectangulo
        System.out.println("\nLos datos del rectangulo son:");
        System.out.println("Area: " + rectangulo.Area());
        System.out.println("Perímetro: " + rectangulo.Perimetro());

        scanner.close();
    }
}