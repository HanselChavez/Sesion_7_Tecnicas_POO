/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor.Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Cita {
    private Date fecha;
    private String hora ;
    private Paciente paciente;
    private Medico medico;
    private Especialidad especialidad;

    public Date getFecha() {
        return fecha;
    }
    public String getFechaString(){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        return formatoFecha.format(fecha);
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public String getDatos(){
      return this.getPaciente().getNombre()+"  -  "
              +this.getFecha().toString() +" -- "
              +String.valueOf(this.getHora());
    }
    private static String padRight(String str, int length, char padChar) {
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() < length) {
            sb.append(padChar);
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        return padRight(formatoFecha.format(fecha), 14, ' ')+
               padRight(paciente.getDni(), 12,' ')+
               padRight(paciente.getNombre(), 15,' ')+
               padRight(medico.getNombre(),15,' ')+especialidad.getNombre();
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Especialidad getEspecialida() {
        return especialidad;
    }

    public void setEspecialida(Especialidad especialida) {
        this.especialidad = especialida;
    }
    
}
