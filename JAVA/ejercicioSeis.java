
import javax.swing.*;

public class ejercicioSeis {

	public static void main(String args[]) {
		double comision = 0, venta;
		int indice, numventas;
		numventas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ventas que ha realizado"));
		if (numventas==0) {
			JOptionPane.showMessageDialog(null, "Su ganancia por ventas es de Bs.0");
		} else {
			for (indice=1;indice<=numventas;indice++) {
				venta = Double.parseDouble(JOptionPane.showInputDialog("Escriba el costo de la venta #"+ indice));
				if (venta>0 && venta<500000) {
					comision = comision+(venta*0.005);
				} else {
					if (venta>=500000 && venta<1000000) {
						comision = comision+(venta*0.01);
					} else {
						if (venta>=1000000 && venta<1500000) {
							comision = comision+(venta*0.02);
						} else {
							if (venta>=1500000) {
								comision = comision+(venta*0.025);
							} else {
								JOptionPane.showMessageDialog(null, "Usted ha ingresado un valor invalido, vuelva a escribirlo");
								indice = indice-1;
							}
						}
					}
				}
			}
			JOptionPane.showMessageDialog(null, "Su ganancia por ventas es de Bs.".concat(Double.toString(comision)));
		}
	}


}

