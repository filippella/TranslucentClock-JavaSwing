/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translucentclock;

import java.awt.Color;
import javax.swing.JFrame;
import translucentclock.view.ClockView;

/**
 *
 * @author Filippo-TheAppExpert
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame clockFrame = new JFrame();
        clockFrame.setUndecorated(true);
        clockFrame.add(new ClockView());
        clockFrame.pack();
        clockFrame.setBackground(new Color(0, 255, 0, 0));
        clockFrame.setLocationRelativeTo(null);
        clockFrame.setVisible(true);
    }
}
