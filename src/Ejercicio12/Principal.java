/**
 * Creador de conversion de divisas y de temperatura.
 */

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        function divisas = new function();
        functionTemperatura temperatura = new functionTemperatura();

        while (true) {

            String opciones = (JOptionPane.showInputDialog(null,
                    "Seleccione una opción de conversión ",
                    "Menu", JOptionPane.QUESTION_MESSAGE,
                    null, new Object[]{"Conversor de Divisas", "Conversor de Temperatura"},
                    "Seleccion")).toString();

            switch (opciones) {
                case "Conversor de Divisas":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                    if (ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        divisas.ConvertirMonedas(Minput);

                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Selecciona opción Afirmativa");
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            System.exit(0);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;

                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
                    if (ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        temperatura.ConvertirTemperatura(Minput);

                        int respuesta = 0;
                        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                        if ((respuesta == 0) && (ValidarNumero(input) == true)) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            System.exit(0);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
            }
        }
    }

    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
