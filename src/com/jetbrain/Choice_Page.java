package com.jetbrain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Choice_Page {
    public JPanel CPanel;
    private JButton encryptButton;
    private JButton decryptButton;

    public Choice_Page() {
        encryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Encryption_Page EPObject = new Encryption_Page();
                CPanel.setVisible(false);
                Main.EncDecChoice.setContentPane(EPObject.EPanel);
            }
        });

        decryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Decryption_Page DPObject = new Decryption_Page();
                CPanel.setVisible(false);
                Main.EncDecChoice.setContentPane(DPObject.DePanel);
            }
        });
    }
}
