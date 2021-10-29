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
public class Coordinador extends Entrenador{
    private ArrayList<Pokemon> pokemon = new ArrayList();

    public Coordinador(int edad, char sexo, String nombre) {
        super(edad, sexo, nombre);
    }

    public ArrayList<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(ArrayList<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public String toString() {
        return super.toString()+"Coordinador{" + "pokemon=" + pokemon + '}';
    }

    
    
    
    
    
}
