package com.java21days;

import javax.swing.*;
import java.awt.*;

public class JList extends JFrame {
    Dimension dim = new Dimension(220, 300);

    JList(String title, String[] options, String message){
        super(title);
        setSize(dim);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        JScrollPane scrollPane = addOptionsList(panel, options);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    JScrollPane addOptionsList(JPanel panel, String[] options){
        JScrollPane scrollPane = new JScrollPane();
        System.out.println("Creating options list");
        return scrollPane;
    }
}
