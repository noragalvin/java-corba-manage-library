/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlythuvien;

import javax.swing.JOptionPane;

/**
 *
 * @author aboyb
 */
public class Helpers {
    public static void MessageBox(String title, String message, String type) {
        int message_type;
        switch(type) {
            case "success":
                message_type = JOptionPane.INFORMATION_MESSAGE;
                break;
            case "error":
                message_type = JOptionPane.ERROR_MESSAGE;
                break;
            default:
                message_type = JOptionPane.INFORMATION_MESSAGE;
                
        }
        JOptionPane.showMessageDialog(null, message, title, message_type);
    }
}
