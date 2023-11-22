/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author allen
 */
public class Reserva {
    private int idReserva;
    private Cliente idCliente;
    private String tipoHabitacion;
    private int nroHabitacion;
    private Date fechaReserva,fechaIngreso,fechaSalida;
    private int costoHabitacion;

    public Reserva() {
    }

    public Reserva(int idReserva, Cliente idCliente, String tipoHabitacion, int nroHabitacion, Date fechaReserva, Date fechaIngreso, Date fechaSalida, int costoHabitacion) {
        this.idReserva = idReserva;
        this.idCliente = idCliente;
        this.tipoHabitacion = tipoHabitacion;
        this.nroHabitacion = nroHabitacion;
        this.fechaReserva = fechaReserva;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.costoHabitacion = costoHabitacion;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCostoHabitacion() {
        return costoHabitacion;
    }

    public void setCostoHabitacion(int costoHabitacion) {
        this.costoHabitacion = costoHabitacion;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", idCliente=" + idCliente + ", tipoHabitacion=" + tipoHabitacion + ", nroHabitacion=" + nroHabitacion + ", fechaReserva=" + fechaReserva + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", costoHabitacion=" + costoHabitacion + '}';
    }
    
    

}
    

