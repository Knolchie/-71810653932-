package com.company;

import javax.swing.*;
import java.io.IOException;

public class division {
    public static void main(String[] args) {

        // (1) Checked Exception

        // --> erben von Exception mit Ausnahme von RuntimeException

        // --> müssen mit throws oder try-catch Block behandelt werden


        // (2) Unchecked Exception

        // --> sind Exceptions, die ohne Ankündigung geworfen werden können.

        // --> z.B.: ArrayIndexOutOfBoundsException

        try {

            saveFile("juhu");

        } catch (Exception e) {

            e.printStackTrace();

        }


        //(2) unchecked Exception

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int i = -1; i < array.length; i++) {

            //schmeißt beim ersten Durchlauf eine ArrayIndexOutOfBoundsException

            System.out.println(array[i]);

        }


    }

    private static void saveFile(String juhu) throws Exception {

    }
}







