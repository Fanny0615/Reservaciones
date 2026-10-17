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
            // Cambien 'root' y '134340' por su usuario y contraseña de MySQL
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
}
