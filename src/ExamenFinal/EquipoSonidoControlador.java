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
                }
                case 1:
                {
                    view.viewDeleteAudio();
                }
                case 2:
                {
                    view.viewShowAllPlaylist();
                }
                case 3:
                {
                    view.viewListenPlaylistOrder();
                }
                case 4:
                {
                    view.viewListenPlaylistRandom();
                }
                case 5:
                {
                    view.viewSetVolumen();
                }
                case 6:
                {
                    view.viewRadioMode();
                }
                case 7:
                {
                    view.viewSetAlarm();
                }
            }
        }
    }
}
