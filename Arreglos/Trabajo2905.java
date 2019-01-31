import java.util.Random;
import javax.swing.JOptionPane;
public class Trabajo2905{

final int MAX = 3;
int Arreglo[][] = new int [MAX][MAX];
int Vector[] = new int [MAX];

  public void LlenarArreglo(){
  Random rd = new Random();
  for (int i=0;i<Arreglo.length ;i++ ) {
    for (int j=0;j<Arreglo.length ;j++ ) {
      Arreglo[i][j]=rd.nextInt(1) +1;
    }
  }

  }

public void LlenarVectorDiagonal(){
for (int i=0; i<Arreglo.length ; i++ ) {
  Vector[i] = Arreglo[i][i];
}
}

public void SumarMatriz(){
  int Suma =0;
for (int i=0; i<Arreglo.length ; i++ ) {
  for (int j=0; j<Vector.length ; j++ ) {
    Suma = Arreglo[i][j] + Suma;
  }
}JOptionPane.showMessageDialog(null, "La suma de tu matriz es: "+ Suma);
}

public void SumarVector(){
  int Suma = 0;
  String msg= "La suma de tus numeros ";
for (int i=0; i<Vector.length ; i++ ) {
  Suma = Vector[i] + Suma;
  msg = msg + Vector[i] + "  ";
}
msg = msg + " es: ";
JOptionPane.showMessageDialog(null, msg + Suma);
}

public void PresentarArreglo(){
String msg = "Tus numeros de la matriz son:" ;
for (int i=0;i<MAX ;i++) {
  msg = msg + "\n";
  for (int j=0;j<MAX;j++) {
    msg = msg + " " + Arreglo[i][j] + " ";
  }}JOptionPane.showMessageDialog(null, msg);
  }
  public void PresentarVector(){
    String msg= "Los numeros de tu vector son: ";
    for (int i= 0; i<Vector.length ; i++ ) {
      msg = msg + Vector[i] + "  ";
    } JOptionPane.showMessageDialog(null, msg);
  }

public void menu(){
String let="";
int Num=0;
do{
let = JOptionPane.showInputDialog("1. Llenar Matriz \n 2. Llenar Vector Diagonal \n 3.Sumar Matriz \n 4.Sumar Vector \n 5.Presentar Arreglo \n 6.Presentar Vector \n 7.Salir");
Num= Integer.parseInt(let);

switch (Num) {
  case 1: LlenarArreglo() ;break;
  case 2: LlenarVectorDiagonal();break;
  case 3: SumarMatriz() ;break;
  case 4: SumarVector();break;
  case 5: PresentarArreglo();break;
  case 6: PresentarVector();break;
}
}while (Num!=7);
}







  public static void main(String[] args) {
    Trabajo2905 tr = new Trabajo2905();
    tr.menu();
  }
}
