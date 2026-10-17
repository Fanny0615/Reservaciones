/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoteleria;


import java.awt.GridLayout;
import java.sql.Date;
import javax.swing.*;

public class ModuloInserciones extends JFrame {

    private final JTextField txtNombre = new JTextField();
    private final JTextField txtPaterno = new JTextField();
    private final JTextField txtMaterno = new JTextField();
    private final JTextField txtFecha = new JTextField();

    private final Conecta objConecta = new Conecta();

    public ModuloInserciones() {
        setTitle("Módulo de Inserciones - Sistema de Hotel");
        setSize(420, 280);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel formulario = new JPanel(new GridLayout(5, 2, 8, 8));
        formulario.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        formulario.add(new JLabel("Nombre:"));
        formulario.add(txtNombre);

        formulario.add(new JLabel("Apellido Paterno:"));
        formulario.add(txtPaterno);

        formulario.add(new JLabel("Apellido Materno:"));
        formulario.add(txtMaterno);

        formulario.add(new JLabel("Fecha Nacimiento (AAAA-MM-DD):"));
        formulario.add(txtFecha);

        JButton btnGuardar = new JButton("Guardar Huésped");
        JButton btnLimpiar = new JButton("Limpiar");

        formulario.add(btnGuardar);
        formulario.add(btnLimpiar);

        add(formulario);

        btnGuardar.addActionListener(e -> guardarHuesped());
        btnLimpiar.addActionListener(e -> limpiarCampos());
    }

    private void guardarHuesped() {
        String nombre = txtNombre.getText().trim();
        String paterno = txtPaterno.getText().trim();
        String materno = txtMaterno.getText().trim();
        String fechaTexto = txtFecha.getText().trim();

        if (nombre.isEmpty() || paterno.isEmpty() || fechaTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nombre, Apellido Paterno y Fecha son obligatorios.");
            return;
        }

        try {
            Date fechaNacimiento = Date.valueOf(fechaTexto);

            // Se crea el objeto y se manda al método altaHuesped de Conecta.java
            Huesped huesped = new Huesped(nombre, paterno, materno, fechaNacimiento);
            objConecta.altaHuesped(huesped);

            limpiarCampos();

        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Formato de fecha inválido. Usa AAAA-MM-DD");
        }
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtFecha.setText("");
        txtNombre.requestFocus();
    }
}
