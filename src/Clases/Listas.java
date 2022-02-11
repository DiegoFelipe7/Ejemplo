/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Listas extends Canciones implements Interfaz.interfacemusica ,Comparable<Listas> {
    
    public ArrayList<Listas> lista_arreglo = new ArrayList<>();

    public Listas(String titulo, int identificador, LocalDate fecha, double duracion, String fenero, String caratula, String descripcion) {
        super(titulo, identificador, fecha, duracion, fenero, caratula, descripcion);
    }

    public Listas() {
    }
    
    public ArrayList<Listas> getLista_arreglo() {
        return lista_arreglo;
    }

    public void setLista_arreglo(ArrayList<Listas> lista_arreglo) {
        this.lista_arreglo = lista_arreglo;
    }
    
    
    @Override
    public int contadorMusica() {
        return lista_arreglo.size();
    }

    @Override
    public ArrayList<Listas> buscador(String genero) {
        ArrayList<Listas>buscador = new ArrayList<>();
        for (Listas listas : lista_arreglo) {
            if(listas.getFenero().equalsIgnoreCase(genero)){
                buscador.add(listas);
            }
        }
        return buscador;
    }

    @Override
    public String mensaje() {
        
        return "Filtro de Canciones por Genero : "+getTitulo() + " " + getIdentificador();
    }

    @Override
    public ArrayList<Listas> buscador(int año) {
        ArrayList<Listas>buscador = new ArrayList<>();
        for (Listas listas : lista_arreglo) {
            if(listas.getFenero().equals(año)){
                buscador.add(listas);
            }
        }
        return buscador;
    }
    public ArrayList<Listas> Ordenar(String orden) {
        double aux;
        ArrayList<Listas>buscador = new ArrayList<>();
        if(orden.equalsIgnoreCase("ASC")){
            for (Listas listas : buscador) {
                if(listas.getDuracion()>listas.getDuracion()+1){
                    
                    buscador.add(listas);
                }
            }
            
        }
        return buscador;
    }

    @Override
    public int compareTo(Listas o ) {
        return Double.compare(getDuracion(), o.getDuracion());  
    }
    
    

    @Override
    public String toString() {
        return "Lista" + super.toString();
    }


    
    
}
