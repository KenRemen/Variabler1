import javax.swing.JOptionPane;

public class utsagnslogikk
{
    public static void main(String[] args)
    {
        boolean p=3>2; //sant
        boolean q=2>1; //usant
        boolean r=(!q&&((p>q)));

        JOptionPane.showMessageDialog(null, r,
                "Resultat", JOptionPane.PLAIN_MESSAGE);
    }
}
