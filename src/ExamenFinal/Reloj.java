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
public class Reloj
{
    int hora;
    int minutos;
    
    public void setAlarm(int horas, int minutos)
    {
        this.hora = horas;
        this.minutos = minutos;
    }

    public int getHora()
    {
        return hora;
    }

    public void setHora(int hora)
    {
        this.hora = hora;
    }

    public int getMinutos()
    {
        return minutos;
    }

    public void setMinutos(int minutos)
    {
        this.minutos = minutos;
    }
    
    
}
