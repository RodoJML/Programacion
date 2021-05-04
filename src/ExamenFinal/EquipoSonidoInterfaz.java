/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

import java.util.Scanner;

/**
 *
 * @author rodo
 */
public class EquipoSonidoInterfaz
{
    EquipoSonido model;
    Scanner read;
    
    public EquipoSonidoInterfaz(EquipoSonido parameter)
    {
        this.model = parameter;
    }
    
    public int mainMenu()
    {
        int option; 
        System.out.print("Welcome to your new Stereo"
                + "\n"
                + "\n0 - Add new audio to playlist"
                + "\n1 - Delete an audio from playlist"
                + "\n1 - View your playlist"
                + "\n2 - Listen to your playlist in order"
                + "\n3 - Listen to your playlist randomly"
                + "\n\nPlease select an option: ");
        
        return option = read.nextInt();
    }
    
    
}
