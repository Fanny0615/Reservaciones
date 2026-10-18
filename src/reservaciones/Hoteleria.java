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

        //INSERT INTO HOTEL 
        
        Hotel hotel1 = new Hotel("Hotel TinyTan");
        obj.altaHotel(hotel1);
        
        
        //INSERT INTO DIRECCION HOTEL
        DireccionHotel direccion1 = new DireccionHotel(
            1,                          // idHotel 
            "Av. 20 de Noviembre",      // Calle
            "123",                      // NumExt
            "Centro",                   // Colonia
            "Durango",                  // Municipio
            "Durango",                  // Estado
            "34000"                     // CodigoPostal
        );
        
        obj.altaDireccionHotel(direccion1);
        
        //INSERT INTO CONTACTO HOTEL
        ContactoHotel contacto1 = new ContactoHotel(
            1,                      // idHotel 
            1,                      // idTipoContacto 
            "618-123-4567"          //Telefono
        );
        obj.altaContactoHotel(contacto1);
        
        obj.desconectar();
        
    }
    
    }
}
