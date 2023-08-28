import javax.swing.JOptionPane;

public class Oppgave1
{
    public static void main(String[] args)
    {
        String fornavn;
        fornavn = JOptionPane.showInputDialog("Hva er fornavnet ditt?");
        String etternavn;
        etternavn = JOptionPane.showInputDialog("Hva er etternavnet ditt?");
        String utskrift;
        utskrift = "Hallais! " + fornavn + " " + etternavn;
        JOptionPane.showMessageDialog(null, utskrift);
    }
}