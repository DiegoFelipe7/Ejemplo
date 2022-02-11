/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Listas;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface interfacemusica {
    public ArrayList<Listas> buscador(String genero);  
    public ArrayList<Listas> buscador(int año);
    public ArrayList<Listas>Ordenar(String orden);
}
