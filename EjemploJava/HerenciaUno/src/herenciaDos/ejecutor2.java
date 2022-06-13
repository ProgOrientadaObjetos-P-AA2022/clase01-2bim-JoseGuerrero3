/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaDos;

import herenciauno.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class ejecutor2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
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
        System.out.println("Ingrese el numero de Créditos: ");
        int numCreditos = entrada.nextInt();
        System.out.println("Ingrese el costo de cada crédito: ");
        double costo = entrada.nextDouble();

        switch (opcion) {
            case 1: 
            
                
            case 2:

        }

        EstudiantePresencial estudiante = new EstudiantePresencial();
        estudiante.establecerNombresEstudiante(nombre);
        estudiante.establecerApellidoEstudiante(apellido);
        estudiante.establecerIdentificacionEstudiante(id);
        estudiante.establecerEdadEstudiante(edad);
        estudiante.establecerCostoCredito(costo);

    }

}
