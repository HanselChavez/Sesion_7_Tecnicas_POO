/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor.Main;

import Gestor.Entidades.Cita;
import Gestor.Pantallas.PantallaGestorCitas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hansel Chavez
 */
public class GestorDeCitas {

    /**
     *
     */
    public static List<Cita> listaCitas = new ArrayList<Cita>();
    public static void main(String [] args){
    
        PantallaGestorCitas pantaPrincipal = new PantallaGestorCitas(listaCitas);
        pantaPrincipal.setLocationRelativeTo(null);        
        pantaPrincipal.setVisible(true);
        
    }
}
