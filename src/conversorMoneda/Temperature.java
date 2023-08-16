package conversorMoneda;

import javax.swing.JOptionPane;


/*
 * The class tempConverter contains in an array the 6 temperature measurement types, based on conditionals the code redirect to each one of them.
 */
public class Temperature extends Menu {

	
	protected static void tempConverter(){
		
		try {
		String[] options = new String[6];
		
		options[0]= "Celsius a Fahrenheit";
		options[1]= "Celsius a Kelvin";
		options[2]= "Fahrenheit a Celsius";
		options[3]= "Fahrenheit a Kelvin";
		options[4]= "Kelvin a Celsius";
		options[5]= "Kelvin a Fahrenheit";
		
		Object selectedTempOption = JOptionPane.showInputDialog(null, "Selecciona medida de temperatura", "Convertidor Temperatura", JOptionPane.QUESTION_MESSAGE, null, options ,"Celsius a Fahrenheit");
		System.out.println("Selected: " + selectedTempOption);
		String amountToConvert  =JOptionPane.showInputDialog(null, "Digite cantidad a convertir: "  + selectedTempOption);
		System.out.println("Entered : " + amountToConvert);

		
		
		//Celsius

		if(selectedTempOption.equals("Celsius a Fahrenheit") ) {
			float amount = Integer.parseInt(amountToConvert);
			float operation = (float) (1.8 * amount + 32);
			
			if(amount < 0) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrecto de: " + amount + ", Debe ser minimo : " + "1 ", "Convertidor " + "de moneda", JOptionPane.INFORMATION_MESSAGE);			
			}else{
				JOptionPane.showMessageDialog(null, "Resultado de la conversión: " + operation + " grados Fahrenheit ", "Resultado", JOptionPane.INFORMATION_MESSAGE);	
			}

		}
		if(selectedTempOption.equals("Celsius a Kelvin") ) {
			float amount = Integer.parseInt(amountToConvert);
			float operation = (float) (amount + 273.15);
			
			if(amount < 0) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrecto de: " + amount + ", Debe ser minimo : " + "1 ", "Convertidor " + "de moneda", JOptionPane.INFORMATION_MESSAGE);			
			}else{
				JOptionPane.showMessageDialog(null, "Resultado de la conversión: " + operation + " grados Fahrenheit ", "Resultado", JOptionPane.INFORMATION_MESSAGE);	
			}

		}
		
		
		//Fahrenheit
		
		
		if(selectedTempOption.equals("Fahrenheit a Celsius") ) {
			float amount = Integer.parseInt(amountToConvert);
			float operation = (float) ((amount - 32) / 1.8);
			
			if(amount < 0) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrecto de: " + amount + ", Debe ser minimo : " + "1 ", "Convertidor " + "de moneda", JOptionPane.INFORMATION_MESSAGE);			
			}else{
				JOptionPane.showMessageDialog(null, "Resultado de la conversión: " + operation + " grados Celsius ", "Resultado", JOptionPane.INFORMATION_MESSAGE);	
			}
		

	}
		
		if(selectedTempOption.equals("Fahrenheit a Kelvin") ) {
			float amount = Integer.parseInt(amountToConvert);
			float operation = (float) ((amount - 32) / 1.8 + 273.15);
			
			if(amount < 0) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrecto de: " + amount + ", Debe ser minimo : " + "1 ", "Convertidor " + "de moneda", JOptionPane.INFORMATION_MESSAGE);			
			}else{
				JOptionPane.showMessageDialog(null, "Resultado de la conversión: " + operation + " grados Celsius ", "Resultado", JOptionPane.INFORMATION_MESSAGE);	
			}
	}
		
		//Kelvin
		
		if(selectedTempOption.equals("Kelvin a Celsius") ) {
			float amount = Integer.parseInt(amountToConvert);
			float operation = (float) (amount - 273.15);
			
			if(amount < 0) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrecto de: " + amount + ", Debe ser minimo : " + "1 ", "Convertidor " + "de moneda", JOptionPane.INFORMATION_MESSAGE);			
			}else{
				JOptionPane.showMessageDialog(null, "Resultado de la conversión: " + operation + " grados Celsius ", "Resultado", JOptionPane.INFORMATION_MESSAGE);	
			}
		

	}
		
		if(selectedTempOption.equals("Kelvin a Fahrenheit") ) {
			float amount = Integer.parseInt(amountToConvert);
			float operation = (float) ((amount - 273.15)*1.8 + 32);
			
			if(amount < 0) {
				JOptionPane.showMessageDialog(null, "Valor ingresado incorrecto de: " + amount + ", Debe ser minimo : " + "1 ", "Convertidor " + "de moneda", JOptionPane.INFORMATION_MESSAGE);			
			}else{
				JOptionPane.showMessageDialog(null, "Resultado de la conversión: " + operation + " grados Celsius ", "Resultado", JOptionPane.INFORMATION_MESSAGE);	
			}
		
			
	}
		
		
	}catch(NumberFormatException e) {
		String errorMessage = "Recuerda que no puedes ingresar letras, intenta nuevamente" ;
	    JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
}
		promptMenu();
}}
