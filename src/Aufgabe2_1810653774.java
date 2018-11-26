import javax.swing.*;

public class Aufgabe2_1810653774 {
    public static void main(String[] args) {

        int Zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Gebe eine Zahl ein"));
        int Zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine weiter Zahl ein"));
        /* Einlesen eines Strings mit JOptionPane.showInputDialog und eine Umwandlung in ein Integer Datentyp durch Integer.parseInt*/

        int i = 0; /*Zählervariable der while-Schleife*/
        while (true) /* Anfang der EndlossSchleife, true ist meine Bedingung die nie false werden kann */ {
            i++; /*erhöht i nach jedem durchlauf um 1*/
            if (Zahl1 == Zahl2) {


                System.out.println("Die Zahl lautet: " + Zahl1 + " . \nDu hast " + i + "Versuche gebraucht.");
                break;
                /*Wenn  Zahl1 und Zahl2 gleich sind wird die Schleife abgebrochen mit break*/

            } else if (Zahl1 > Zahl2) {
                Zahl2++;
                /*wenn die Zahl1 größer ist wird die Zahl 2 bei jedem Durchlauf der Schleife um 1 erhöht*/
                /* bis die Zahl1 und Zahl2 gleich == groß sin */

            } else if (Zahl2 > Zahl1) {
                Zahl1++;
                /*Selbe Verfahren wir oben nur mit der Zahl 1*/
            }
        }
    }
}

