/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoteleria;

public class Habitaciones {
    private int idHabitacion;
    private int idHotel;                    // FK a Hoteles
    private int idEstadosHabitaciones;      // FK a EstadoHabitaciones
    private String nombre;
    private int capacidad;
    private int numeroHuespedes;
    private double precioNoche;

    public Habitaciones() {}

    public Habitaciones(int idHotel, int idEstadosHabitaciones, String nombre, int capacidad, int numeroHuespedes, double precioNoche) {
        this.idHotel = idHotel;
        this.idEstadosHabitaciones = idEstadosHabitaciones;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.numeroHuespedes = numeroHuespedes;
        this.precioNoche = precioNoche;
    }

    public int getIdHabitacion() { return idHabitacion; }
    public void setIdHabitacion(int idHabitacion) { this.idHabitacion = idHabitacion; }
    public int getIdHotel() { return idHotel; }
    public void setIdHotel(int idHotel) { this.idHotel = idHotel; }
    public int getIdEstadosHabitaciones() { return idEstadosHabitaciones; }
    public void setIdEstadosHabitaciones(int idEstadosHabitaciones) { this.idEstadosHabitaciones = idEstadosHabitaciones; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
    public int getNumeroHuespedes() { return numeroHuespedes; }
    public void setNumeroHuespedes(int numeroHuespedes) { this.numeroHuespedes = numeroHuespedes; }
    public double getPrecioNoche() { return precioNoche; }
    public void setPrecioNoche(double precioNoche) { this.precioNoche = precioNoche; }
}