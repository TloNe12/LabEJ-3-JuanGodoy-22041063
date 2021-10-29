/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

/**
 *
 * @author jcgol
 */
public class Entrenador extends Gimnasio{
    private int edad;
    private char sexo;
    private String nombre;

    public Entrenador() {
    }

    public Entrenador(int edad, char sexo, String nombre) {
        this.edad = edad;
        this.sexo = sexo;
        this.nombre = nombre;
    }

    public Entrenador(int edad, char sexo, String nombre, int victorias, int derrotas, double dinero, String name, String ciudad, String lider) {
        super(victorias=0, derrotas=0, dinero, nombre, ciudad, lider);
        this.edad = edad;
        this.sexo = sexo;
        this.nombre = name;
    }
    
    
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Entrenador{" + "edad=" + edad + ", sexo="
                + sexo + ", nombre=" + nombre + '}';
    } 
    
}
