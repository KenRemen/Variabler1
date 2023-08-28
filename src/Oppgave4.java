import javax.swing.JOptionPane;

public class Oppgave4
{
    public static void main(String[] args) {
        String fornavn;
        fornavn = JOptionPane.showInputDialog("Hva er fornavnet ditt?");

        String etternavn;
        etternavn = JOptionPane.showInputDialog("Hva er etternavnet ditt?");

        String alder;
        alder = JOptionPane.showInputDialog("Hvor gammel er du?");

        String adresse;
        adresse = JOptionPane.showInputDialog("Hva er adressen din?");

        String postnummer;
        postnummer = JOptionPane.showInputDialog("Hva er postnummeret ditt?");

        String poststed;
        poststed = JOptionPane.showInputDialog("Hva er poststedet der du bor?");

        String utskrift;
        utskrift = "Navn: " + fornavn + etternavn + "Adresse: " + adresse + "Postnummer: " + postnummer + "Poststed: " + poststed + "Alder: " + alder + ".";

                //fornavn + " " + etternavn + " (" + alder + "), bor i " + adresse + ", " + postnummer + " " + poststed + ".";

        //Navn : Ole Olsen
        //Adresse : Osloveien 23
        //Postnummer : 0470
        //Poststed : Oslo
        //Alder : 21 år.

        JOptionPane.showMessageDialog(null, utskrift,
                "Resultat", JOptionPane.PLAIN_MESSAGE);
    }
}//System.out.println("Hello world");