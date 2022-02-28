package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Hi! what is your name");
        JOptionPane.showMessageDialog(null ,"There's a one thing I want to say you" + "\t"+name);
        JOptionPane.showMessageDialog(null ,"I Love you ! " +name);


    }
}
