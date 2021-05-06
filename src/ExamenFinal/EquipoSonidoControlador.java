/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

/**
 *
 * @author Rodolfo Meneses Leal 20200112770
 */
public class EquipoSonidoControlador
{
    EquipoSonido model = new EquipoSonido();
    EquipoSonidoInterfaz view = new EquipoSonidoInterfaz(model);
    
    public void start()
    {
        while(true)
        {
            switch(view.mainMenu())
            {
                case 0:
                {
                    view.viewAddAudio();
                    break;
                }
                case 1:
                {
                    view.viewDeleteAudio();
                    break;
                }
                case 2:
                {
                    view.viewShowAllPlaylist();
                    break;
                }
                case 3:
                {
                    view.viewListenPlaylistOrder();
                    break;
                }
                case 4:
                {
                    view.viewListenPlaylistRandom();
                    break;
                }
                case 5:
                {
                    view.viewSetVolumen();
                    break;
                }
                case 6:
                {
                    view.viewRadioMode();
                    break;
                }
                case 7:
                {
                    view.viewSetAlarm();
                    break;
                }
                case 8:
                {
                    view.setSpeakersStatus();
                    break;
                }    
            }
        }
    }
}
