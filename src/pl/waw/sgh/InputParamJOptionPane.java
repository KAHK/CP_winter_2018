package pl.waw.sgh;

import javax.swing.*;

public class InputParamJOptionPane {
    public static void main(String[] args) {
        String name = JOptionPane.
                showInputDialog(null,
                        "What's your name?");
        JOptionPane.showMessageDialog(null, "Hello " + name + "!");
        String ageStr = JOptionPane.
                showInputDialog(null,
                        "How old are you?");
        Integer age = Integer.parseInt(ageStr);
        JOptionPane.showMessageDialog(null, "You are: " + (age - 10));
        JOptionPane.showConfirmDialog(null, "Are you sure?");
        JOptionPane.showMessageDialog(null, "You're " + ageStr + ". You're old.");
    }
}
