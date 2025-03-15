/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejerciciosemana8;

import Interfaces.Alimentacion;
import Interfaces.Animal;
import Interfaces.ComparableObjeto;
import Interfaces.Descontable;
import Interfaces.Geometrica;
import Interfaces.Notificable;
import Interfaces.Ordenable;
import Interfaces.Pago;
import Interfaces.Trabajador;
import Interfaces.Vehiculo;
import Modelos.Animales;
import Modelos.Bicicleta;
import Modelos.Circulo;
import Modelos.Coche;
import Modelos.CorreoElectronico;
import Modelos.Desarrollador;
import Modelos.DescuentoFijo;
import Modelos.DescuentoPorcentaje;
import Modelos.Diseñador;
import Modelos.Gato;
import Modelos.ListaNumeros;
import Modelos.PagoConEfectivo;
import Modelos.PagoConTargeta;
import Modelos.Perro;
import Modelos.Persona;
import Modelos.Producto;
import Modelos.Rectangulo;
import Modelos.SMS;

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

        //Geométrica
        double radio = 4;
        Geometrica<Double> circulo = new Circulo(radio);
        double ancho = 5;
        double alto = 3;
        Geometrica<Double> rectangulo = new Rectangulo(ancho, alto);

        //Ordenable
        Ordenable<String> listaNumeros = new ListaNumeros();

        //Alimentacion
        Alimentacion<String> persona = new Persona();
        Alimentacion<String> animal = new Animales();

        //Notificable
        Notificable<String> correoElectronico = new CorreoElectronico();
        Notificable<String> sms = new SMS();

        //Comparable
        ComparableObjeto<String> laptop = new Producto("Laptop", 1200.50);

        //Descontable
        Descontable<String> descuentoPorcentaje = new DescuentoPorcentaje();
        Descontable<String> descuentoFijo = new DescuentoFijo();

        //Perro
        System.out.println("Comportamiento del Perro:");
        System.out.println(perro.hacerSonido());
        System.out.println(perro.mover());
        //Gato
        System.out.println("\nComportamiento del Gato:");
        System.out.println(gato.hacerSonido());
        System.out.println(gato.mover());

        System.out.println("\n--------------------------------------------------");

        //Coche
        System.out.println("\nComportamiento del Coche:");
        System.out.println(coche.Arrancar());
        System.out.println(coche.Detener());
        //Bicicleta
        System.out.println("\nComportamiento de la bicicleta:");
        System.out.println(bicicleta.Arrancar());
        System.out.println(bicicleta.Detener());

        System.out.println("\n--------------------------------------------------");

        // Pago con Targeta
        System.out.println("\nPago con targeta:");
        System.out.println(pagoConTargeta.ProcesarPago(25.75));
        // Pago en Efectico
        System.out.println("\nPago en efectivo:");
        System.out.println(pagoConEfectivo.ProcesarPago(5.99));

        System.out.println("\n--------------------------------------------------");

        //Circulo
        System.out.println("\nLos datos del circulo son:");
        System.out.println("Area: " + circulo.Area());
        System.out.println("Perímetro: " + circulo.Perimetro());
        //Rectangulo
        System.out.println("\nLos datos del rectangulo son:");
        System.out.println("Area: " + rectangulo.Area());
        System.out.println("Perímetro: " + rectangulo.Perimetro());

        System.out.println("\n--------------------------------------------------");

        //Desarrollador
        System.out.println("\n" + desarrollador.Trabajar());
        //Diseñador
        System.out.println("\n" + diseñador.Trabajar());

        System.out.println("\n--------------------------------------------------");

        //Orenar nuemros usando sort
        System.out.println("\n" + listaNumeros.Ordenar());

        System.out.println("\n--------------------------------------------------");

        //Persona
        System.out.println("\n" + persona.Comer());
        //Animal
        System.out.println("\n" + animal.Comer());

        System.out.println("\n--------------------------------------------------");

        //Correo electrónico
        System.out.println("\n" + correoElectronico.EnviarNotificacion());
        //SMS
        System.out.println("\n" + sms.EnviarNotificacion());

        System.out.println("\n--------------------------------------------------");

        //Comparar
        Producto smartPhone = new Producto("Smartphone", 800.99);
        System.out.println("\n" + laptop.Comparar(smartPhone));

        System.out.println("\n--------------------------------------------------");

        //Descuento por Porcentaje
        System.out.println("\n" + descuentoPorcentaje.CalcularDesceunto(smartPhone.getPrecio()));
        //Descuento Fijo
        System.out.println("\n" + descuentoFijo.CalcularDesceunto(smartPhone.getPrecio()) + "\n");
    }
}
