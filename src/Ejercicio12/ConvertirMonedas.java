
import javax.swing.JOptionPane;

public class ConvertirMonedas {

    public void ConvertirPesosADolares(double valor) {
        double monedaDolar = (valor * 0.06);
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares Americanos");
    }

    public void ConvertirPesosAEuros(double valor) {
        double monedaEuro = valor * 0.054;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
    }

    public void ConvertirPesosALibras(double valor) {
        double monedaLibra = valor * 0.046;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
    }

    public void ConvertirPesosAYen(double valor) {
        double monedaYen = valor * 8.25;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yenes Japonenes");
    }

    public void ConvertirPesosAYuan(double valor) {
        double monedaYuan = valor * 0.42;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYuan + " Yuanes Chinos");
    }

    public void ConvertirPesosAWon(double valor) {
        double monedaWon = valor * 75.91;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Wons Coreanos");
    }

    public void ConvertirPesosARublo(double valor) {
        double monedaRublo = valor * 5.37;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaRublo + " Rublos Rusos");
    }
}
