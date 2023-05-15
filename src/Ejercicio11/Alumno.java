/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Daniel
 */
public class Alumno extends Persona{
    public int clave;
    public String Nombre;
    public String colorCinta;
    public String descripcionCinta;

    public Alumno(String tipoSangre, boolean alergico, int clave, String nombre, String colorCinta, String descripcionCinta) {
        super(tipoSangre, alergico);
        this.clave = clave;
        this.Nombre = nombre;
        this.colorCinta = colorCinta;
        this.descripcionCinta = descripcionCinta;
    }
    
    public void entrenar(){
        System.out.println("Entrenando...");
    }
    
    public void dormir(){
        System.out.println("Durmiendo...");
    }

    @Override
    public String toString() {
        return super.toString() + "\nAlumno { " + " clave = " + clave + ", Nombre = " + Nombre + ", colorCinta = " 
                + colorCinta + ", descripcionCinta = " + descripcionCinta + '}';
    }
}
