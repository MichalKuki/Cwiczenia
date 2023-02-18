import javax.swing.*;

public class CelsiusToFahrenheit extends JFrame
{
    public CelsiusToFahrenheit()
    {
        JLabel lCelcius, lFarenheit;
        JTextField tCelsius, tFarenheit;
        JButton bKonweruj;


        setSize(400,200);
        setTitle("Przeliczanie stopni celcjusza na Farenhaita");
        setLayout(null);

        lCelcius = new JLabel("Stopnie Celcjusza: ");
        lCelcius.setBounds(20,20,150,20);
        add(lCelcius);

        tCelsius = new JTextField("");
        tCelsius.setBounds(170,20,150,20);
        add(tCelsius);

        lFarenheit = new JLabel("Stopnie Farengeita: ");
        lFarenheit.setBounds(70,20,150,20);
        add(lFarenheit);

        tFarenheit = new JTextField("");
        tFarenheit.setBounds(170,20,150,20);
        add(tFarenheit);


        bKonweruj = new JButton("Konwertuj");
        bKonweruj.setBounds(20, 20,150,20);
        add(bKonweruj);
    }

    public static void main(String[] args)
    {
        CelsiusToFahrenheit aplikacja = new CelsiusToFahrenheit();
        aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikacja.setVisible(true);



    }

}
