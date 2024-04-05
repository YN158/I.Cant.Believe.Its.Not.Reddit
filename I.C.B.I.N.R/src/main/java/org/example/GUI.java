package org.example;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.WindowEvent;

public class GUI
{
    JFrame frame;
    JButton button;
    JButton button2;

    public GUI(String name)
    {
        frame = new JFrame(name);

        button = new JButton();
        button.setBounds(200,100, 100, 50);

        button2 = new JButton();
        button2.setBounds(200,400, 100, 50);
        button2.setVisible(false);


        button.addActionListener(e -> {button2.setVisible(true); button.setVisible(false);});
        button2.addActionListener(e -> {frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING)); System.out.println("poo");});

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.add(button, button2);
    }
}
