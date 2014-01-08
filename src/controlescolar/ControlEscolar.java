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
public class ControlEscolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date d = new Date();
    
        Alumno alumno = new Alumno("oscar","cano","gonzalez", d);


        System.out.println("Alumno: "+alumno.getNombre());

    }
    
}
