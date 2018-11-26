import javax.swing.*;

public class Aufgabe3_1810653774 {
    public static void main(String[] args) {

        String eingabe = JOptionPane.showInputDialog("Eingabe");
        /*Merke: STring nicht unter double sonst fehler meldung*/

        double alter; /*double= primitiver Datentyp, hat keine Funktionen und wird nicht instanziiert. */


                ;
        alter = Double.parseDouble(eingabe); /*String zu Zahl double umwandeln */
        /*Double = Wrapper für double.. eine eigene Klasse, von der man Objekte bauen kann und die Funktionen hat*/

        JOptionPane.showMessageDialog(null, alter);
        // Fließkommazahlen

        int a = Integer.parseInt(eingabe);
        JOptionPane.showMessageDialog(null, a);
        // nur Ganzzahlen

        boolean b = Boolean.parseBoolean(eingabe);
        JOptionPane.showMessageDialog(null, b);
        // true=true; alles andere ist falsch bzw false

        long c = Long.parseLong(eingabe);
        JOptionPane.showMessageDialog(null, c);
        // nur Ganzzahlen

        char d = eingabe.charAt(0);
        JOptionPane.showMessageDialog(null, d);
        // einzelne Zeichen, falls zeichenkette eingegeben wird, wird nur das erste zeichen gespeichert

        byte e= Byte.parseByte(eingabe);
        JOptionPane.showMessageDialog(null, e);
        // ganze Zahlen

        short f = Short.parseShort(eingabe);
        JOptionPane.showMessageDialog(null, f);
        // ganze Zahlen

        float g = Float.parseFloat(eingabe);
        JOptionPane.showMessageDialog(null, g);
        // Fließkommazahlen

        /* Bei Eingabe von Zeichen funktioniert das Programm nicht, da Zahlen nicht umgewandelt werden können */

        String Ende = String.valueOf(alter);
        JOptionPane.showMessageDialog(null, alter);


    }
}
