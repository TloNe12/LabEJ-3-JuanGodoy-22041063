/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import java.util.Random;

/**
 *
 * @author jcgol
 */
public class Pokemon {

    private String nombre;
    private int ataque, vida;
    Random random = new Random();

    public Pokemon(String nombre) {
        this.nombre = nombre;
        int lowA = 100;
        int highA = 200;
        ataque = random.nextInt(highA - lowA) + lowA;
        int lowV = 200;
        int highV = 500;
        vida = random.nextInt(highV - lowV) + lowV;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        if (ataque >= 200 && ataque <= 500) {
            this.ataque = ataque;
        }

    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida >= 100 && vida <= 200) {
            this.vida = vida;
        }

    }

}
