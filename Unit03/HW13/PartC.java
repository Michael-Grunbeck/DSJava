//Michael Grunbeck 

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class PartC {
    /*
     * Change the following method to customize
     * what is drawn in the JFrame.
     */

    public static void draw(Graphics g) {
        
        final double MINTHETA=0;
        final double MAXTHETA=2*Math.PI;
        final double STEPS = 100000;
        final double SCALE = 150;
        double change = (MAXTHETA - MINTHETA) / STEPS;
        g.setColor(Color.PINK);
        g.fillRect(0, 0, 400, 400);
        for (double o = MINTHETA; o <= MAXTHETA; o += change) {
            double r = Math.cos(2 * o);
            double x = r * Math.cos(o) * SCALE;
            double y = r * Math.sin(o) * SCALE;

            int pixelX = (int) x + 200;
            int pixelY = (int) y + 200;

            g.setColor(Color.BLUE);
            g.drawLine(pixelX, pixelY, pixelX, pixelY);

        }

        

    }

    public static enum OS {
        WIN, MAC, LINUX, OTHER
    }

    public static OS checkOS() {
        OS val;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) {
            val = OS.WIN;
        } else if (name.indexOf("mac") >= 0) {
            val = OS.MAC;
        } else if (name.indexOf("nux") >= 0) {
            val = OS.LINUX;
        } else {
            val = OS.OTHER;
        }

        return val;
    }

    // Do not modify the code in the main method.
    // Your code will go into the draw method above.
    public static void main(String[] args) {
        // this is the desired dimensions of the content area
        // of our JFrame window.
        final int CONTENT_WIDTH = 400;
        final int CONTENT_HEIGHT = 400;

        // the values for border width and title bar height
        // depend on the operating system.
        int border_width = 0;
        int bar_height = 0;
        OS os = checkOS();
        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            case LINUX:
                // I don't know what the values are for Linux.
                break;
            case OTHER:
                break;
        }

        int frame_width = CONTENT_WIDTH + 2 * border_width;
        int frame_height = CONTENT_HEIGHT + bar_height + border_width;
        JFrame frame = new JFrame();
        frame.setSize(frame_width, frame_height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent component = new JComponent() {
            public void paintComponent(Graphics graph) {
                draw(graph);
            }
        };

        frame.add(component);
        frame.setVisible(true);

        System.out.println("Frame Size   : " + frame.getSize());
        System.out.println("Frame Insets : " + frame.getInsets());
        System.out.println("Content Size : " + frame.getContentPane().getSize());
    }

}
