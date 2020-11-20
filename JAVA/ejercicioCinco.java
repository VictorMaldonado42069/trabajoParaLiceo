import javax.swing.*;

public class ejercicioCinco {

	public static void main(String args[]) {

		double altura, peso, dosis;
		String sexo;
		do {
			peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del estudiante en libras"));
			altura =Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura en metros"));
			sexo = JOptionPane.showInputDialog("Indique el sexo (H para hombre y M para mujer)");
			if (!(sexo.equalsIgnoreCase("m") || !sexo.equalsIgnoreCase("h")) || peso<0 || altura<0) {
				JOptionPane.showMessageDialog(null, "Ha ingresado un dato invalido");
			}
		} while (!(sexo.equalsIgnoreCase("m") || !sexo.equalsIgnoreCase("h")) || peso<0 || altura<0);
		if (sexo.equalsIgnoreCase("m")) {
			if (peso>=130 && altura>1.50) {
				dosis = (altura*0.25)+(peso*0.75);
				JOptionPane.showMessageDialog(null, "La dosis de vitaminas en gramos que debe consumir es de ".concat(Double.toString(dosis)));
			} else {
				dosis = (altura*0.35)+(peso*0.65);
				JOptionPane.showMessageDialog(null, "La dosis de vitaminas en gramos que debe consumir es de ".concat(Double.toString(dosis)));
			}
		}
		if (sexo.equalsIgnoreCase("h")) {
			if (peso>=150 && altura>1.60) {
				dosis = (altura*0.2)+(peso*0.8);
				JOptionPane.showMessageDialog(null, "La dosis de vitaminas en gramos que debe consumir es de ".concat(Double.toString(dosis)));
			} else {
				dosis = (altura*0.3)+(peso*0.7);
				JOptionPane.showMessageDialog(null, "La dosis de vitaminas en gramos que debe consumir es de ".concat(Double.toString(dosis)));
			}
		}
	}


}

