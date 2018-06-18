package org.paschal.sat;

import javax.swing.JFrame;
import org.paschal.sat.gui.ServerGUI;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ServerGUI mainWin = new ServerGUI();
        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.setVisible(true);
    }
}
