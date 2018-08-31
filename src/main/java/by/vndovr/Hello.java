package by.vndovr;

import javax.swing.*; 

import java.awt.*; 

import java.awt.event.*; 


public class Hello extends JFrame {

   Hello(String title) { 
        this.setSize(500,500); 
        setTitle(title); 
    }

    public static void main(String[] args) {
       Hello window = new Hello("Hello CodeCall");
       window.setVisible(true);
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}