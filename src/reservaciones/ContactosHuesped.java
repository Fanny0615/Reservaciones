/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoteleria;
public class ContactosHuesped {
    private int idContactoHuesped;
    private int idHuesped;        // FK a Huespedes
    private int idTipoContacto;  // FK a TipoContacto
    private String valor;

    public ContactosHuesped() {}

    public ContactosHuesped(int idHuesped, int idTipoContacto, String valor) {
        this.idHuesped = idHuesped;
        this.idTipoContacto = idTipoContacto;
        this.valor = valor;
    }

    public int getIdContactoHuesped() { return idContactoHuesped; }
    public void setIdContactoHuesped(int idContactoHuesped) { this.idContactoHuesped = idContactoHuesped; }
    public int getIdHuesped() { return idHuesped; }
    public void setIdHuesped(int idHuesped) { this.idHuesped = idHuesped; }
    public int getIdTipoContacto() { return idTipoContacto; }
    public void setIdTipoContacto(int idTipoContacto) { this.idTipoContacto = idTipoContacto; }
    public String getValor() { return valor; }
    public void setValor(String valor) { this.valor = valor; }
}