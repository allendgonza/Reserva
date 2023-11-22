/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Reserva;

/**
 *
 * @author allen
 */
public class Metodos {
    public boolean agregarCliente(Cliente cliente) {
        try {
            Conexion con = new Conexion();
            Connection conx = con.conexion();
            
            String query = "insert into cliente(idCliente,nombre,apaterno,telefono,email) VALUES ?,?,?,?,?)";
            PreparedStatement stmt = conx.prepareCall(query);
            stmt.setInt(1,cliente.getIdCliente());
            stmt.setString(2,cliente.getNombre());
            stmt.setString(3, cliente.getaPaterno());
            stmt.setInt(4, cliente.getTelefono());
            stmt.setString(5, cliente.getEmail());
            
            stmt.executeUpdate();
            stmt.close();
            conx.close();
            
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos", "Ingresando Cliente", 1);
            return false;
        }
    }
            
    
    
    //Agregar reserva
    public boolean agregarReserva(Reserva reserva,Cliente cliente) {
        try {
            Conexion con = new Conexion();
            Connection conx = con.conexion();
            
            String query = "insert into reserva(idReserva,idCliente,tipoHabitacion,nroHabitacion,fechaReserva,fechaIngreso,fechaSalida,costoHabitacion)values ?,?,?,?,?,?";
            PreparedStatement stmt = conx.prepareCall(query);
            stmt.setInt(1, reserva.getIdReserva());
            stmt.setInt(2, cliente.getIdCliente());
            stmt.setString(3, reserva.getTipoHabitacion());
            stmt.setInt(4, reserva.getNroHabitacion());
            stmt.setDate(5, new java.sql.Date(reserva.getFechaReserva().getTime()));
            stmt.setDate(6, new java.sql.Date(reserva.getFechaIngreso().getTime()));
            stmt.setDate(7, new java.sql.Date(reserva.getFechaSalida().getTime()));
            stmt.setInt(8, reserva.getCostoHabitacion());
            
            stmt.executeUpdate();
            stmt.close();
            conx.close();
            
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos", "Ingresando Reserva", 1);
            return false;
        }
    }
    
    //Listar reserva por columna
    public Reserva buscarReserva(int idReserva) {
        Reserva reserva = new Reserva();
        
        try {
            Conexion con = new Conexion();
            Connection conx = con.conexion();
            
            String query = "Select * from reserva where idReserva = ?";
            PreparedStatement stmt = conx.prepareCall(query);
            
            stmt.setInt(0, idReserva);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setTipoHabitacion(rs.getString("tipoHabitacion"));
                reserva.setNroHabitacion(rs.getInt("nroHabitacion"));
                reserva.setFechaReserva(rs.getDate("fechaReserva"));
                reserva.setFechaIngreso(rs.getDate("fechaIngreso"));
                reserva.setFechaSalida(rs.getDate("fechaSalida"));
                reserva.setCostoHabitacion(rs.getInt("costoHabitacion"));      
            }
            
            rs.close();
            stmt.close();
            conx.close();
            
        } catch (SQLException e) {
            System.out.println("Error al listar la reserva: " + e.getMessage());
        }return reserva;        
    }
    
    //Listar todas las reservas
    public ArrayList<Reserva> buscarTodaReserva() {
        ArrayList<Reserva> listaReservas = new ArrayList<>();
        
        try {
            Conexion con = new Conexion();
            Connection conx = con.conexion();
            
            String query = "Select * from reserva order by idReserva ";
            PreparedStatement stmt = conx.prepareCall(query);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Reserva reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setTipoHabitacion(rs.getString("tipoHabitacion"));
                reserva.setNroHabitacion(rs.getInt("nroHabitacion"));
                reserva.setFechaReserva(rs.getDate("fechaReserva"));
                reserva.setFechaIngreso(rs.getDate("fechaIngreso"));
                reserva.setFechaSalida(rs.getDate("fechaSalida"));
                reserva.setCostoHabitacion(rs.getInt("costoAlojamiento")); 
                
                
                listaReservas.add(reserva);
            }
            
            rs.close();
            stmt.close();
            conx.close();
            
        } catch (SQLException e) {
            System.out.println("Error al listar las reservas: " + e.getMessage());
        }return listaReservas;        
    }

    //Listar todos los clientes
    public ArrayList<Cliente> buscarTodoCliente() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        
        try {
            Conexion con = new Conexion();
            Connection conx = con.conexion();
            
            String query = "Select * from cliente where nombre = ?";
            PreparedStatement stmt = conx.prepareCall(query);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setaPaterno(rs.getString("aPaterno"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setEmail(rs.getString("email")); 
                
                listaClientes.add(cliente);
            }
            
            rs.close();
            stmt.close();
            conx.close();
            
        } catch (SQLException e) {
            System.out.println("Error al listar los clientes: " + e.getMessage());
        }return listaClientes;        
    }
    
  
    //Actualizar Reserva
    
      public boolean actualizarReserva(Reserva reserva)
    {
       
        try {
            Conexion con = new Conexion();
            Connection cnx = con.conexion();
            
            String query = "update reserva set idReserva=?,tipoHabitacion=?,nroHabitacion=?,fechaReserva=?,fechaIngreso=?,fechaSalida=?,costoHabitacion=?";

            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, reserva.getIdReserva());
            stmt.setString(2,reserva.getTipoHabitacion());
            stmt.setInt(3, reserva.getNroHabitacion());
            stmt.setDate(4, new java.sql.Date(reserva.getFechaReserva().getTime()));
            stmt.setDate(5, new java.sql.Date(reserva.getFechaIngreso().getTime()));
            stmt.setDate(6, new java.sql.Date(reserva.getFechaSalida().getTime()));
            stmt.setInt(7, reserva.getCostoHabitacion());
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error SQL al actualizar Reserva " + e.getMessage());
            return false;
        }
    }
    
    
    
      //Eliminar Reserva
      
    public boolean eliminarReserva(int idReserva)
    {
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.conexion();
            
            String query = "delete from reserva where idreserva= ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1,idReserva);
            
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar Reserva " + e.getMessage());
            return false;
        }
    }
    public boolean eliminarCliente(int idCliente)
    {
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.conexion();
            
            String query = "delete from cliente where idCliente= ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1,idCliente);
            
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar Cliente " + e.getMessage());
            return false;
        }
    }
    
    
    
   
    
   
}
    


    

