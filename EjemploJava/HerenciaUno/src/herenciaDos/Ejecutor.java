/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaDos;

import herenciauno.EstudianteDistancia;


/**
 *
 * @author SALA I
 */
public class Ejecutor {
    
    public static void main(String[] args){
        
        EstudianteDistancia estudiante = new EstudianteDistancia();
        estudiante.establecerNombresEstudiante("Xavier");
        estudiante.establecerApellidoEstudiante("Guerrero");
        estudiante.establecerIdentificacionEstudiante("8.345.766.");
        estudiante.establecerEdadEstudiante(18);
        estudiante.establecerIdentificacionEstudiante("8.345.766.");
        estudiante.establecerCostoAsignatura(250);
        estudiante.establecerNumeroAsginaturas(5);
        estudiante.calcularMatriculaDistancia();
        
        
        System.out.printf("%s\n", estudiante);
        
    }
    
}

