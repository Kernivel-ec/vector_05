/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kernivel.vector_05;
//Importamos libreria para lectura de datos por teclado
import java.util.Scanner;
/**
 *
 * @author Roberto Calero
 */
    /*
    Realice un programa en donde se dispone de N cantidad de temperaturas
    almacenadas en un vector. Se desea calcular el promedio de las temperaturas y
    luego imprimir en pantalla las temperaturas mayores o iguales que el promedio.
    */
public class Vector_05 {

    public static void main(String[] args) {
        
        //Creamos una variable de lectura de datos por teclado
        Scanner temp = new Scanner(System.in);
        //Texto que solicita la cantidad de temperaturas
        System.out.println("Ingrese cantidad de temperaturas:");
        //Creamos las variables
        //Cantidad de temperaturas
        int cant_temp = 0;
        //Guardamos la cantidad de temperaturas ingresadas por teclado
        cant_temp = temp.nextInt();
        //Creamos la variable de acumulacion y la inicializamos en cero
        int suma = 0;
        //Creamos la variable promedio de tipo double
        double promedio;
        //Creamos el vector de tipo int con la catidad definida anteriormente
        int temperaturas [] = new int [cant_temp];
        //Creamos un for que recorra el vector temperaturas
        for(int x = 0 ; x < cant_temp ; x++){
            //Guardamos en el vector de la posicion x una temperatura random
            temperaturas[x] = (int)(Math.random() * 10) + 1;
            //Realizamos la cumulacion/suma de temperaturas
            suma = suma + temperaturas[x];
        }
        //REalizamos en calculo del promedio
        promedio = suma / cant_temp;
        //Texto diseño
        System.out.println("Temperaturas");
        //Realizamos un for que me imprima las temperaturas guardadas
        for(int x = 0 ; x < cant_temp ; x++){
            //Impresion de temperaturas
            System.out.println("Temperatura = " + temperaturas[x]);   
        }
        //Imprimimos los valores
        System.out.println("Detalles");
        //Imprimimos la suma
        System.out.println("Suma = " + suma);
        //Imprimimos el promedio
        System.out.println("Promedio = " + promedio);
        //Realizamos la condicion de problema, que muestre las temperaturas mayores o iguales al promedio
        //Texto diseño
        System.out.println("Temperaturas condición");
        //Creamos el for para recorrer el vector temperaturas
        for(int x = 0 ; x < cant_temp ; x++){
            //Realizamos la condicion
           if(temperaturas[x] >= promedio){
            //Imprimimos las temperaturas de la poision x que cumplan la condicion
            System.out.println("Temperatura = " + temperaturas[x]);   
           }
        }
        
    }
}
