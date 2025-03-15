/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosemana8;

import Interfaces.Alimentacion;
import Interfaces.Animal;
import Interfaces.Geometrica;
import Interfaces.Ordenable;
import Interfaces.Pago;
import Interfaces.Trabajador;
import Interfaces.Vehiculo;
import Modelos.Animales;
import Modelos.Bicicleta;
import Modelos.Circulo;
import Modelos.Coche;
import Modelos.Desarrollador;
import Modelos.Diseñador;
import Modelos.Gato;
import Modelos.ListaNumeros;
import Modelos.PagoConEfectivo;
import Modelos.PagoConTargeta;
import Modelos.Perro;
import Modelos.Persona;
import Modelos.Rectangulo;

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
        
        //Trabajador
        Trabajador<String> desarrollador = new Desarrollador();
        Trabajador<String> diseñador = new Diseñador();
        
        //Ordenable
        Ordenable<String> listaNumeros = new ListaNumeros();
        
        //Alimentacion
        Alimentacion<String> persona = new Persona();
        Alimentacion<String> animal = new Animales();
        
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

        // Ingresar datos para Circulo
        System.out.print("\nIngrese el radio del circulo: ");
        double radio = 4;
        Geometrica<Double> circulo = new Circulo(radio);

        // Ingresar datos para Rectangulo
        System.out.print("\nIngrese el ancho del rectangulo: ");
        double ancho = 5;
        System.out.print("\nIngrese el alto del rectangulo: ");
        double alto = 3;
        Geometrica<Double> rectangulo = new Rectangulo(ancho, alto);
        
        //Circulo
        System.out.println("\nLos datos del circulo son:");
        System.out.println("Area: " + circulo.Area());
        System.out.println("Perímetro: " + circulo.Perimetro());
        //Rectangulo
        System.out.println("\nLos datos del rectangulo son:");
        System.out.println("Area: " + rectangulo.Area());
        System.out.println("Perímetro: " + rectangulo.Perimetro());
        
        //Desarrollador
        System.out.println("\n"+desarrollador.Trabajar());    
        //Diseñador
        System.out.println("\n"+diseñador.Trabajar());
        
        //Orenar nuemros usando sort
        System.out.println("\n" + listaNumeros.Ordenar());
        
        //Persona
        System.out.println("\n" + persona.Comer());
        //Animal
        System.out.println("\n" + animal.Comer());
    }
}