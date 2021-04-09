/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea0;

/**
 *
 * @author rodo
 */
public class PruebaLibroCalificaciones
{
    // el método main comienza la ejecución del programa
    
    public static void main(String[] args)
    {
        // arreglo de calificaciones de estudiantes
        int[] arregloCalif = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones
        ( "CS101 Introduccion a la programacion en Java", arregloCalif);
        
        System.out.printf("Bienvenido al libro de calificaciones para%n%s%n%n",
          miLibroCalificaciones.obtenerNombreDelCurso());
        
        miLibroCalificaciones.procesarCalificaciones();
    }
    
}
