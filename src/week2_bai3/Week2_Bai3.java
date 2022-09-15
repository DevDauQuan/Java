/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2_bai3;

import java.awt.EventQueue;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class Week2_Bai3 {

    private static final Logger LOG = Logger.getLogger(Week2_Bai3.class.getName());
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                FormMain form = new FormMain();
                form.setVisible(true);
            } catch (Exception e) {
            }
        });
    }
    
}
