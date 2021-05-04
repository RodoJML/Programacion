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
    RightSpeaker RS;
    LeftSpeaker LS;
    Subwoofer SW;
    String audio;
    
    public EquipoSonido()
    {
        this.playlist = new Audio[1000];
        
        for(int i = 0; i <= 1000; i++)
        {
            this.playlist[i].setAudio("");
        }
        
        this.RS = new RightSpeaker();
        this.LS = new LeftSpeaker();
        this.SW = new Subwoofer();
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
        String allPlaylist = "";
        
        for(int i = 0; i < 1000; i++)
        {
            allPlaylist += "Song: ";
            allPlaylist += this.playlist[i].getAudio();
            allPlaylist += "\n";
        }
        
        return allPlaylist;
    }
    
    public String listenPlaylistOrder()
    {
        String audioOrder = "";
        
        for(int i = 0; i < 1000; i++)
        {
            audioOrder += "Playing: ";
            audioOrder += this.playlist[i].getAudio();
            audioOrder += "\n";
            sendAudio(this.playlist[i]);
        }
        return audioOrder;
    }
    
    public String listenPlaylistRandom()
    {
        String audioOrder = "";
        
        for(int i = 0; i < 1000; i++)
        {
            audioOrder += "Playing: ";
            audioOrder += this.playlist[i].getAudio();
            audioOrder += "\n";
            sendAudio(this.playlist[i]);
        }
        return audioOrder;
    }
    
    public void sendAudio(Audio mp3)
    {
        RS.sonar(mp3);
        LS.sonar(mp3);
        SW.sonar(mp3);
    }
    
    public void setVolume(int rsVol, int lsVol, int swVol)
    {
        RS.setVolumeLevel(rsVol);
        LS.setVolumeLevel(lsVol);
        SW.setVolumeLevel(swVol);
    }
}
