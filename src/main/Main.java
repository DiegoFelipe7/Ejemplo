/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Clases.*;
import Clases.Listas;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bandera = true;
         double duracion;
         ArrayList<Listas> lista_arreglo = new ArrayList<>();
        int opcion = 0, contador=0, identificador;
        String titulo, genero, caratula, descripcion, fecha;
        Scanner teclado = new Scanner(System.in);
        Listas lista=null;
        
        while (bandera) {
            System.out.println("Welcome to the music library \n 1.Create a plailyst \n 2.filter song of the same genre \n 3.filtrar canción en el mismo año \n");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    try { 
                       
                        System.out.println("titulo");
                        titulo = teclado.next();
                        System.out.println("identificador");
                        identificador = teclado.nextInt();
                        System.out.println("fecha yyyy-mm-dd");
                        fecha = teclado.next();            
                        LocalDate localDate = LocalDate.parse(fecha);
                        System.out.println("duracion");
                        duracion = teclado.nextDouble();
                        System.out.println("genero");
                        genero = teclado.next();
                        System.out.println("caratula");
                        caratula = teclado.next();
                        System.out.println("descripcion");
                        descripcion = teclado.next();
                        lista = new Listas(titulo, identificador, localDate, duracion, genero, caratula, descripcion);
                        lista_arreglo.add(lista);
                        lista.setLista_arreglo(lista_arreglo);
                        System.out.println("Datos almacenados");
                        System.out.println(lista.contadorMusica());
                    }  catch (Exception e) {
                        System.out.println("Error : " +e);
                    }
                  break;
                case 2:
                    System.out.println("Ingresa el genero a buscar");
                    genero=teclado.next();
                    ArrayList<Listas>filtro=lista.buscador(genero);
                    System.out.println(filtro.size());
                     for (int i = 0; i <filtro.size(); i++) {
                         lista=filtro.get(i);
                         System.out.println(lista.mensaje());
                    }
   
                    break;
                    
                case 4:
                    opcion=teclado.nextInt();
                    if(opcion==1){
                    Collections.sort(lista.getLista_arreglo());
                    for (int i = 0; i < 1; i++) {
                        System.out.println(lista.getLista_arreglo());
                    }
                    }else if(opcion==2){
                    Collections.sort(lista.getLista_arreglo(),Collections.reverseOrder());
                    for (int i = 0; i < 1; i++) {
                        System.out.println(lista.getLista_arreglo());
                    }   
                    }else if(opcion==3){
                        for (int i = 0; i <1; i++) {
                            System.out.println(lista.getLista_arreglo());
                        }
                    }
                
                default:
                    System.out.println("Opcion no existe");
            }
        }
    }

}


/*       break;
                */