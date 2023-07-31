
import javax.swing.JOptionPane;

public class function {

	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
    public void ConvertirMonedas(double valor) {
    	String opciones = (JOptionPane.showInputDialog(null,
    			"Que DIVISA deseas convertir tu dinero ", "Ingrese Cantidad",
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos Mexicanos a Dólares Americanos",
						"De Pesos Mexicanos a Euro",
						"De Pesos Mexicanos a Libras Esterlinas",
						"De Pesos Mexicanos a Yen Japones",
						"De Pesos Mexicanos a Yuan Chino",
						"De Pesos Mexicanos a Won Coreano",
						"De Pesos Mexicanos a Rublos Rusos",
						"De Dólares Americanos a Pesos Mexicanos",
						"De Euros a Pesos Mexicanos",
						"De Libras Esterlinas a Pesos Mexicanos",
						"De Yen Japones a Pesos Mexicanos",
						"De Yuan Chino a Pesos Mexicanos",
						"De Won Coreano a Pesos Mexicanos",
						"De Pesos Mexicanos a Rublos Rusos"}, "Seleccion")).toString();

        switch(opciones) {
        case "De Pesos Mexicanos a Dólares Americanos":
			//System.out.println("De Pesos Mexicanos a Dólares Americanos");
        	monedas.ConvertirPesosADolares(valor);
        	break;

        case "De Pesos Mexicanos a Euro":
			//System.out.println("De Pesos Mexicanos a Euro");
        	monedas.ConvertirPesosAEuros(valor);
        	break;

        case "De Pesos Mexicanos a Libras Esterlinas":
			//System.out.println("De Pesos Mexicanos a Libras Esterlinas");
        	monedas.ConvertirPesosALibras(valor);
        	break;

        case "De Pesos Mexicanos a Yen Japones":
        	monedas.ConvertirPesosAYen(valor);
        	break;

		case "De Pesos Mexicanos a Yuan Chino":
			monedas.ConvertirPesosAYuan(valor);
			break;

        case "De Pesos Mexicanos a Won Coreano":
        	monedas.ConvertirPesosAWon(valor);
        	break;

		case "De Pesos Mexicanos a Rublos Rusos":
			monedas.ConvertirPesosARublo(valor);
			break;

        case "De Dólares Americanos a Pesos Mexicanos":
			//System.out.println("De Dólares Americanos a Pesos Mexicanos");
        	pesos.ConvertirDolaresAPesos(valor);
        	break;

        case "De Euros a Pesos Mexicanos":
			//System.out.println("De Euros a Pesos Mexicanos");
        	pesos.ConvertirEurosAPesos(valor);
        	break;

        case "De Libras Esterlinas a Pesos Mexicanos":
			//ystem.out.println("De Libras Esterlinas a Pesos Mexicanos");
        	pesos.ConvertirLibrasAPesos(valor);
        	break;

        case "De Yen Japones a Pesos Mexicanos":
        	pesos.ConvertirYenAPesos(valor);
        	break;

		case "De Yuan Chino a Pesos Mexicanos":
			pesos.ConvertirYuanAPesos(valor);
			break;

        case "De Won Coreano a Pesos Mexicanos":
            pesos.ConvertirWonAPesos(valor);
            break;

		case "De Rublos Rusos a Pesos Mexicanos":
			pesos.ConvertirRublosAPesos(valor);
			break;
        }      
    }
}
