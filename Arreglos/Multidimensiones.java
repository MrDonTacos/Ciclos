import javax.swing.JOptionPane;
import java.util.Random;
public class Multidimensiones{

final int MAX = 3;
int Vector[]=new int [MAX];
int Arreglo[][] = new int [MAX][MAX];

public void LlenarArreglo(){
Random rd = new Random();
for (int i=0;i<MAX ;i++ ) {
  for (int j=0;j<MAX ;j++ ) {
    Arreglo[i][j]=rd.nextInt(10) +1;
  }
}

}

public void SumarDimensiones(){
  int Acumulador = 0;
  for (int i=0; i<MAX ;i++ ) {
  for (int j=0; j<MAX;j++ ) {
    Vector[i] = Arreglo[i][j] + Acumulador;
    Acumulador=Vector[i];
  } Acumulador =0;
  }

}

public void PresentarArreglo(){
  LlenarArreglo();
  String msg = "Tus numeros de la matriz son:" ;
  for (int i=0;i<MAX ;i++) {
    msg = msg + "\n";
    for (int j=0;j<MAX;j++) {
      msg = msg + " " + Arreglo[i][j] + " ";
    }

  }JOptionPane.showMessageDialog(null, msg);
}

public void PresentarMatriz(){
  SumarDimensiones();
String msg = "Tus numeros sumados son: ";
for (int i=0;i<MAX ;i++ ) {
  msg = msg + Vector[i] + " ";
}
  JOptionPane.showMessageDialog(null, msg);
}

public static void main(String[] args) {
  Multidimensiones obj = new Multidimensiones();
  obj.PresentarArreglo();
  obj.PresentarMatriz();
}

}
