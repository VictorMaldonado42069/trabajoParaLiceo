/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "EJERCICIOTRES.java."

import java.io.*;

public class ejercicioTres {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int cantidad;
		double costounitario;
		int descuento;
		double subtotal;
		double total;
		System.out.println("Indique el costo unitario de la tabla");
		costounitario = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese la cantidad de tablas del cliente");
		cantidad = Integer.parseInt(bufEntrada.readLine());
		subtotal = costounitario*cantidad;
		do {
			System.out.println("Ingrese el tipo de cliente");
			System.out.println("1) Paga a tiempo");
			System.out.println("2) Paga con retraso");
			System.out.println("3) Cliente nuevo");
			descuento = Integer.parseInt(bufEntrada.readLine());
		} while (!((descuento==1) || (descuento==2) || (descuento==3)));
		switch (descuento) {
		case 1:
			total = (subtotal-(subtotal*0.15));
			System.out.println("Usted ha escogido la esfera azul. Tiene un 20% de descuento y el monto a pagar es ".concat(Double.toString(total)));
			break;
		case 2:
			total = (subtotal-(subtotal*0.12));
			System.out.println("Usted ha escogido la esfera roja. Tiene un 30% de descuento y el monto a pagar es ".concat(Double.toString(total)));
			break;
		default:
			total = (subtotal-(subtotal*0.12));
			System.out.println("Usted ha escogido la esfera blanca. El monto a pagar es ".concat(Double.toString(total)));
		}
	}


}

