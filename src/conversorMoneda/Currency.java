package conversorMoneda;

import javax.swing.JOptionPane;


/*
 * All the currencies are based on an array. The redirection of each one depends on conditionals IF 
 */
public class Currency extends Menu {

	
	protected static void CurrencyConvertor() {
		
		
		String[] badge = new String[10];
		badge[0]= "Pesos a Dolar";
		badge[1]= "Pesos a Euros";
		badge[2]= "Pesos a Libras Esterlinas";
		badge[3]= "Pesos a Yen Japonés";
		badge[4]= "Pesos a Won Sur-Coreano";
		badge[5]= "Dolar a Pesos";
		badge[6]= "Euros a Pesos";
		badge[7]= "Libras Esterlinas a Pesos";
		badge[8]= "Yen Japonés a Pesos";
		badge[9]= "Won Sur-Coreano a Pesos";

		
		
		Object selectedBadge = JOptionPane.showInputDialog(null, "Selecciona la divisa a cambiar", "Conversor de moneda :)", JOptionPane.QUESTION_MESSAGE, null,badge,"Pesos a Dolar");
		System.out.println("Selected: " + selectedBadge);
		String amountToConvert  =JOptionPane.showInputDialog(null, "Digite cantidad a convertir: "  + selectedBadge);
		System.out.println("Entered : " + amountToConvert);
		
		// COP To other currencies
		
		if(selectedBadge.equals("Pesos a Dolar") ) {
			float TRM = 4052;
			float amount = Integer.parseInt(amountToConvert);
			float operation = amount / TRM;
					
			if(amount < 0) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrecto de: " + amount + ", Debe ser minimo : " + TRM, "Convertidor " + "de moneda", JOptionPane.INFORMATION_MESSAGE);			
			}else{
				JOptionPane.showMessageDialog(null, "Resultado de la conversión: $" + operation + " Dolar(es)", "Resultado", JOptionPane.INFORMATION_MESSAGE);	
			}
		}
		if(selectedBadge.equals("Pesos a Euros") ) {
			float TRM = 4444;
			float amount = Integer.parseInt(amountToConvert);
			float operation = amount / TRM;
					
			if(amount < 0) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrecto de: " + amount + ", Debe ser minimo : " + TRM, "Convertidor " + "de moneda", JOptionPane.INFORMATION_MESSAGE);			
			}else{
				JOptionPane.showMessageDialog(null, "Resultado de la conversión: $" + operation + " Euro(s)", "Resultado", JOptionPane.INFORMATION_MESSAGE);	
			}
		}
		if(selectedBadge.equals("Pesos a Libras Esterlinas") ) {
			float TRM = 5151;
			float amount = Integer.parseInt(amountToConvert);
			float operation = amount / TRM;
					
			if(amount < 0) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrecto de: " + amount + ", Debe ser minimo : " + TRM, "Convertidor " + "de moneda", JOptionPane.INFORMATION_MESSAGE);			
			}else{
				JOptionPane.showMessageDialog(null, "Resultado de la conversión: $" + operation + " Libra Esterlina(s)", "Resultado", JOptionPane.INFORMATION_MESSAGE);	
			}
		}
		
		if(selectedBadge.equals("Pesos a Yen Japonés") ) {
			float TRM = 28;
			float amount = Integer.parseInt(amountToConvert);
			float operation = amount / TRM;
					
			if(amount < 0) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrecto de: " + amount + ", Debe ser minimo : " + TRM, "Convertidor " + "de moneda", JOptionPane.INFORMATION_MESSAGE);			
			}else{
				JOptionPane.showMessageDialog(null, "Resultado de la conversión: $" + operation + " Yen Japonés", "Resultado", JOptionPane.INFORMATION_MESSAGE);	
			}
		}
		
		if(selectedBadge.equals("Pesos a Won Sur-Coreano") ) {
			float TRM = 3;
			float amount = Integer.parseInt(amountToConvert);
			float operation = amount / TRM;
					
			if(amount < 0) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrecto de: " + amount + ", Debe ser minimo : " + TRM, "Convertidor " + "de moneda", JOptionPane.INFORMATION_MESSAGE);			
			}else{
				JOptionPane.showMessageDialog(null, "Resultado de la conversión: $" + operation + " Won(es)", "Resultado", JOptionPane.INFORMATION_MESSAGE);	
			}
		}
		
		// Other currencies to COP

		if(selectedBadge.equals("Dolar a Pesos") ) {
			float TRM = 4050;
			float amount = Integer.parseInt(amountToConvert);
			float operation = amount * TRM;
					
			if(amount < 0) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrecto de: " + amount + ", Debe ser minimo : " + TRM, "Convertidor " + "de moneda", JOptionPane.INFORMATION_MESSAGE);			
			}else{
				JOptionPane.showMessageDialog(null, "Resultado de la conversión: $" + operation + " Peso(s)", "Resultado", JOptionPane.INFORMATION_MESSAGE);	
			}
			
		}
		
		if(selectedBadge.equals("Euros a Pesos") ) {
			float TRM = 4444;
			float amount = Integer.parseInt(amountToConvert);
			float operation = amount * TRM;
					
			if(amount < 0) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrecto de: " + amount + ", Debe ser minimo : " + TRM, "Convertidor " + "de moneda", JOptionPane.INFORMATION_MESSAGE);			
			}else{
				JOptionPane.showMessageDialog(null, "Resultado de la conversión: $" + operation + " Peso(s)", "Resultado", JOptionPane.INFORMATION_MESSAGE);	
			}
			
		}
		
		if(selectedBadge.equals("Libras Esterlinas a Pesos") ) {
			float TRM = 5150;
			float amount = Integer.parseInt(amountToConvert);
			float operation = amount * TRM;
					
			if(amount < 0) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrecto de: " + amount + ", Debe ser minimo : " + TRM, "Convertidor " + "de moneda", JOptionPane.INFORMATION_MESSAGE);			
			}else{
				JOptionPane.showMessageDialog(null, "Resultado de la conversión: $" + operation + " Peso(s)", "Resultado", JOptionPane.INFORMATION_MESSAGE);	
			}
			
		}
		
		if(selectedBadge.equals("Yen Japonés a Pesos") ) {
			float TRM = 28;
			float amount = Integer.parseInt(amountToConvert);
			float operation = amount * TRM;
					
			if(amount < 0) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrecto de: " + amount + ", Debe ser minimo : " + TRM, "Convertidor " + "de moneda", JOptionPane.INFORMATION_MESSAGE);			
			}else{
				JOptionPane.showMessageDialog(null, "Resultado de la conversión: $" + operation + " Peso(s)", "Resultado", JOptionPane.INFORMATION_MESSAGE);	
			}
			
		}
		
		if(selectedBadge.equals("Won Sur-Coreano a Pesos") ) {
			float TRM = 3;
			float amount = Integer.parseInt(amountToConvert);
			float operation = amount * TRM;
					
			if(amount < 0) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrecto de: " + amount + ", Debe ser minimo : " + TRM, "Convertidor " + "de moneda", JOptionPane.INFORMATION_MESSAGE);			
			}else{
				JOptionPane.showMessageDialog(null, "Resultado de la conversión: $" + operation + " Peso(s)", "Resultado", JOptionPane.INFORMATION_MESSAGE);	
			}
			
			promptMenu();

		}
		
		
	}
	
	
}
