/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public abstract class Canciones {
    public String titulo;
    private int identificador;
    public LocalDate fecha;
    public double duracion;
    public String fenero;
    public String caratula;
    public String descripcion;

    public Canciones(String titulo, int identificador, LocalDate fecha, double duracion, String fenero, String caratula, String descripcion) {
        this.titulo = titulo;
        this.identificador = identificador;
        this.fecha = fecha;
        this.duracion = duracion;
        this.fenero = fenero;
        this.caratula = caratula;
        this.descripcion = descripcion;
    }

  
 
    public Canciones(){
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getFenero() {
        return fenero;
    }

    public void setFenero(String fenero) {
        this.fenero = fenero;
    }

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Canciones{" + "titulo=" + titulo + ", identificador=" + identificador + ", fecha=" + fecha + ", duracion=" + duracion + ", fenero=" + fenero + ", caratula=" + caratula + ", descripcion=" + descripcion + '}';
    }

    
    
    public abstract int contadorMusica();
    public abstract String mensaje();
}
