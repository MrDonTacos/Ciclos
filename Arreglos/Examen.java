import javax.swing.JOptionPane;
public class Examen{

int Pos= 0;
int Num = 0;
String Let = "";
public void LeerNumero(){

Let = JOptionPane.showInputDialog("Inserte numero");
Num = Integer.parseInt(Let);

}

public void CalcularNumeros(){
  do {
    Num = Num/10;
    if(Num >= 1){
      Pos = Pos + 1;
    }
  } while (Num>1); Pos = Pos + 1;
}
public void Presentar(){
  LeerNumero();
  CalcularNumeros();
  JOptionPane.showMessageDialog(null, "La cantidad de digitos que tiene tu número es: " + Pos);

}

public static void main(String[] args) {
Examen obj = new Examen();
  obj.Presentar();
}


}
