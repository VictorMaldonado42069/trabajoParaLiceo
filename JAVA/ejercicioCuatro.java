
import javax.swing.*;

public class ejercicioCuatro {

	public static void main(String args[]) { 
		char categoriaChar = 0, heChar = 0;
		String categoria, he;// he = almacena si trabajó o no horas extra
		double horasextra, horastrabajadas, sueldobase, total;
		sueldobase = Double.parseDouble(JOptionPane.showInputDialog("Indique el salario base del trabajador"));

		horastrabajadas = Double.parseDouble(JOptionPane.showInputDialog("Escriba las horas trabajadas"));

		categoria = JOptionPane.showInputDialog("Señale la categoria del trabajador (A, B, C, D)");
		categoriaChar = categoria.charAt(0);
		he = JOptionPane.showInputDialog("¿Trabajó horas extra? (escribir 1 para <<sí>> y 0 para <<no>>)");
		heChar = he.charAt(0);
		if (heChar=='1') {
			horasextra =Double.parseDouble(JOptionPane.showInputDialog("¿Cuantas horas extra trabajó?"));
			switch (categoriaChar) {
			case 'a':
				horasextra = horasextra*4000;
				break;
			case 'A':
				horasextra = horasextra*4000;
				break;
			case 'b':
				horasextra = horasextra*3000;
				break;
			case 'B':
				horasextra = horasextra*3000;
				break;
			case 'c':
				horasextra = horasextra*2500;
				break;
			case 'C':
				horasextra = horasextra*2500;
				break;
			case 'd':
				horasextra = horasextra*1000;
				break;
			case 'D':
				horasextra = horasextra*1000;
				break;
			default:
				JOptionPane.showMessageDialog(null, "La categoria escogio no existe, se mostrará el salario total sin horas extra");
				horasextra = 0;
			}
			total = (sueldobase*horastrabajadas)+horasextra;
			JOptionPane.showMessageDialog(null, "El salario total es de ".concat(Double.toString(total)));
		} else {
			total = (sueldobase*horastrabajadas);
			JOptionPane.showMessageDialog(null, "El salario total sin horas extra es de ".concat(Double.toString(total)));
		}
	}


}

