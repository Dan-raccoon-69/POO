
import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {

    public void ConvertirDolaresAPesos(double valor) {
        double monedaDolar1 = valor * 16.87;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar1 + " Pesos Mexicanos");
        //System.out.println(monedaDolar1+" ConvertirDolaresAPesos");
    }

    public void ConvertirEurosAPesos(double valor) {
        double monedaEuro = valor * 18.52;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Pesos Mexicanos");
        //System.out.println(monedaEuro+" ConvertirEurosAPesos");
    }

    public void ConvertirLibrasAPesos(double valor) {
        double monedaLibra = valor * 21.58;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Pesos Mexicanos");
        //System.out.println(monedaLibra+" ConvertirLibrasAPesos");
    }

    public void ConvertirYenAPesos(double valor) {
        double monedaYen = valor * 0.12;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Pesos Mexicanos");
        //System.out.println(monedaYen+" ConvertirYenAPesos");
    }

    public void ConvertirYuanAPesos(double valor) {
        double monedaYuan = valor * 2.35;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYuan + " Pesos Mexicanos");
    }

    public void ConvertirWonAPesos(double valor) {
        double monedaWon = valor * 0.013;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Pesos Mexicanos");
    }

    public void ConvertirRublosAPesos(double valor) {
        double monedaRublo = valor * 0.19;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaRublo + " Pesos Mexicanos");
    }
}
