/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcombo.temp.converter;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Alex
 */
public class StartConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          try {
            // Set System L&F
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, JOptionPane.ERROR_MESSAGE);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new JComboBoxTempConverter().setVisible(true);
        });
    }
    
}
