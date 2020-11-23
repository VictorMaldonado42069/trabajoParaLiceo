
import javax.swing.*;

public class ejercicioTres {

	public static void main(String args[]) {
		int cantidad, descuento;
		double costounitario, subtotal, total;
		costounitario = Double.parseDouble(JOptionPane.showInputDialog("Indique el costo unitario de la tabla"));
		cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de tablas del cliente"));
		subtotal = costounitario*cantidad;
		do {
			descuento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de cliente\n 1) Paga a tiempo\n 2) Paga con retraso\n 3) Cliente nuevo"));
		} while (!((descuento==1) || (descuento==2) || (descuento==3)));
		switch (descuento) {
		case 1:
			total = (subtotal-(subtotal*0.15));
			JOptionPane.showMessageDialog(null, "Su descuento es de 15% y el monto a pagar es "+total);
			break;
		case 2:
			total = (subtotal-(subtotal*0.05));
			JOptionPane.showMessageDialog(null, "Su descuento es de 5% y el monto a pagar es "+total);
			break;
		default:
			total = (subtotal-(subtotal*0.02));
			JOptionPane.showMessageDialog(null, "Su descuento es de 2% y el monto a pagar es "+total);
		}
	}


}

