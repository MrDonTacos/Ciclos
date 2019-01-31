import javax.swing.JOptionPane;
import java.util.Random;
public class Trabajo3{

final int NUM = 6;
int Vector[] = new int[NUM];
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
      Num = rd.nextInt(100) + 1;
      Vector[i] = Num;
    }
    Ultimo = NUM-1;
}
}

public void VerificarExistencia(){
  pos = -1;
  if (pos ==-1) {

  for (int i = 0; i <Vector.length && pos==-1 ; i++ ) {
    if(Num == Vector[i]){
       pos = i ;
       i = NUM;

  }
}
}
}

public void VectorVacio(){
  if(Ultimo==-1){
    JOptionPane.showMessageDialog(null, "Tu vector esta vacio");}
  else{}
  }

  public void UnoxUno(){
    if(Ultimo == NUM -1)
    {JOptionPane.showMessageDialog(null, "Tu vector esta lleno");}else{
    Let = JOptionPane.showInputDialog("Ingrese numero");
    Num = Integer.parseInt(Let);
    VerificarExistencia();
    if(pos!= -1){
      JOptionPane.showMessageDialog(null, "Tu numero ya esta en el vector esta en la pos ="+pos);
    }else if(Ultimo <=NUM){
      Vector[++Ultimo] = Num;
                }
}
}

  public void Almacenar(){
    if(Ultimo == NUM -1)
    {JOptionPane.showMessageDialog(null, "Tu vector esta lleno");}else{
      for (int i = 0; i<Vector.length; i++ ) {
      Let = JOptionPane.showInputDialog("Ingrese " + NUM + " numeros a guardar");
      Num = Integer.parseInt(Let);
      Vector[i] = Num;

    }Vectorlleno();

  }
}
  public void BuscarNum(){
      Let = JOptionPane.showInputDialog("Ingrese numero a buscar en el vector");
      Num = Integer.parseInt(Let);
      for (int i = 0; i <Vector.length ; i++ ) {
        if(Num == Vector[i]){
          JOptionPane.showMessageDialog(null, "Su numero es encuentra en la: " + (i + 1)  + " Posicion ascendente");
          pos=Vector[i];
          i =NUM;
        }
      } if(pos != Num){JOptionPane.showMessageDialog(null, "Su numero no existe en el vector... aun");}
  }

  public void Presentar0N(){
    String present = "Los datos de tu vector son: \n";
    for (int i = 0; i<Vector.length ; i++ ) {
      present = present + Vector[i] + "\n";
    }
    JOptionPane.showMessageDialog(null, present);
  }

  public void PresentarN0(){
    String present = "Los datos de tu vector son: \n";
    for (int i = NUM -1; i>=0; i-- ) {
      present = present + Vector[i] + "\n";
    }
    JOptionPane.showMessageDialog(null, present);
  }

  public void LimpiarArreglo(){
    for (int i=0; i<Vector.length; i++) {
      Vector[i]=0;
    }pos = -1; Ultimo = -1;
  }



  public void presentar(){
    String opcL = "";
    int opc = 0;
    do{
         opcL = JOptionPane.showInputDialog(null, "1. Generar numeros aleatorios \n 2. Ingresar numeros \n 3. Insertar numero uno a uno, verificando si ya existe en el vector \n 4. Presentar de 0 hasta N \n 5. Presentar de N hasta 0 \n 6. Buscar numero \n 7. Limpiar vector \n 8. Salir " );
    opc = Integer.parseInt(opcL);
    switch (opc) {
      case 1: random() ;break;
      case 2: Almacenar();break;
      case 3: UnoxUno();break;
      case 4: VectorVacio();if(Ultimo!=-1){Presentar0N();}break;
      case 5: VectorVacio();if(Ultimo!=-1){PresentarN0();}break;
      case 6: BuscarNum();break;
      case 7: LimpiarArreglo();break;
    }
  }while(opc >=1 && opc <=7);

  }

  public static void main (String[] args){
      Trabajo3 tr = new Trabajo3();

    tr.presentar();

  }

}
