/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Daniel
 */
public class Persona {
    public String tipoSangre;
    public boolean alergico;

    public Persona(String tipoSangre, boolean alergico) {
        this.tipoSangre = tipoSangre;
        this.alergico = alergico;
    }

    @Override
    public String toString() {
        return "Persona { " + " tipoSangre = " + tipoSangre + ", alergico = " + alergico + '}';
    }
    
    public void comunicarse(){
        System.out.println("Comunicandose...");
    }
}
