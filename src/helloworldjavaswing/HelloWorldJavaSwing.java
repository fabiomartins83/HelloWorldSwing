/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldjavaswing;

/**
 *
 * @author Fábio de Almeida Martins
 */

import java.util.prefs.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;        

public class HelloWorldJavaSwing {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Make sure we have a nice window decoration
        JFrame.setDefaultLookAndFeelDecorated(true);
                
        //Create and set up the window.
        JFrame frame = new JFrame("Hello World! Java Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello, World!" label.
        JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
        frame.getContentPane().add(label, BorderLayout.NORTH);

        //Display the window.
        frame.pack();
        frame.setSize(300,100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
