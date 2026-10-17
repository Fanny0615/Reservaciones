/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hoteleria;

/**
 *
 * @author Administrador
 */

import javax.swing.SwingUtilities;

public class Hoteleria {

    public static void main(String[] args) {
        // Ejecución visual de la ventana de inserciones
        SwingUtilities.invokeLater(() -> new ModuloInserciones().setVisible(true));
    }
}
