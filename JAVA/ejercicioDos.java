
import javax.swing.*;

public class ejercicioDos {

	public static void main(String args[]){
		int descuento;
		double subtotal, total;
		subtotal = Double.parseDouble(JOptionPane.showInputDialog("Indique el costo de su compra"));
		do {
			descuento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el color de su esfera de descuento\n 1) Azul\n 2) Rojo\n 3) Blanco"));
		} while (!((descuento==1) || (descuento==2) || (descuento==3)));
		switch (descuento) {
		case 1:
			total = (subtotal-(subtotal*0.2));
			JOptionPane.showMessageDialog(null, "Usted ha escogido la esfera azul. Tiene un 20% de descuento y el monto a pagar es "+total);
			break;
		case 2:
			total = (subtotal-(subtotal*0.3));
			JOptionPane.showMessageDialog(null, "Usted ha escogido la esfera roja. Tiene un 30% de descuento y el monto a pagar es "+total);
			break;
		default:
			total = subtotal;
			JOptionPane.showMessageDialog(null, "Usted ha escogido la esfera blanca. El monto a pagar es "+total);
		}
	}


}

