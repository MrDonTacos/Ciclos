import javax.swing.JOptionPane;
import java.util.Random;
public class Tarea2{

final int NUM = 3;
int Vector[][] = new int[NUM][NUM];
int Num = 0;
int pos= -1;
String Let = "";
int Ultimo = -1;


public void Vectorlleno(){
  Ultimo = NUM-1;
}


  public void random(){
    if(Ultimo == NUM -1)
    {JOptionPane.showMessageDialog(null, "Tu vector esta lleno");}else{
    Random rd = new Random();
    for (int i =Ultimo+1; i<Vector.length;i++ ) {
      for (int j=Ultimo+1; j<Vector.length ;j++ ) {
        Num = rd.nextInt(100) + 1;
        Vector[i][j] = Num;
      }

    }
    Ultimo = NUM-1;
}
}

public void SumarDiagonalmente(){
  int Diagonal =0;
  String msg = "La suma de tus numeros: ";
  for (int i=0; i<Vector.length ; i++ ) {
    for (int j=0; j<Vector.length ; j++ ) {
      if(i==j){
        msg = msg + Vector[i][j] + "  ";
        Diagonal = Vector[i][j] + Diagonal;
      }
    }
  }msg = msg + " es: " + Diagonal;
  JOptionPane.showMessageDialog(null, msg);
}

public void VectorVacio(){
  if(Ultimo==-1){
    JOptionPane.showMessageDialog(null, "Tu vector esta vacio");}
  else{}
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


  public void Almacenar(){
    if(Ultimo == NUM -1)
    {JOptionPane.showMessageDialog(null, "Tu vector esta lleno");}else{
      for (int i = 0; i<Vector.length; i++ ) {
        for (int j=0; j<Vector.length; j++ ) {
          Let = JOptionPane.showInputDialog("Ingrese " + NUM + " veces " + NUM + " numeros a guardar");
          Num = Integer.parseInt(Let);
          Vector[i][j] = Num;
        }


    }Vectorlleno();

  }
}
  public void BuscarNum(){
      Let = JOptionPane.showInputDialog("Ingrese numero a buscar en el vector");
      Num = Integer.parseInt(Let);
      for (int i = 0; i <Vector.length ; i++ ) {
        for (int j=0; j<Vector.length ;j++ ) {
          if(Num == Vector[i][j]){
            JOptionPane.showMessageDialog(null, "Su numero es encuentra en la: " + (i+1) + "," + (j+1) );
            pos=Vector[i][j];
            i =NUM;
            j =NUM;
        }
        }
      } if(pos != Num){JOptionPane.showMessageDialog(null, "Su numero no existe en el vector... aun");}
  }

  public void Presentar0N(){
    String present = "Los datos de tu vector son: \n";
    for (int i = 0; i<Vector.length ; i++ ) {
      for (int j=0; j<Vector.length ; j++ ) {
      present = present + Vector[i][j] + "  ";
      }
      present = present + "\n";
    }
    JOptionPane.showMessageDialog(null, present);
  }

  public void PresentarN0(){
    String present = "Los datos de tu vector son: \n";
    for (int i = NUM -1; i>=0; i-- ) {
      for (int j=NUM-1; j>=0 ;j-- ) {
      present = present + Vector[i][j] + "  ";
      }
      present = present + "\n";
    }
    JOptionPane.showMessageDialog(null, present);
  }

  public void LimpiarArreglo(){
    for (int i=0; i<Vector.length; i++) {
      for (int j=0;j<Vector.length ; j++ ) {
        Vector[i][j]=0;

      }
    }pos = -1; Ultimo = -1;
  }

  public void presentar(){
    String opcL = "";
    int opc = 0;
    do{
         opcL = JOptionPane.showInputDialog(null, "1. Generar numeros aleatorios \n 2. Ingresar numeros \n 3. Sumar Diagonal y presentar \n 4. Presentar de 0 hasta N \n 5. Presentar de N hasta 0 \n 6. Buscar numero \n 7. Limpiar vector \n 8. Salir " );
    opc = Integer.parseInt(opcL);
    switch (opc) {
      case 1: random() ;break;
      case 2: Almacenar();break;
      case 3: SumarDiagonalmente();break;
      case 4: VectorVacio();if(Ultimo!=-1){Presentar0N();}break;
      case 5: VectorVacio();if(Ultimo!=-1){PresentarN0();}break;
      case 6: BuscarNum();break;
      case 7: LimpiarArreglo();break;
    }
  }while(opc >=1 && opc <=7);

  }

  public static void main (String[] args){
      Tarea2 tr = new Tarea2();

    tr.presentar();

  }

}
