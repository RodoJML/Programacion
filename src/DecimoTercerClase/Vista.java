/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecimoTercerClase;

import java.util.Scanner;

/**
 *
 * @author rodo
 */
public class Vista
{
    Scanner read = new Scanner(System.in);
    Modelo modelo;                  // Si no pongo esto no puedo accesar a los metodos de modelo. 
    
    public Vista(Modelo parametro)  // No instancia modelos(Objetos), solamente hace referencia enlaces al modelo (Objetos)
    {
        this.modelo = parametro;
    }
    
    public Vista(int num)
    {
       
    }
    
    public void soliciteDosNumeros()
    {
        this.modelo.setNumero1(read.nextInt());
        this.modelo.setNumero2(read.nextInt());
    }
   
    
    public int mostrarMenu()
    {
        System.out.print("Bienvenido\n, 1 Introducir dos numeros \n2 Sumar"
                + "\n3 Restar\n4Mostrar resultado");
        
        int opcionSeleccionada = read.nextInt();
        
        return opcionSeleccionada;
    }
    
    public void mostrarResultado(int x)
    {
        System.out.print(x);
        
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
}
