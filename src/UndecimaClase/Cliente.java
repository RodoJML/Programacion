/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UndecimaClase;

import java.util.Scanner;

/**
 *
 * @author rodo
 */
public class Cliente {
    String nombre;
    String apellidos;
    String numCedula;
    int numVuelo;
    String nacionalidad;
    
    public void solicitarDatos(){
        Scanner s = new Scanner(System.in);
        System.out.println("Favor digite su nombre: ");
        this.nombre = s.next();
        System.out.println("Favor digite su apellidos: ");
        this.apellidos = s.next();
        System.out.println("Favor digite su Num Cedula: ");
        this.numCedula = s.next();
        System.out.println("Favor digite Num Vuelo: ");
        this.numVuelo = s.nextInt();
        System.out.println("Favor digite su nacionalidad: ");
        this.nacionalidad = s.next();
        
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", numCedula=" + numCedula + ", numVuelo=" + numVuelo + ", nacionalidad=" + nacionalidad + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
 
    
}
