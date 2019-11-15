package ui;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculatorUI {
    private static JTextField inputLine;

    public static void main(String[] args) {
        JFrame window = new JFrame("Calculator");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(600, 700);
        window.setLocationRelativeTo(null);
        window.setLayout(new FlowLayout());

        JPanel resultPanel = buildResultPanel();
//        resultPanel.setPreferredSize(new Dimension(600, 100));
//        resultPanel.setBackground(Color.BLUE);

        JPanel keyboardPanel = buildKeyboardPanel();
//        keyboardPanel.setPreferredSize(new Dimension(600, 550));
//        keyboardPanel.setBackground(Color.red);


        window.add(resultPanel);
        window.add(keyboardPanel);
        window.setVisible(true);
    }

    private static JPanel buildResultPanel() {
        JPanel resultPanel = new JPanel();
        resultPanel.setPreferredSize(new Dimension(600, 50));

        inputLine = new JTextField();
        inputLine.setPreferredSize(new Dimension(440, 40));

        JButton result = new JButton("=");
        result.setPreferredSize(new Dimension(45, 45));
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine jsEngine = manager.getEngineByName("JavaScript");
        ActionListener resultListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = inputLine.getText();
                try {
                    Object result = jsEngine.eval(value);
                    if(result instanceof Double) {
                        inputLine.setText(Double.toString((Double)result));
                    }
                    if(result instanceof Integer) {
                        inputLine.setText(Integer.toString((Integer)result));
                    }
                } catch (ScriptException e1) {
                    System.out.println("wrong input");
                }
            }
        };
        result.addActionListener(resultListener);

        JButton clear = new JButton("C");
        clear.setPreferredSize(new Dimension(45, 45));
        ActionListener clearListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputLine.setText("");
            }
        };
        clear.addActionListener(clearListener);

        resultPanel.add(inputLine);
        resultPanel.add(result);
        resultPanel.add(clear);
        return resultPanel;
    }

    private static JPanel buildKeyboardPanel() {
        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setPreferredSize(new Dimension(600, 600));
        keyboardPanel.setLayout(new GridLayout(4, 4));
        String[][] buttons =
                {
                        {"7", "8", "9", "+"},
                        {"4", "5", "6", "-"},
                        {"1", "2", "3", "*"},
                        {"(", ")", "0", "/"}
                };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JButton button = new JButton(buttons[i][j]);
                button.setPreferredSize(new Dimension(50, 50));
                button.setFont(new Font("Font", Font.BOLD, 30));
                ActionListener buttonListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        inputLine.setText(inputLine.getText() + button.getText());
                    }
                };
                button.addActionListener(buttonListener);
                keyboardPanel.add(button);
            }
        }
        return keyboardPanel;
    }
}
