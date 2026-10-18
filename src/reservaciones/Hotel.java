/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoteleria;

public class Hotel {

    private int idHotel;
    private String nombre;

    public Hotel() {
    }

    public Hotel(String nombre) {
        this.nombre = nombre;
    }

    public int getIdHotel() { 
        return idHotel; 
    }
    
    public void setIdHotel(int idHotel) { 
        this.idHotel = idHotel; 
    }

    public String getNombre() { 
        return nombre; 
    }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
}
