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
public class Maestro extends Entrenador{
    private int victorias;
    private ArrayList<Pokemon> pokemon = new ArrayList();

    public Maestro(int victorias, int edad, char sexo, String nombre) {
        super(edad, sexo, nombre);
        this.victorias = victorias;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public ArrayList<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(ArrayList<Pokemon> pokemon) {
        if(pokemon.size()<=1){
        this.pokemon = pokemon;}
    }

    @Override
    public String toString() {
        return super.toString()+"Maestro{" + "victorias=" + victorias + 
                ", pokemon=" + pokemon + '}';
    }
    
    
    
    
}
