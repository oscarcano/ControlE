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




public class Maestro extends Persona {
    public Integer numeroEmpleado;
    public Double salarioMensual;
    public Grado grado;
    public formaPago formaPago;
    public List cursos;


    public Maestro(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, Double salarioMensual, Grado grado, formaPago formaPago ) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento);
        this.salarioMensual = salarioMensual;
        this.grado = grado;
        this.formaPago = formaPago;
    }

    public Integer getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(Integer numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public Double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(Double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    public formaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(formaPago formaPago) {
        this.formaPago = formaPago;
    }

    public List getCursos() {
        return cursos;
    }

    public void setCursos(List cursos) {
        this.cursos = cursos;
    }
    

    
}
