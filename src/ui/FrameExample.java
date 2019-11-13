package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameExample {
    public static void main(String[] args) {
        JFrame window = new JFrame("First window");
        window.setSize(new Dimension(600, 600));
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setLayout(new FlowLayout());

        JButton button = new JButton("Hello");
//        button.setSize(100, 100);
        button.setPreferredSize(new Dimension(100, 100));
//        button.setBounds(200, 200, 100, 100);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
                System.out.println(e.getWhen());
                System.out.println("Action performed");
            }
        };

//        button.addActionListener(actionListener);

        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked");
                System.out.println(e.getX());
                System.out.println(e.getY());
                System.out.println(e.getXOnScreen());
                System.out.println(e.getYOnScreen());
                System.out.println(e.getButton());
            }

            @Override
            public void mousePressed(MouseEvent e) {
//                System.out.println("Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
//                System.out.println("Release");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
//                System.out.println("Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
//                System.out.println("Exited");
            }
        };

        MouseListener adapterListener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        };
        button.addMouseListener(mouseListener);


        window.add(button);

        JLabel text = new JLabel("Hello, it's text");
        text.setPreferredSize(new Dimension(100, 60));
        window.add(text);

        JLabel text1 = new JLabel("Hello, it's text");
        text.setPreferredSize(new Dimension(100, 60));
        window.add(text1);

        KeyListener keyListener = new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
//                System.out.println("keyPressed");
//                System.out.println(e.getKeyChar());
//                System.out.println(e.getKeyCode());
//                System.out.println(e.getExtendedKeyCode());
                if(e.getKeyCode() == KeyEvent.VK_SPACE) {
                    System.out.println("Space pressed");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
        window.addKeyListener(keyListener);
        window.setFocusable(true);

        window.setVisible(true);
    }
}
