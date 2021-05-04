/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

/**
 *
 * @author rodo
 */
public class EquipoSonido
{
    Audio playlist[];
    String audio;
    
    public EquipoSonido()
    {
        this.playlist = new Audio[1000];
        
        for(int i = 0; i <= 1000; i++)
        {
            this.playlist[i].setAudio("");
        }    
    }
    
    public void addAudioToPlaylist(String mp3, int index)
    {
        this.playlist[index].setAudio(mp3);
    }
    
    public void deleteAudioFromPlaylist(int index)
    {
        String mp3 = "";
        this.playlist[index].setAudio(mp3);
    }
    
    public String showAllPlaylist()
    {
        
    }
}
