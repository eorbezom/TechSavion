package com.mycompany.techsavion.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Interfaz {
    public static void main(String[] args) {
        // Usar SwingUtilities para asegurar que la creación de la GUI se realice en el hilo de despacho de eventos
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Crear el marco principal
                JFrame frame = new JFrame("TechSavion");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Crear una etiqueta con el mensaje "Hola Mundo"
                JLabel label = new JLabel("Interfaz TechSavion:", JLabel.CENTER);
                
                // Agregar la etiqueta al marco
                frame.add(label);

                // Establecer el tamaño del marco
                frame.setSize(800, 950);
                
                // Hacer el marco visible
                frame.setVisible(true);
            }
        });
    }
}
