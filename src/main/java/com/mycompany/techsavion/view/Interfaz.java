package com.mycompany.techsavion.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Interfaz {
    public static void main(String[] args) {
        // Usar SwingUtilities para asegurar que la creación de la GUI se realice en el hilo de despacho de eventos
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //el marco principal
                JFrame frame = new JFrame("TechSavion");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Crear una etiqueta conel mensaje
                JLabel label = new JLabel("Interfaz TechSavion:", JLabel.CENTER);
                
                // la etiqueta al marco
                frame.add(label);

                //  el tamaño del marco
                frame.setSize(800, 950);
                
                // marco visible
                frame.setVisible(true);
            }
        });
    }
}
