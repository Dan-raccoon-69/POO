
import javax.swing.JOptionPane;

public class ConvertirTemperatura {

    public double ConvertirCelciusAFarenheit(double valor) {
        double farenheit = valor * 1.8 + 32;
        JOptionPane.showMessageDialog(null, +valor + " Grados Celcius son " + farenheit + " Grados Farenheit ");
        return farenheit;
    }

    public void ConvertirCelciusAKelvin(double valor) {
        double kelvin = valor + 273.15;
        JOptionPane.showMessageDialog(null, +valor + " Grados Celcius son " + kelvin + " Kelvin");
    }

    public void ConvertirFarenheitACelcius(double valor) {
        double celcius = (valor - 32) / 1.8;
        JOptionPane.showMessageDialog(null, +valor + " Grados Farenheit son " + celcius + " Celcius");
    }

    public double ConvertirKelvinACelcius(double valor) {
        double kelvinCelcius = valor - 273.15;
        JOptionPane.showMessageDialog(null, +valor + " Kelvin son " + kelvinCelcius + " Celcius");
        return kelvinCelcius;
    }

    public void ConvertirKelvinAFarenheit(double valor) {
        double kelvinFarenheit = (valor - 273.15) * 1.8 + 32;
        JOptionPane.showMessageDialog(null, +valor + " Kelvin son " + kelvinFarenheit + " Celcius");
    }
}
