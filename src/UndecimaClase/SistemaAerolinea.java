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
public class SistemaAerolinea {
    Cliente unicoCliente;
    Cliente segundoCliente;
    DestinoViaje destino1;
    
    public void iniciar(){
        unicoCliente = new Cliente();
        segundoCliente = new Cliente();
        
        Scanner read = new Scanner(System.in);
        System.out.println("Digite 1: Ingresar Clientes \n 2: Destino de viaje ");
        
        while(true)
        {
            int opcion = read.nextInt();
            
            switch(opcion)
            {
                case 1:
                    unicoCliente = new Cliente();
                    segundoCliente = new Cliente();
                    
                    //Solicita datos
                    unicoCliente.solicitarDatos();
                    segundoCliente.solicitarDatos();
                    break;
                    
                case 2:
                    
                    
                    
            }
        }
        
        solicitarDatosCliente();
        generarReporteClientes();
    }
    
    public void solicitarDatosCliente(){
        unicoCliente.solicitarDatos();
        segundoCliente.solicitarDatos();
    }
    
    public void generarReporteClientes(){
        String infoCliente1 = this.unicoCliente.toString();
        System.out.println(infoCliente1);
        
        String infoCliente2 = this.segundoCliente.toString();
        System.out.println(infoCliente2);
    }
}
