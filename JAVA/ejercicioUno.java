import javax.swing.*;
import java.math.*;

public class ejerciciouno {

	public static void main(final String args[]) {
		final Double a=null, b=null, c=null, d, m, u, x=null, y=null, z;
		final String tf;// tf = tipo de formula
		escoger(tf);
		if ((tf.equalsIgnoreCase("m"))) {
			while (a==null || b==null) {
				JOptionPane.showMessageDialog(null,"Una o más variables son invalidas. Por favor intente de nuevo");
				llenadom(a,b);
			}
			m = (5*(Math.pow(a,2))*(Math.pow(b,3)))+Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));
			JOptionPane.showMessageDialog(null,"El resultado para m es ".concat(Double.toString(m)));
			
		} else {
			if ((tf.equalsIgnoreCase("z"))) {
				while (a==null || b==null || c==null || x==null || y==null) {
					JOptionPane.showMessageDialog(null,"Una o más variables son invalidas. Por favor intente de nuevo");
					llenadoz(a,b,c,x,y);
				}
				u = (3*(Math.pow(a,2))*(Math.pow(b,5)));
				d = (7*(Math.pow(y,2)))-((a*b)*(Math.pow(c,6)))+(6*(Math.pow(x,2)))+(98*(Math.pow(y,3)));
				z = u+d;
				JOptionPane.showMessageDialog(null,"El resultado para z es ".concat(Double.toString(z)));
			}
		}
	}

	public static void escoger(String tf) {
		do {
			JOptionPane.showMessageDialog(null,"Indique la formula que desea aplicar (m ó z)");
			tf = JOptionPane.showInputDialog("Ingrese el valor de a");
			if ((!tf.equalsIgnoreCase("m")) || (!tf.equalsIgnoreCase("z"))) {
				JOptionPane.showMessageDialog(null,"La opción que ha escogido no existe. Por favor, intente de nuevo");
			}
		} while (!((tf.equalsIgnoreCase("m")) || (tf.equalsIgnoreCase("z"))));
	}

	public static void llenadoz(Double a, Double b, Double c, Double x, Double y){
		a = JOptionPane.showInputDialog("Ingrese el valor de a");
		b = JOptionPane.showInputDialog("Ingrese el valor de b");
		c = JOptionPane.showInputDialog("Ingrese el valor de c");
		x = JOptionPane.showInputDialog("Ingrese el valor de x");
		y = JOptionPane.showInputDialog("Ingrese el valor de y");
	}

	public static void llenadom(Double a, Double b){
		a = JOptionPane.showInputDialog("Ingrese el valor de a");
		b = JOptionPane.showInputDialog("Ingrese el valor de b");
	}


}

