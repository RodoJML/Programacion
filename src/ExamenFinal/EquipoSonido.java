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
    Reloj clock;
    boolean playlistMode;
    boolean radioMode;
    
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
        this.clock = new Reloj();
        
        playlistMode = true;
        radioMode = false;
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
        this.RS.sonar(mp3);
        this.LS.sonar(mp3);
        this.SW.sonar(mp3);
    }
    
    public void setVolume(int rsVol, int lsVol, int swVol)
    {
        this.RS.setVolumeLevel(rsVol);
        this.LS.setVolumeLevel(lsVol);
        this.SW.setVolumeLevel(swVol);
    }
    
    public String setStereoMode(boolean radio)
    {
        if(radio == true)
        {
            this.playlistMode = false;
            this.radioMode = true;
        }
        else
            this.playlistMode = true;
            this.radioMode = false;
        
        Audio radioAudio = new Audio();
        return radioAudio.getInternetAudio();
    }
    
    public void autoPower(int hour, int minutes)
    {
        clock.setAlarm(hour, minutes);
    }
    
    public void speakersStatus(boolean status)
    {
        RS.status = status;
        LS.status = status;
        SW.status = status;
    }
}
