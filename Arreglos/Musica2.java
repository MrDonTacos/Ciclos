import javax.swing.JOptionPane;
public class Musica2{
  String NotasR[] = {"DO",
  "DO#",
  "REB",
  "RE",
  "RE#",
  "MIB",
  "MI",
  "FAB",
  "MI#",
  "FA",
  "FA#",
  "SOLB",
  "SOL",
  "SOL#",
  "LAB",
  "LA",
  "LA#",
  "SIB",
  "SI",
  "DOB",
  "SI#"};
int Tonica = 10;
int num=0;
String vector[] = new String[1];
String vector2[] = new String[1];

public void Asignar(){
  case()
}

public void PrimeraNota(){
  vector[0] = JOptionPane.showInputDialog("Inserte primera nota");
  vector[0] = vector[0].toUpperCase();
}

public void SegundaNota(){
  vector2[0] = JOptionPane.showInputDialog("Inserte segunda nota");
  vector2[0] = vector2[0].toUpperCase();
}

public void Asignacion(){
  for (int i=0; i <NotasR.length ; i++ ) {
    if (NotasR[i].equals(vector[0].trim())) {
      JOptionPane.showMessageDialog(null, "Tu primera nota es: " + vector[0]);
    }
  }
}

public void Calcular(){

}

public void menu(){
do {
  num = Integer.parseInt(JOptionPane.showInputDialog(" 1. Ingresar primera nota \n 2. Ingresar segunda nota \n 3. Calcular intervalos entre ambas notas \n 4. Salir"));
  switch(num){
    case 1: PrimeraNota() ;break;
    case 2: SegundaNota() ;break;
    case 3: Asignacion() ;break;
  }
} while (num!=4);

}

  public static void main(String[] args) {
    Musica2 m2 = new Musica2();
    m2.menu();
  }
}
