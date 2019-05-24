/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazerta.proyectozoo;

/**
 *
 * @author Admin
 */
public class Animal {
    private String nombre;
    private int numero_patas;
    private boolean vuela;

    public Animal(String nombre, int numero_patas, boolean vuela) {
        this.nombre = nombre;
        this.numero_patas = numero_patas;
        this.vuela = vuela;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero_patas() {
        return numero_patas;
    }

    public boolean isVuela() {
        return vuela;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", numero_patas=" + numero_patas + ", vuela=" + vuela + '}';
    }
    
    
}
