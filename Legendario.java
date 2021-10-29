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
public class Legendario extends Entrenador{
    private ArrayList<Pokemon> legendario = new ArrayList();

    public Legendario(int edad, char sexo, String nombre) {
        super(edad, sexo, nombre);
    }

    public ArrayList<Pokemon> getLegendario() {
        return legendario;
    }

    public void setLegendario(ArrayList<Pokemon> legendario) {
        if(legendario.size()<=1){
        this.legendario = legendario;}
    }
    
    
    
    
}
