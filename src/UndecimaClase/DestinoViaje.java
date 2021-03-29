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
public class DestinoViaje 
{
    String pais;
    double precio;
    float distancia;
    int numHorasDuracion;
    String aerolinea; 
    
    public void solicitarDatosDestino()
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite el nombre del pais: ");
        this.pais = x.next();
        
        System.out.println("Digite el nombre del pais: ");
        this.precio = x.nextDouble();
        
        System.out.println("Digite el nombre del pais: ");
        this.distancia = x.nextFloat();
        
        System.out.println("Digite el nombre del pais: ");
        this.pais = x.next();
        
        System.out.println("Digite el nombre del pais: ");
        this.pais = x.next();
        
        System.out.println("Digite el nombre del pais: ");
        this.pais = x.next();
        
        
    }
    
}
