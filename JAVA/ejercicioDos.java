/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "EJERCICIODOS.java."

import java.io.*;

public class ejercicioDos {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int descuento;
		double subtotal;
		double total;
		System.out.println("Indique el costo de su compra");
		subtotal = Double.parseDouble(bufEntrada.readLine());
		do {
			System.out.println("Ingrese el color de su esfera de descuento");
			System.out.println("1) Azul");
			System.out.println("2) Rojo");
			System.out.println("3) Blanco");
			descuento = Integer.parseInt(bufEntrada.readLine());
		} while (!((descuento==1) || (descuento==2) || (descuento==3)));
		switch (descuento) {
		case 1:
			total = (subtotal-(subtotal*0.2));
			System.out.println("Usted ha escogido la esfera azul. Tiene un 20% de descuento y el monto a pagar es ".concat(Double.toString(total)));
			break;
		case 2:
			total = (subtotal-(subtotal*0.3));
			System.out.println("Usted ha escogido la esfera roja. Tiene un 30% de descuento y el monto a pagar es ".concat(Double.toString(total)));
			break;
		default:
			total = subtotal;
			System.out.println("Usted ha escogido la esfera blanca. El monto a pagar es ".concat(Double.toString(total)));
		}
	}


}

