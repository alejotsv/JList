package com.java21days;

import javax.swing.*;
import java.awt.*;

public class JList extends JFrame {
    Dimension dim = new Dimension(220, 300);

    JList(String title, String[] options, String message){
        super(title);
        setSize(dim);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
}
