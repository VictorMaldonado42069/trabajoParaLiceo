import javax.swing.*;

public class ejercicioSiete {

	public static void main(String args[]) {
		double acumulador = 0, examen, finalfisica, finalmate, tareas;
		int cantidadtareasfisica, iterador;
		examen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del examen de matemática"));
		examen = (examen*18)/20;
		tareas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de la tarea #1 de matemática"));
		acumulador = acumulador+tareas;
		tareas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de la tarea #2 de matemática"));
		acumulador = acumulador+tareas;
		tareas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de la tarea #3 de matemática"));
		acumulador = acumulador+tareas;
		tareas = acumulador/3;
		tareas = (tareas*2)/20;
		finalmate = examen+tareas;
		acumulador = 0;
		examen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del examen de fisica"));
		examen = (examen*16)/20;
		cantidadtareasfisica = Integer.parseInt(JOptionPane.showInputDialog("Indique el numero de tareas de fisica"));
		for (iterador=1;iterador<=cantidadtareasfisica;iterador++) {
			tareas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de la tarea de fisica #"+iterador));
			acumulador = acumulador+tareas;
		}
		tareas = acumulador/cantidadtareasfisica;
		tareas = (tareas*4)/20;
		finalfisica = examen+tareas;
		JOptionPane.showMessageDialog(null, "Su nota final de matematica es: "+finalmate);
		JOptionPane.showMessageDialog(null, "Su nota final de fisica es: "+finalfisica);
	}


}

