public class Aufgabe4_1810653774 {
    public static void main(String[] args) {

        for (int i=1;i<=10;i++) //Zählervarriable, Schrittweite, Anweisung
        {
            System.out.println("Der Schleifenzähler ist: " +i);
        }

        int j=1; // Zählervariable
        while (j<10) //Schrittweite
        {
            System.out.println("Der Schleifenzähler ist: " +j);
            j++; // Anweisung erhöhung um 1 nach durhclauf
        }
        int h = 1; // Zählervariable
        do
        {
            System.out.println("Der Schleifenzähler ist: " +h);
            h++; // Anweisung wie oben
        }
        while(h<=10); // SChrittweite
    }
    /*
    for und while = kopfgesteuerte Schleifen prüfen VOR der 1 ausführung

    do= fußgesteuerte Schleife, prüft nach 1 der Asuführung
     */
}
