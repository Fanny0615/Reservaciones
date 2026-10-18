/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoteleria;

/**
 *
 * @author Administrador
 */

public class ContactoHotel {

    private int idContactoHotel;
    private int idHotel;
    private int idTipoContacto;
    private String valor;

    public ContactoHotel() {
    }

    public ContactoHotel(int idHotel, int idTipoContacto, String valor) {
        this.idHotel = idHotel;
        this.idTipoContacto = idTipoContacto;
        this.valor = valor;
    }

    public int getIdContactoHotel() { 
        return idContactoHotel; 
    }
    
    public void setIdContactoHotel(int idContactoHotel) { 
        this.idContactoHotel = idContactoHotel; 
    }

    public int getIdHotel() { 
        return idHotel; 
    }
    
    public void setIdHotel(int idHotel) { 
        this.idHotel = idHotel; 
    }

    public int getIdTipoContacto() { 
        return idTipoContacto; 
    }
    
    public void setIdTipoContacto(int idTipoContacto) { 
        this.idTipoContacto = idTipoContacto; 
    }

    public String getValor() { 
        return valor; 
    }
    
    public void setValor(String valor) { 
        this.valor = valor; 
    }
}
