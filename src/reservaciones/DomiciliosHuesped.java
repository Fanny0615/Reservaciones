/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoteleria;

public class DomiciliosHuesped {
    private int idHuespedDomicilio;
    private int idHuesped;          // FK a Huespedes
    private String calle;
    private String numInt;
    private String numExt;
    private String colonia;
    private String codigoPostal;

    public DomiciliosHuesped() {}

    public DomiciliosHuesped(int idHuesped, String calle, String numInt, String numExt, String colonia, String codigoPostal) {
        this.idHuesped = idHuesped;
        this.calle = calle;
        this.numInt = numInt;
        this.numExt = numExt;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
    }

    public int getIdHuespedDomicilio() { return idHuespedDomicilio; }
    public void setIdHuespedDomicilio(int idHuespedDomicilio) { this.idHuespedDomicilio = idHuespedDomicilio; }
    public int getIdHuesped() { return idHuesped; }
    public void setIdHuesped(int idHuesped) { this.idHuesped = idHuesped; }
    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }
    public String getNumInt() { return numInt; }
    public void setNumInt(String numInt) { this.numInt = numInt; }
    public String getNumExt() { return numExt; }
    public void setNumExt(String numExt) { this.numExt = numExt; }
    public String getColonia() { return colonia; }
    public void setColonia(String colonia) { this.colonia = colonia; }
    public String getCodigoPostal() { return codigoPostal; }
    public void setCodigoPostal(String codigoPostal) { this.codigoPostal = codigoPostal; }
}
