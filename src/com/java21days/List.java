package com.java21days;

import javax.swing.*;
import java.awt.*;

public class List extends JFrame {
    Dimension dim = new Dimension(220, 300);

    List(String title, String[] options, String message){
        super(title);
        setSize(dim);
        setLocationRelativeTo(null);
        JLabel listLabel = new JLabel(message);
        JPanel panel = new JPanel();
        panel.add(listLabel);
        JScrollPane scrollPane = addOptionsList(options);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);
    }

    JScrollPane addOptionsList(String[] options){
        JScrollPane scrollPane = new JScrollPane();
        JList<String> optionsList = new JList<String>(options);

        return scrollPane;
    }
}
