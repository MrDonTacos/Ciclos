import javax.swing.JOptionPane;

 public class Musica{

 String Notas[] = {"DO",
 "DOS",
 "REB",
" RE",
 "RES",
 "MIB",
" MI",
 "FAB",
 "MIS",
" FA",
 "FAS",
 "SOLB",
 "SOL",
 "SOLS",
 "LAB",
" LA",
 "LAS",
 "SIB",
" SI",
 "DOB",
 "SIS" };
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



   public void Ingresar1Nota(){
     String Nota = "";
    Nota = JOptionPane.showInputDialog("Ingrese una nota");
    Nota = Nota.toUpperCase();
    for (int i = 0; i<NotasR.length ;i++ ) {
      if (NotasR[i].equals(Nota1)) {
        JOptionPane.showMessageDialog(null, "Tu nota esta en el vector");
      }else{

      }
    }

   }

   public void Ingresar2Nota(){
     String Nota = "";
    Nota = JOptionPane.showInputDialog("Ingrese una nota");
    Nota = Nota.toUpperCase();
    for (int i = 0; i<NotasR.length ;i++ ) {
      if (NotasR[i].equals(Nota1)) {
        JOptionPane.showMessageDialog(null, "Tu nota esta en el vector");
      }else{

      }
    }

   }

   public void CompararNotas(){


   }

   public void GenerarAcorde(){


   }

   public void AnalizarAcorde(){


   }

   public static void main(String[] args) {
     Musica ms = new Musica();
     ms.Ingresar1Nota();
     ms.Ingresar2Nota();
   }
 }
