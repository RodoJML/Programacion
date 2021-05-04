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
                + "\n4 - Turn up / down the volume"
                + "\n5 - Turn ON radio"
                + "\n6 - Turn ON stereo at a certain time"
                + "\n\nPlease select an option: ");
        
        return option = read.nextInt();
    }
    
    public void viewAddAudio()
    {
        System.out.print("Please enter your new audio: ");
        String mp3 = read.next();
        System.out.print("Store this audio on the position of the playlist (0 - 1000): ");
        int index = read.nextInt();
        model.addAudioToPlaylist(mp3, index);
    }
    
    public void viewDeleteAudio()
    {
        System.out.print("Please select the audio position you want to delete from playlist: ");
        int index = read.nextInt();
        model.deleteAudioFromPlaylist(index);
    }
    
    public void viewShowAllPlaylist()
    {
        System.out.println(model.showAllPlaylist());
        System.out.print("\n");
    }
    
    public void viewListenPlaylistOrder()
    {
        System.out.print(model.listenPlaylistOrder());
        System.out.print("\n");
    }
    
    public void viewListenPlaylistRandom()
    {
        System.out.print(model.listenPlaylistRandom());
        System.out.print("\n");
    }
    
    public void viewSetVolumen()
    {
        int rsVol = 0;
        int lsVol = 0;
        int swVol = 0;
       
        do
        {
            System.out.print("Please set the volume for the right speaker: ");
            rsVol = read.nextInt();
        }
        while(rsVol > 10);
        
        do
        {
            System.out.print("Please set the volume for the left speaker: ");
            lsVol = read.nextInt();
        }
        while(lsVol > 10);
        
        do
        {
            System.out.print("Please set the volume for the left speaker: ");
            swVol = read.nextInt();
        }
        while(swVol > 10);
        
        model.setVolume(rsVol, lsVol, swVol);
    }
}
