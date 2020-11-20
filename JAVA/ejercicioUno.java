import javax.swing.*;

public class ejercicioUno {

	public static void main(String args[]){
		Double a=null, b=null, c=null, d, m, u, x=null, y=null, z;
		String tf;// tf = tipo de formula
		do {
			tf = JOptionPane.showInputDialog("Indique la formula que desea aplicar (m ó z)");
			if ((!tf.equalsIgnoreCase("m")) || (!tf.equalsIgnoreCase("z"))) {
				JOptionPane.showMessageDialog(null, "La opción que ha escogido no existe. Por favor, intente de nuevo");
			}
		} while (!((tf.equalsIgnoreCase("m")) || (tf.equalsIgnoreCase("z"))));
		if ((tf.equalsIgnoreCase("m"))) {
			a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de a"));
			b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de b"));
			while ((a==null) && (b==null) && (c==null) && (x==null) && (y==null)) {
				JOptionPane.showMessageDialog(null, "Una o más variables son invalidas. Por favor intente de nuevo");
				a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de a"));
				b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de b"));
			}
			m = (5*(Math.pow(a,2))*(Math.pow(b,3)))+Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));
			JOptionPane.showMessageDialog(null, "El resultado para m es "+m);
		} else {
			if ((tf.equals("z")) || (tf.equals("Z"))) {
				a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de a"));
				b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de b"));
				c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de c"));
				x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de x"));
				y = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de y"));
				while ((a==null) && (b==null) && (c==null) && (x==null) && (y==null)) {
					System.out.println("Una o m�s variables son invalidas. Por favor intente de nuevo");
					a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de a"));
					b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de b"));
					c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de c"));
					x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de x"));
					y = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de y"));
				}
				u = (3*(Math.pow(a,2))*(Math.pow(b,5)));
				d = (7*(Math.pow(y,2)))-((a*b)*(Math.pow(c,6)))+(6*(Math.pow(x,2)))+(98*(Math.pow(y,3)));
				z = u+d;
				JOptionPane.showMessageDialog(null, "El resultado para z es "+z);
			}
		}
	}


}

