import javax.swing.JOptionPane;

public class Oppgave2 {
    public static void main(String[] args) {
        String fornavn;
        fornavn = JOptionPane.showInputDialog("Hva er fornavnet ditt?");

        String etternavn;
        etternavn = JOptionPane.showInputDialog("Hva er etternavnet ditt?");

        String alder;
        alder = JOptionPane.showInputDialog("Hvor gammel er du?");

        String utskrift;
        utskrift = "Alderen til " + fornavn + " " + etternavn + " er " + alder + " år.";

        JOptionPane.showMessageDialog(null, utskrift,
                "Resultat", JOptionPane.PLAIN_MESSAGE);
    }
}