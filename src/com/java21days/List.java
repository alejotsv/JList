package com.java21days;

import javax.swing.*;
import java.awt.*;

public class List extends JFrame {
    Dimension dim = new Dimension(180, 250);

    List(String title, String[] options, String message){
        super(title);
        setSize(dim);
        setLookAndFeel();
        setLocationRelativeTo(null);
        JLabel listLabel = new JLabel(message);
        JPanel panel = new JPanel();
        panel.add(listLabel);
        JScrollPane scrollPane = addOptionsList(options);
        panel.add(scrollPane);
        JButton save = new JButton("Save");
        JButton cancel = new JButton("Cancel");
        panel.add(save);
        panel.add(cancel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);
    }

    JScrollPane addOptionsList(String[] options){
        JList<String> optionsList = new JList<String>(options);
        JScrollPane scrollPane = new JScrollPane(optionsList,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
                );
        return scrollPane;
    }

    void setLookAndFeel(){
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    System.out.println(info.getClassName());
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
