/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlescolar;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Oscar Cano
 */
public class CicloEscolar {
    public Integer clave;
    public String descripcion;
    public Date fechaInicio;
    public Date fechaFinal;
    public List cursos;


    public CicloEscolar(Integer clave, String descripcion, Date fechaInicio, Date fechaFinal) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public CicloEscolar(Integer clave, String descripcion, Date fechaInicio, Date fechaFinal, List cursos) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public List getCursos() {
        return cursos;
    }

    public void setCursos(List cursos) {
        this.cursos = cursos;
    }


    
    
}
