import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CelsiusToFahrenheit extends JFrame implements ActionListener
{
    JLabel lCelcius, lFarenheit;
    JTextField tCelsius, tFarenheit;
    JButton bKonweruj;
    JCheckBox chWielkie;
    ButtonGroup bgRozmiar;
    JRadioButton rbMaly, rBSredni, rbDuzy;
    double tempCelcius, tempFarenheit;
    public CelsiusToFahrenheit()
    {

        setSize(400,200);
        setTitle("Przeliczanie stopni celcjusza na Farenhaita");
        setLayout(null);

        lCelcius = new JLabel("Stopnie Celcjusza: ");
        lCelcius.setBounds(20,20,150,20);
        add(lCelcius);

        tCelsius = new JTextField("");
        tCelsius.setBounds(170,20,150,20);
        add(tCelsius);
        tCelsius.addActionListener(this);
        tCelsius.setToolTipText("Podaj temperature w stopniach Celcjusza");

        lFarenheit = new JLabel("Stopnie Farenheita ");
        lFarenheit.setBounds(20, 70,150,20);
        add(lFarenheit);

        tFarenheit = new JTextField(" ");
        tFarenheit.setBounds(170, 70, 150, 20);
        add(tFarenheit);

        bKonweruj = new JButton("Konwertuj ");
        bKonweruj.setBounds(70, 100 ,150,20);
        add(bKonweruj);
        bKonweruj.addActionListener(this);

        chWielkie = new JCheckBox("Wielkie litery ");
        chWielkie.setBounds(250,100,150,20);
        add(chWielkie);
        chWielkie.addActionListener(this);

        bgRozmiar = new ButtonGroup();
        rbMaly = new JRadioButton("Maly", true);
        rbMaly.setBounds(50,150,100,20);
        bgRozmiar.add(rbMaly);
        add(rbMaly);
        rbMaly.addActionListener(this);

        rBSredni = new JRadioButton(" Sredni", false);
        rBSredni.setBounds(150,150,100,20);
        bgRozmiar.add(rBSredni);
        add(rBSredni);
        rBSredni.addActionListener(this);

        rbDuzy = new JRadioButton("Duzy", false);
        rbDuzy.setBounds(250,150,100,20);
        bgRozmiar.add(rbDuzy);
        add(rbDuzy);
        rbDuzy.addActionListener(this);





    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object źrodlo = e.getSource();
        if (źrodlo == bKonweruj)
        {
            tempCelcius = Double.parseDouble(tCelsius.getText());
            tempFarenheit = 32.0 + (9.0 / 5) * tempCelcius;
            tFarenheit.setText(String.valueOf(tempFarenheit));
        }
        else if (źrodlo == rbMaly)
        {
            tFarenheit.setFont(new Font("SansSerif", Font.PLAIN, 12));
        }
        else if (źrodlo == rBSredni)
        {
            tFarenheit.setFont(new Font("SansSerif", Font.PLAIN, 16));
        }
        else if (źrodlo == rbDuzy)
        {
            tFarenheit.setFont(new Font("SansSerif", Font.PLAIN, 20));
        }

        {

            }
    }


    public static void main(String[] args)
    {
        CelsiusToFahrenheit aplikacja = new CelsiusToFahrenheit();
        aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikacja.setVisible(true);



    }

}
