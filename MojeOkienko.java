
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MojeOkienko extends JFrame implements ActionListener
{
    JButton bPodajDate, bWyjscie;
    JLabel lWyswietlDate;
    public MojeOkienko() {
        setSize(300, 200);
        setTitle("Pierwsze okno ");
        setLayout(null);
       //PRZYCISKI
        bPodajDate = new JButton("Podaj Datę");
        bPodajDate.setBounds(50, 50, 100 , 20);
        add(bPodajDate);
        bPodajDate.addActionListener(this);

        bWyjscie = new JButton("Wyjscie");
        bWyjscie.setBounds(150, 50, 100 , 20);
        add(bWyjscie);
        bWyjscie.addActionListener(this);

        lWyswietlDate= new JLabel("Data: ");
        lWyswietlDate.setBounds(50, 100, 200 , 20);
        lWyswietlDate.setForeground(new Color(186, 37, 243));
        lWyswietlDate.setFont(new Font("SansSerif", Font.BOLD, 13));
        add(lWyswietlDate);
    }
    public static void main(String[] args)
    {
        MojeOkienko okno = new MojeOkienko();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object zrodlo = e.getSource();
        if(zrodlo == bPodajDate)
        {
            lWyswietlDate.setText(new Date().toString());
           // System.out.println(new Date());
        }
        else if (zrodlo == bWyjscie)
        {
            dispose();
        }
    }
}