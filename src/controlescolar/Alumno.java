/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlescolar;

import java.util.Date;

/**
 *
 * @author Oscar Cano
 */
public class Alumno extends Persona {
    public Integer Matricula;
    public Grado Grado;

    public Alumno(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento);
    }

    public Alumno(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, Integer Matricula, Grado Grado) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento);
        this.Matricula = Matricula;
        this.Grado = Grado;
    }

    public Integer getMatricula() {
        return Matricula;
    }

    public void setMatricula(Integer Matricula) {
        this.Matricula = Matricula;
    }

    public Grado getGrado() {
        return Grado;
    }

    public void setGrado(Grado Grado) {
        this.Grado = Grado;
    }
 
    
    
    
}
