package com.jetbrain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Decryption_Page {
    public JPanel DePanel;
    public JTextField DeKeyField;
    public JTextField DeMessageField;
    private JButton doneButton;
    private JButton cancelButton;
    String Text, DeText;
    int Key;

    public Decryption_Page() {
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Choice_Page CPObject = new Choice_Page();
                DePanel.setVisible(false);
                Main.EncDecChoice.setContentPane(CPObject.CPanel);
            }
        });

        doneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeText="";

                if (DeKeyField.getText().equals(""))
                    JOptionPane.showMessageDialog(null,"Please enter a valid key.","Invalid Input",JOptionPane.WARNING_MESSAGE);
                else{
                    if (DeMessageField.getText().equals(""))
                        JOptionPane.showMessageDialog(null,"Please enter a valid message.","Invalid Input",JOptionPane.WARNING_MESSAGE);
                    else{
                        Key = Integer.parseInt(DeKeyField.getText());
                        Text = DeMessageField.getText();

                        char[] chars = Text.toCharArray();

                        for (char c : chars) {
                            c -= Key;
                            DeText = DeText+c;
                        }

                        Result_Page RPObject = new Result_Page();
                        DePanel.setVisible(false);
                        Main.EncDecChoice.setContentPane(RPObject.RPanel);
                        RPObject.KeyUsedField.setText(DeKeyField.getText());
                        RPObject.EnteredMessageField.setText(DeMessageField.getText());
                        RPObject.ResultMessageField.setText(DeText);
                    }
                }
            }
        });
    }
}
