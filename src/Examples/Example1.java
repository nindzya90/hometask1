package Examples;

import javax.swing.*;
import java.awt.*;

public class Example1 {

    static class MyWindow extends JFrame {
        public MyWindow(){
            setTitle("test Window");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(400,300,400,400);
            setVisible(true);
            JButton[]jbs = new JButton[5];
            for (int i = 0; i < 5; i++) {
                jbs[i] = new JButton("#" + i);
            }
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setSize(400,400);
            setLocationRelativeTo(null);

            JButton button = new JButton("Button 1 (PAGE START)");
            add(button,BorderLayout.NORTH);

            button = new JButton("Button 2 (CENTER)");
            button.setPreferredSize(new Dimension(200,100));
            add(button,BorderLayout.CENTER);

            button = new JButton("Button3 (LINE_START)");
            add(button,BorderLayout.LINE_START);

            button = new JButton("Long-Named Button 4 (PAGE_END)");
            add(button,BorderLayout.PAGE_END);

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
