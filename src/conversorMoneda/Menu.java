package conversorMoneda;
import javax.swing.JOptionPane;


/**
 * 
 * @author andre
 * The class Menu represents the main pop up window.
 * 
 *
 */

public class Menu {

	
	
	public static void main(String[] args) {
		promptMenu();
	}
	
	
	protected static void promptMenu() {

		String[] menuSelector = new String[2];
		menuSelector[0]="Conversor de Moneda";
		menuSelector[1]="Conversor de Temperatura";
		
		Object menuSelected = JOptionPane.showInputDialog(null, "Selecciona la conversión deseada: ", "Conversor", JOptionPane.QUESTION_MESSAGE, null,menuSelector,null);
		System.out.println("Selected: " + menuSelected);
		
		if(menuSelected == "Conversor de Moneda") {
			Currency.CurrencyConvertor();
		}if(menuSelected == "Conversor de Temperatura") {
			Temperature.tempConverter();
		}else {
			int exitMenu = JOptionPane.showConfirmDialog(null,"¿Deseas salir del convertidor?", "Convertidor", JOptionPane.YES_OPTION);
			if (exitMenu == 1) {
				promptMenu();
				System.out.println("Going back to menu");
			}if(exitMenu == 1){
				int exitMenuRetention = JOptionPane.showConfirmDialog(null,"¿Estas seguro?", "Convertidor", JOptionPane.YES_OPTION);
				promptMenu();
			}
		}
	}
	
	
	
	
	
	
	
	
}
