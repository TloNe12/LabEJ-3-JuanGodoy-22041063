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
public class Novato extends Entrenador{
    private int descubierto;
    private ArrayList<Pokemon> pokemon = new ArrayList();

    public Novato(int descubierto) {
        this.descubierto = descubierto;
    }

    public Novato(int descubierto, int edad, char sexo, String nombre) {
        super(edad, sexo, nombre);
        this.descubierto = descubierto;
    }
    
    
    public int getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(int descubierto) {
        this.descubierto = descubierto;
    }

    public ArrayList<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(ArrayList<Pokemon> pokemon) {
        if(pokemon.size()<=1){
        this.pokemon = pokemon;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Novato{" + "descubierto=" + descubierto + ", pokemon=" + pokemon + '}';
    }
    
    
    
}
