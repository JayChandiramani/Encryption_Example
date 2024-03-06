package com.jetbrain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Encryption_Page {
    public JPanel EPanel;
    public JTextField EMessageField;
    public JTextField EKeyField;
    private JButton doneButton;
    private JButton cancelButton;
    String Text, EText;
    int Key;

    public Encryption_Page() {
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Choice_Page CPObject = new Choice_Page();
                EPanel.setVisible(false);

                Main.EncDecChoice.setContentPane(CPObject.CPanel);
            }
        });

        doneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EText="";

                if (EKeyField.getText().equals(""))
                    JOptionPane.showMessageDialog(null,"Please enter a valid key.","Invalid Input",JOptionPane.WARNING_MESSAGE);
                else{
                    if (EMessageField.getText().equals(""))
                        JOptionPane.showMessageDialog(null,"Please enter a valid message.","Invalid Input",JOptionPane.WARNING_MESSAGE);
                    else{
                        Key = Integer.parseInt(EKeyField.getText());
                        Text = EMessageField.getText();

                        char[] chars = Text.toCharArray();

                        for (char c : chars) {
                            c += Key;
                            EText = EText+c;
                        }

                        Result_Page RPObject = new Result_Page();
                        EPanel.setVisible(false);
                        Main.EncDecChoice.setContentPane(RPObject.RPanel);
                        RPObject.KeyUsedField.setText(EKeyField.getText());
                        RPObject.EnteredMessageField.setText(EMessageField.getText());
                        RPObject.ResultMessageField.setText(EText);
                    }
                }
            }
        });
    }
}
