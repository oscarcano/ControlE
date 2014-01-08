/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlescolar;

import java.util.List;

/**
 *
 * @author Oscar Cano
 */
public class Curso {
    public Materia materia;
    public Maestro maestro;
    public CicloEscolar cicloEscolar;
    public Integer cupo;
    public Integer salon;
    public List inscritos;

    public Curso() {
    }

    public Curso(Materia materia, Maestro maestro, CicloEscolar cicloEscolar, Integer salon) {
        this.materia = materia;
        this.maestro = maestro;
        this.cicloEscolar = cicloEscolar;
        this.salon = salon;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    public CicloEscolar getCicloEscolar() {
        return cicloEscolar;
    }

    public void setCicloEscolar(CicloEscolar cicloEscolar) {
        this.cicloEscolar = cicloEscolar;
    }

    public Integer getCupo() {
        return cupo;
    }

    public void setCupo(Integer cupo) {
        this.cupo = cupo;
    }

    public Integer getSalon() {
        return salon;
    }

    public void setSalon(Integer salon) {
        this.salon = salon;
    }

    public List getInscritos() {
        return inscritos;
    }

    public void setInscritos(List inscritos) {
        this.inscritos = inscritos;
    }
    
    
    
    
}
