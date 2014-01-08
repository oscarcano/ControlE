/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlescolar;

import java.util.List;

/**
 *
 * @author Desarrollo01
 */
public class Materia {
    public Integer clave;
    public String descripcion;
    public Grado grado;
    public List cursos;

    public Materia(Integer clave, String descripcion) {
        this.clave = clave;
        this.descripcion = descripcion;
    }

    public Materia(Integer clave, String descripcion, List cursos) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.cursos = cursos;
    }

    public Materia(Integer clave, String descripcion, Grado grado, List cursos) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.grado = grado;
        this.cursos = cursos;
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    public List getCursos() {
        return cursos;
    }

    public void setCursos(List cursos) {
        this.cursos = cursos;
    }
    
    
    
    
}
