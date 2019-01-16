import javax.swing.*;

public class aufg4 {
    public static void main(String[] args) {

        try {

            test();

        } catch (NoNumberException e) {

            e.printStackTrace();

        }

    }





    private static void test() throws NoNumberException {

        String eingabe = JOptionPane.showInputDialog("Bitte Zahl eingeben");



        if(eingabe.matches("[0-9]+")){

            throw new NoNumberException();

        }

    }



}

