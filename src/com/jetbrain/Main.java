package com.jetbrain;

import javax.swing.*;

public class Main {

    public static JFrame EncDecChoice;

    public static void main (String[] arg) {
        Choice_Page CPObject = new Choice_Page();

        EncDecChoice = new JFrame("Jay's Shitty Encryption/Decryption Program");
        EncDecChoice.setContentPane(CPObject.CPanel);
        EncDecChoice.setVisible(true);
        EncDecChoice.pack();
        EncDecChoice.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        EncDecChoice.setSize(400,200);
        EncDecChoice.setLocationRelativeTo(null);
    }
}
