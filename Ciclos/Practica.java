import javax.swing.JOptionPane;
public class Practica {

  String Let =  "";
  int Num = 0;
  int Suma = 0;

  public void InsertarNum(){
    Let = JOptionPane.showInputDialog("Inserte Numero");
    Num = Integer.parseInt(Let);
  }

  public void OperacionNum(){
    String msn = "Tus numeros divisores son: ";
    for (int i=1; i<Num ;i++ ) {
      if(Num % i == 0){
        msn = msn + ", " + i;
        Suma = Suma + i;
      }
    }
      JOptionPane.showMessageDialog(null, msn);
      if(Suma == Num){
        JOptionPane.showMessageDialog(null, "La suma de los divisores de tu numeros es: " + Suma + " Por lo tanto tu numero es perfecto");
      }else{ JOptionPane.showMessageDialog(null, "La suma de los divisores de tu numero es: " + Suma + " Por lo tanto no es perfecto");}

  }
    public static void main(String[] args) {
      Practica obj = new Practica();
      obj.InsertarNum();
      obj.OperacionNum();
    }
}
