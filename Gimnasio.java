/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import java.util.ArrayList;

/**
 *
 * @author jcgol
 */
public class Gimnasio {

    private int victorias, derrotas;
    private double dinero;
    private String nombre, ciudad, lider;
    private ArrayList<Entrenador> entrenadores = new ArrayList();

    public Gimnasio() {

    }

    public Gimnasio(int victorias, int derrotas, double dinero, String nombre, String ciudad, String lider) {
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.dinero = dinero;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.lider = lider;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public ArrayList<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(ArrayList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    @Override
    public String toString() {
        return "Gimnasio{" + "victorias=" + victorias +
                ", derrotas=" + derrotas + ", dinero=" 
                + dinero + ", nombre=" + nombre + ","
                + " ciudad=" + ciudad + ", lider="
                + lider + "entrenadores=" + entrenadores+'}';
    }

    
    
}
