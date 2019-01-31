import java.util.Random;

import javax.swing.JOptionPane;

public class MariselaClase {
	final int tamano = 5;
int datos[] = new int[tamano];
	int ultimo = -1;
	int pos = -1;

	public void Buscar(){
		int numero = 0;
		String datito;
		if(ultimo != -1){
			datito = JOptionPane.showInputDialog("Dame el valor que quieres buscar en el vector");
			numero = Integer.parseInt(datito);
			for (int i = 0; i <= ultimo; i++) {
				if(datos[i] == numero){
					pos = i;
				}
				}
				if(pos != -1){
					JOptionPane.showMessageDialog(null, "El " + datos[pos] + " si existe en el vector y ocupa la posición: " + pos);
				}else {JOptionPane.showMessageDialog(null, "El dato no existe en el vector");}
			}else{
				JOptionPane.showMessageDialog(null, "Sorry, vector vacio");
			}
		}



	public void LlenarVector(){
		Random Aleatorio = new Random();
		if(ultimo < tamano){
			for(int i =0; i < tamano; i++ ){
				datos[i] = Aleatorio.nextInt(100) +1;
			} ultimo = tamano-1;
		}else{
			JOptionPane.showMessageDialog(null, "Sorry, vector lleno");
		}

	}

	public void presentar1_N(){
		String salida="Los datos del vector\n";
		if(ultimo != -1){
		for(int i = 0; i <= ultimo; i++){
		salida = salida + datos[i]+ "\n";}
		JOptionPane.showMessageDialog(null, salida);
		}else{JOptionPane.showMessageDialog(null, "El vector esta vacio");}

	}
	public static void main (String[]args){
		MariselaClase app = new MariselaClase();
		app.LlenarVector();
		app.presentar1_N();
		app.Buscar();

	}
}
