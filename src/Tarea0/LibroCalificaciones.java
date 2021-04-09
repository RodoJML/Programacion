/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea0;

/**
 *
 * @author Rodolfo Meneses Leal
 */
public class LibroCalificaciones
{
    private String nombreDelCurso; // nombre del curso que representa este LibroCalificaciones
    private int[] calificaciones; // arreglo de calificaciones de estudiantes
    
    // constructor
    
    public LibroCalificaciones(String nombreDelCurso, int[] calificaciones)
    {
        this.nombreDelCurso = nombreDelCurso;
        this.calificaciones = calificaciones;
    }
    
    // método para establecer el nombre del curso
    public void establecerNombreDelCurso(String nombreDelCurso)
    {
        this.nombreDelCurso = nombreDelCurso;
    }
    
    // método para obtener el nombre del curso
    public String obtenerNombreDelCurso()
    {
        return nombreDelCurso;
    }
    
    // realiza varias operaciones sobre los datos
    public void procesarCalificaciones()
    {
        // imprime el arreglo calificaciones en pantalla
        imprimirCalificaciones();
         
        // llama al método obtenerPromedio para calcular la calificación promedio
        System.out.printf("%nEl promedio de la clase es %.2f%n", obtenerPromedio());
        
        // llama a los métodos obtenerMinima y obtenerMaxima
        System.out.printf("La calificacion mas baja es %d%nLa calificacion mas alta es %d%n%n", obtenerMinima(), obtenerMaxima());
        
        // llama a imprimirGraficoBarras para imprimir el gráfico de distribución de calificaciones
        imprimirGraficoBarras();
    }
    
    // busca la calificación más baja
    public int obtenerMinima()
    {
        int califBaja = calificaciones[0]; // asume que calificaciones[0] es la mas baja
        
        for (int calificacion : calificaciones)
        {
            // si calificación es menor que califBaja, se asigna a califBaja
            if (calificacion < califBaja)
            califBaja = calificacion; // nueva calificación más baja
        }
        
        return califBaja;
        
    }
    
    public int obtenerMaxima()
    {
        int califAlta = calificaciones[0]; // asume que calificaciones[0] es la más alta

        // itera a través del arreglo de calificaciones
        for (int calificacion : calificaciones)
        {
            // si calificacion es mayor que califAlta, se asigna a califAlta
            if (calificacion > califAlta)
            califAlta = calificacion; // nueva calificación más alta
        }
        
        return califAlta;
    }
    
    public double obtenerPromedio()
    {
        int total = 0;
        
        for(int calificacion : calificaciones)
            total += calificacion;
        
        // Devuelve el promideo de las calificaciones
        return (double) total / calificaciones.length;
    }
     
    // imprime grafico de barras que muestra la distribución de las calificaciones
    
    public void imprimirGraficoBarras()
    {
        System.out.println("Distribucion de calificaciones:");
        
        // almacena la frecuencia de las calificaciones en cada rango de 10 calificaciones
        int[] frecuencia = new int[11];
        
        // para cada calificación, incrementa la frecuencia apropiada
        for (int calificacion : calificaciones)
            ++frecuencia[calificacion / 10];
        
        // para cada frecuencia de calificación, imprime una barra en el gráfico
        for (int cuenta = 0; cuenta < frecuencia.length; cuenta++)
        {
            // imprime etiqueta de barra (“00-09: ”, ..., “90-99: ”, “100: ”)
            if (cuenta == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", cuenta * 10, cuenta * 10 + 9);
               
            // imprime barra de asteriscos
            for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++)
                System.out.print("*");
            
            System.out.println();
                
        }
    }
    
    public void imprimirCalificaciones()
    {
        System.out.println("Las calificaciones son:%n%n");
        
        // imprime la calificación de cada estudiante
         for (int estudiante = 0; estudiante < calificaciones.length; estudiante++)
             System.out.printf("Estudiante %2d: %3d%n", estudiante + 1, calificaciones[estudiante]);
    }
}
