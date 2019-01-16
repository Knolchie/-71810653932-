package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        while(true) {

            try {

                String eingabe = JOptionPane.showInputDialog("Eingabe: ");



                if(eingabe.matches("[0-9]+")){ //regex + 2stellige zahlen

                    throw new Exception();

                }else{

                    System.out.println(eingabe + " = ist gültig!");

                }

            }catch (Exception h){

                System.out.println("Zahl wurde eingegeben, Programm wird beendet");

                break;

            }

        }


    }
}
