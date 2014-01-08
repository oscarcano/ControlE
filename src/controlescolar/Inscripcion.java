/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlescolar;

/**
 *
 * @author Desarrollo01
 */
public class Inscripcion {
    public Alumno alumno;
    public Curso curso;
    public Double primeraCalificacion;
    public Double segundaCalificacion;
    public Double terceraCalificacion;

    public Inscripcion(Alumno alumno, Curso curso) {
        this.alumno = alumno;
        this.curso = curso;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Double getPrimeraCalificacion() {
        return primeraCalificacion;
    }

    public void setPrimeraCalificacion(Double primeraCalificacion) {
        this.primeraCalificacion = primeraCalificacion;
    }

    public Double getSegundaCalificacion() {
        return segundaCalificacion;
    }

    public void setSegundaCalificacion(Double segundaCalificacion) {
        this.segundaCalificacion = segundaCalificacion;
    }

    public Double getTerceraCalificacion() {
        return terceraCalificacion;
    }

    public void setTerceraCalificacion(Double terceraCalificacion) {
        this.terceraCalificacion = terceraCalificacion;
    }
    
    
    
    
}
