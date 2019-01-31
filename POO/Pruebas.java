package tarea_Almacen;

import javax.swing.JOptionPane;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Camisas a = new Camisas();
		JOptionPane.showMessageDialog(null, "Por Defecto \n" + "Nombre: " + a.getTalla() + "  Categoría: " + a.getLogotipo());
		
		Camisas b = new Camisas("M", "Asus");
		JOptionPane.showMessageDialog(null, "Primer constructor \n" + "Talla: : " + b.getTalla() + "  Logotipo: " + b.getLogotipo());
		
		Camisas c = new Camisas("S", "Republik Gaming", "Saul", 10, 5);
		JOptionPane.showMessageDialog(null, "Segundo constructor \n" +c.toString());
	}

}
