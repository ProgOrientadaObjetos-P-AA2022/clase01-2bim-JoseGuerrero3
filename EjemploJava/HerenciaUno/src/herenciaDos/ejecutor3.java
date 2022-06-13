/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaDos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class ejecutor3 {
    
    public static void main(String[] args) {
        
      Scanner entrada = new Scanner(System.in);
        /*
        En el método **main**, se debe permitir ingresar objetos 
        de tipo Estudiante Distancia y Estudiante Presencial. 
        Uno a la vez. Si el usuario ingresa 1, se debe crear un 
        Estudiante Distancia por teclado; si ingresa 2, se debe crear un 
        Estudiante Presencial. Los datos de entrada serán ingresados por 
        teclado.

        Restricciones:
        * En el código solo debe usar por una sola ocasión la siguiente 
        sentencias
        ```
            nombres = entrada.nextLine()
             apellido = entrada.nextLine()
            cedula = entrada.nextLine()
            edad =  entradad.nextline()
        ```
        * Si el usuario ingresa algo diferente de 1 o 2; el programa debe 
        presentar un mensaje que diga: "Error, opción no válida."
        
        */
        
       
        entrada.useLocale(Locale.US);

        System.out.println();
        int opcion = entrada.nextInt();
        System.out.println("Ingrese el nombre del Estudiante: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el Apellido del Estudiante: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese la identificación del Estudiante: ");
        String id = entrada.nextLine();
        System.out.println("Ingrese la edad del Estudiante: ");
        int edad = entrada.nextInt();

        switch (opcion) {
            case 1: 
                
            case 2:

        }

//        EstudiantePresencial estudiante = new EstudiantePresencial();
//        estudiante.establecerNombresEstudiante(nombre);
//        estudiante.establecerApellidoEstudiante(apellido);
//        estudiante.establecerIdentificacionEstudiante(id);
//        estudiante.establecerEdadEstudiante(edad);
//        estudiante.establecerCostoCredito(costo);


      
 
    }
    
}
