/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoteleria;

/**
 *
 * @author Administrador
 */
public class DireccionHotel {

    private int idHotelDireccion;
    private int idHotel;
    private String calle;
    private String numExt;
    private String colonia;
    private String municipio;
    private String estado;
    private String codigoPostal;

    public DireccionHotel() {
    }

    public DireccionHotel(int idHotel, String calle, String numExt, String colonia, String municipio, String estado, String codigoPostal) {
        this.idHotel = idHotel;
        this.calle = calle;
        this.numExt = numExt;
        this.colonia = colonia;
        this.municipio = municipio;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
    }

    public int getIdHotelDireccion() { 
        return idHotelDireccion; 
    }
    
    public void setIdHotelDireccion(int idHotelDireccion) { 
        this.idHotelDireccion = idHotelDireccion; 
    }

    public int getIdHotel() { 
        return idHotel; 
    }
    
    public void setIdHotel(int idHotel) { 
        this.idHotel = idHotel; 
    }

    public String getCalle() { 
        return calle; 
    }
    
    public void setCalle(String calle) { 
        this.calle = calle; 
    }

    public String getNumExt() { 
        return numExt; 
    }
    
    public void setNumExt(String numExt) { 
        this.numExt = numExt; 
    }

    public String getColonia() { 
        return colonia; 
    }
    
    public void setColonia(String colonia) { 
        this.colonia = colonia; 
    }

    public String getMunicipio() { 
        return municipio; 
    }
    
    public void setMunicipio(String municipio) { 
        this.municipio = municipio; 
    }

    public String getEstado() { 
        return estado; 
    }
    
    public void setEstado(String estado) { 
        this.estado = estado; 
    }

    public String getCodigoPostal() { 
        return codigoPostal; 
    }
    
    public void setCodigoPostal(String codigoPostal) { 
        this.codigoPostal = codigoPostal; 
    }
}
