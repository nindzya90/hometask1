package events;

import javax.swing.*;
import java.awt.*;
import java.awt.desktop.QuitEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventExample  {

    static public class MyWindow extends JFrame{
        public MyWindow(){
            setBounds(500,500,400,300);
            setTitle("Demo");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JPanel pan = new JPanel();
            add(pan);
            pan.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(MouseEvent e) {
                    System.out.println("MousePos: " + e.getX() + " " + e.getY());
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    System.out.println("Exited!");
                }
            });

            setVisible(true);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyWindow();
            }
        });
    }
}
