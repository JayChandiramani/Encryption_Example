package com.jetbrain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Result_Page {
    public JPanel RPanel;
    public JTextField KeyUsedField;
    public JTextField EnteredMessageField;
    public JTextField ResultMessageField;
    private JButton mainMenuButton;

    public Result_Page() {
        mainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Choice_Page CPObject = new Choice_Page();
                RPanel.setVisible(false);
                Main.EncDecChoice.setContentPane(CPObject.CPanel);
            }
        });
    }
}
