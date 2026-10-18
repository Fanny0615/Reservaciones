/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoteleria;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conecta {

    private Connection con = null;

    public Conecta() {
        conectar();
    }

    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_hotel", "root", "");        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error al cargar el driver: " + cnfe.getMessage());
        } catch (SQLException sqle) {
            System.out.println("Error de conexión SQL: " + sqle.getMessage());
        }
    }

    public void desconectar() {
        try {
            if (con != null) {
                con.close();
            }
            con = null;
            System.out.println("Desconectado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConexion() {
        return con;
    }

    // Método para insertar un Huésped cuidando la Integridad Referencial
    public void altaHuesped(Huesped obj) {
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Error: No hay conexión activa.");
            return;
        }

        String sql = "INSERT INTO Huespedes (Nombre, ApellidoPaterno, ApellidoMaterno, FechaNacimiento) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getApellidoPaterno());
            ps.setString(3, obj.getApellidoMaterno());
            ps.setDate(4, obj.getFechaNacimiento());

            int filasAfectadas = ps.executeUpdate();

            System.out.println("Registros insertados: " + filasAfectadas);
            JOptionPane.showMessageDialog(null, "Huésped guardado correctamente.");

        } catch (SQLException sqle) {
            System.out.println("Error al insertar huésped: " + sqle.getMessage());
            JOptionPane.showMessageDialog(null, "Error de Integridad Referencial o BD: " + sqle.getMessage());
        }
    }

    public void altaHabitacion(Habitaciones obj) {
        if (con == null) { JOptionPane.showMessageDialog(null, "Error: No hay conexión activa."); return; }
        String sql = "INSERT INTO Habitaciones (idHotel, idEstadosHabitaciones, Nombre, Capacidad, NumeroHuespedes, PrecioNoche) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, obj.getIdHotel());
            ps.setInt(2, obj.getIdEstadosHabitaciones());
            ps.setString(3, obj.getNombre());
            ps.setInt(4, obj.getCapacidad());
            ps.setInt(5, obj.getNumeroHuespedes());
            ps.setDouble(6, obj.getPrecioNoche());
            int filasAfectadas = ps.executeUpdate();
            System.out.println("Registros insertados: " + filasAfectadas);
            JOptionPane.showMessageDialog(null, "Habitación guardada correctamente.");
        } catch (SQLException sqle) {
            System.out.println("Error al insertar habitación: " + sqle.getMessage());
            JOptionPane.showMessageDialog(null, "Error de Integridad Referencial o BD: " + sqle.getMessage());
        }
    }
     public void altaContactoHuesped(ContactosHuesped obj) {
        if (con == null) { JOptionPane.showMessageDialog(null, "Error: No hay conexión activa."); return; }
        String sql = "INSERT INTO ContactosHuesped (idHuesped, idTipoContacto, Valor) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, obj.getIdHuesped());
            ps.setInt(2, obj.getIdTipoContacto());
            ps.setString(3, obj.getValor());
            int filasAfectadas = ps.executeUpdate();
            System.out.println("Registros insertados: " + filasAfectadas);
            JOptionPane.showMessageDialog(null, "Contacto de huésped guardado correctamente.");
        } catch (SQLException sqle) {
            System.out.println("Error al insertar contacto de huésped: " + sqle.getMessage());
            JOptionPane.showMessageDialog(null, "Error de Integridad Referencial o BD: " + sqle.getMessage());
        }
    }
     public void altaDomicilioHuesped(DomiciliosHuesped obj) {
        if (con == null) { JOptionPane.showMessageDialog(null, "Error: No hay conexión activa."); return; }
        String sql = "INSERT INTO DomiciliosHuesped (idHuesped, Calle, NumInt, NumExt, Colonia, CodigoPostal) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, obj.getIdHuesped());
            ps.setString(2, obj.getCalle());
            ps.setString(3, obj.getNumInt());
            ps.setString(4, obj.getNumExt());
            ps.setString(5, obj.getColonia());
            ps.setString(6, obj.getCodigoPostal());
            int filasAfectadas = ps.executeUpdate();
            System.out.println("Registros insertados: " + filasAfectadas);
            JOptionPane.showMessageDialog(null, "Domicilio guardado correctamente.");
        } catch (SQLException sqle) {
            System.out.println("Error al insertar domicilio: " + sqle.getMessage());
            JOptionPane.showMessageDialog(null, "Error de Integridad Referencial o BD: " + sqle.getMessage());
        }
         //INSERCIÓN EN TABLA HOTELES
    public void altaHotel(Hotel obj) {
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Error: No hay conexión activa.");
            return;
        }

        String sql = "INSERT INTO Hoteles (Nombre) VALUES (?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, obj.getNombre());

            int filas = ps.executeUpdate();
            System.out.println("Registros insertados en Hoteles: " + filas);
            JOptionPane.showMessageDialog(null, "Hotel guardado correctamente.");

        } catch (SQLException sqle) {
            System.out.println("Error al insertar hotel: " + sqle.getMessage());
            JOptionPane.showMessageDialog(null, "Error de BD al guardar hotel: " + sqle.getMessage());
        }
    }

    //INSERCIÓN EN TABLA DIRECCIONESHOTEL
    public void altaDireccionHotel(DireccionHotel obj) {
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Error: No hay conexión activa.");
            return;
        }

        String sql = "INSERT INTO DireccionesHotel (idHotel, Calle, NumExt, Colonia, Municipio, Estado, CodigoPostal) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, obj.getIdHotel());
            ps.setString(2, obj.getCalle());
            ps.setString(3, obj.getNumExt());
            ps.setString(4, obj.getColonia());
            ps.setString(5, obj.getMunicipio());
            ps.setString(6, obj.getEstado());
            ps.setString(7, obj.getCodigoPostal());

            int filas = ps.executeUpdate();
            System.out.println("Registros insertados en DireccionesHotel: " + filas);
            JOptionPane.showMessageDialog(null, "Dirección del hotel guardada correctamente.");

        } catch (SQLException sqle) {
            System.out.println("Error al insertar dirección de hotel: " + sqle.getMessage());
            JOptionPane.showMessageDialog(null, "Error de Integridad Referencial: El idHotel no existe.\n" + sqle.getMessage());
        }
    }
    
    //INSERCION EN TABLA CONTACTO HOTEL
    public void altaContactoHotel(ContactoHotel obj) {
    if (con == null) {
        JOptionPane.showMessageDialog(null, "Error: No hay conexión activa.");
        return;
    }

    String sql = "INSERT INTO ContactosHotel (idHotel, idTipoContacto, Valor) VALUES (?, ?, ?)";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, obj.getIdHotel());
        ps.setInt(2, obj.getIdTipoContacto());
        ps.setString(3, obj.getValor());

        int filas = ps.executeUpdate();
        System.out.println("Registros insertados en ContactosHotel: " + filas);
        JOptionPane.showMessageDialog(null, "Contacto del hotel guardado correctamente.");

    } catch (SQLException sqle) {
        System.out.println("Error al insertar contacto de hotel: " + sqle.getMessage());
        JOptionPane.showMessageDialog(null, "Error de Integridad Referencial: El idHotel o idTipoContacto no existen.\n" + sqle.getMessage());
    }
    }

}
