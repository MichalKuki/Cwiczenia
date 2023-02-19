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


    }
     @Override
     public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if (zrodlo == bKonweruj || zrodlo == tCelsius) {

            tempCelcius = Double.parseDouble(tCelsius.getText());
            tempFarenheit = 32.0 + (9.0 / 5) * tempCelcius;
            tFarenheit.setText(String.valueOf(tempFarenheit));
        }
        else if (zrodlo == chWielkie)
        {
            if (chWielkie.isSelected()==true)
            {
                tFarenheit.setFont(new Font("SansSerif", Font.BOLD, 18));
            }
            else {
                tFarenheit.setFont(new Font("SansSerif", Font.BOLD, 12));
            }
        }
     }

    public static void main(String[] args)
    {
        CelsiusToFahrenheit aplikacja = new CelsiusToFahrenheit();
        aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikacja.setVisible(true);



    }

}
